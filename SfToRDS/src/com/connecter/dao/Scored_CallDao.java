package com.connecter.dao;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.connecter.bean.CallBean;
import com.connecter.bean.Scored_CallBean;
import com.connecter.mappingbean.FormulaMappingBean;
import com.connecter.mappingbean.ObjectMappinBean;
import com.connecter.mappingbean.Scored_CallMappingBean;
import com.connecter.observers.CallObserver;
import com.connecter.services.CallService;
import com.connecter.services.MappingServices;
import com.connecter.util.FormulaDecoding;

@Repository(value="Scored_CallDao")
public class Scored_CallDao extends BaseDao{
	@Autowired
	private CallService callService;

	@Autowired
	private MappingServices mappingService;

	@Transactional
	public List<Scored_CallMappingBean> getSelected(final Scored_CallMappingBean scored_CallMappingBean)
			throws IllegalArgumentException, IllegalAccessException {
		final Session session = getSession();
		final Criteria crit = session.createCriteria(Scored_CallMappingBean.class);
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		for (Field f : scored_CallMappingBean.getClass().getFields()) {
			System.out.println("out : " + f.getName() + " value : " + f.get(scored_CallMappingBean));
			if (f.get(scored_CallMappingBean) != null) {
				System.out.println("in : " + f.getName());
				crit.add(Restrictions.eq(f.getName(), f.get(scored_CallMappingBean)));
			}
		}
		return crit.list();
	}

	@Transactional
	public List<Map<String,Object>> getFormulaSelected(final Scored_CallMappingBean scored_CallMappingBean,
			String tableName) throws IllegalArgumentException, IllegalAccessException {
		final Session session = getSession();
		final Criteria crit = session.createCriteria(Scored_CallMappingBean.class);
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		for (Field f : scored_CallMappingBean.getClass().getFields()) {
			System.out.println("out : " + f.getName() + " value : " + f.get(scored_CallMappingBean));
			if (f.get(scored_CallMappingBean) != null) {
				System.out.println("in : " + f.getName());
				crit.add(Restrictions.eq(f.getName(), f.get(scored_CallMappingBean)));
			}
		}
		List<Scored_CallMappingBean> scored_CallList = crit.list();
		Map<String, String> objectMap = new HashMap<String, String>();
		final Criteria crit0 = session.createCriteria(ObjectMappinBean.class);
		List<ObjectMappinBean> objectMappinList = crit0.list();
		for (ObjectMappinBean objectMappinBean : objectMappinList) {
			objectMap.put(objectMappinBean.getRelationName(), objectMappinBean.getAPIName());
		}
		System.out.println(objectMap);

		final Criteria crit1 = session.createCriteria(FormulaMappingBean.class);
		crit1.add(Restrictions.eq("objectName", tableName));
		List<FormulaMappingBean> formulaMappingList = crit1.list();
		List<Map<String,Object>> fieldMapList = new ArrayList<Map<String,Object>>();
		Map<String, Object> fieldMap;
		for (Scored_CallMappingBean scored_CallMappingBean1 : scored_CallList) {
			fieldMap = new HashMap<String, Object>();
			Field[] f = scored_CallMappingBean1.getClass().getDeclaredFields();
			for (FormulaMappingBean formulaMappingBean : formulaMappingList) {
				Map<String, String> tableFieldMap = FormulaDecoding.getDecodedField(formulaMappingBean.getFormula());
				for (Field temp : f) {
					if (temp.getName().equalsIgnoreCase(formulaMappingBean.getLookupName())) {
						System.out.println(tableFieldMap.get("relationName"));
						String sql = "SELECT " + tableFieldMap.get("fieldName") + " FROM "
								+ objectMap.get(tableFieldMap.get("relationName").toLowerCase()) + " WHERE id = "+temp.get(scored_CallMappingBean);
						List<Object[]> results = session.createSQLQuery(sql).list();
						System.out.println("dfdfffdfdfdfdfd"+results);
						results.stream().forEach((record) -> {
							try {
								temp.set(scored_CallMappingBean, record);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						});
						fieldMap.put(temp.getName(), temp.get(scored_CallMappingBean));
					}else{
						fieldMap.put(temp.getName(), temp.get(scored_CallMappingBean));
					}

				}
			}
			fieldMapList.add(fieldMap);
		}
		return fieldMapList;
	}

	@Transactional
	public void updateScored_Calls(final Scored_CallMappingBean scored_CallMappingBean) throws Exception {
		Scored_CallMappingBean mappingBean = (Scored_CallMappingBean) getSession().get(Scored_CallMappingBean.class,
				scored_CallMappingBean.getId());
		// System.out.println(scored_CallMappingBean.getId());
		if (mappingBean != null) {
			for (Field f : scored_CallMappingBean.getClass().getFields()) {
				if (f.get(scored_CallMappingBean) != null) {
					Field tempField = mappingBean.getClass().getField(f.getName());
					tempField.set(mappingBean, f.get(scored_CallMappingBean));
				}
			}
		}
		update(mappingBean);
		changeStatus(scored_CallMappingBean);
	}

	@Transactional
	public String addCalls(Scored_CallMappingBean scored_CallMappingBean) {
		final Session session = getSession();
		String id = (String) session.save(scored_CallMappingBean);
		changeStatus(scored_CallMappingBean);
		return id;
	}

	public void changeStatus(Scored_CallMappingBean scored_CallMappingBean) {
		final Criteria crit = getSession().createCriteria(Scored_CallMappingBean.class);
		crit.add(Restrictions.eq("Call__c", scored_CallMappingBean.getCall__c()));
		crit.addOrder(Order.desc("CreatedDate"));
		List<Scored_CallMappingBean> scored_CallMappingList = crit.list();
		if (scored_CallMappingList.size() > 0) {
			for (Scored_CallMappingBean callMappingBean : scored_CallMappingList) {
				callMappingBean.Is_latest_scored__c = 0;
				update(callMappingBean);
			}
			Scored_CallMappingBean scored_CallMappingBeanTemp = scored_CallMappingList.get(0);
			scored_CallMappingBeanTemp.Is_latest_scored__c = 1;
			update(scored_CallMappingBeanTemp);
			try {
				Scored_CallBean scored_CallBean = mappingService.getScored_CallObject(scored_CallMappingBeanTemp);
				callService.updateLatestScored_Call(scored_CallBean);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			scored_CallMappingBean.Is_latest_scored__c = 1;
			update(scored_CallMappingBean);
		}
	}

}
