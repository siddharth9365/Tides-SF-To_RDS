package com.connecter.dao;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.connecter.bean.CallBean;
import com.connecter.bean.Scored_CallBean;
import com.connecter.mappingbean.CallMappingBean;
import com.connecter.observers.CallObserver;
import com.connecter.services.MappingServices;
import com.connecter.subjects.CallSubject;
import com.connecter.triggers.CallChangeNumbers;


@Service
public class CallDao extends BaseDao implements CallSubject {
	private static ArrayList<CallObserver> callObserverList = new ArrayList<CallObserver>();
	List<CallBean> callBeanList;
	private Boolean isInsert = false;
	private Boolean isUpdate = false;
	private Boolean isBefore = false;
	private Boolean isAfter = false;
	@Autowired
	MappingServices mappingService;

	@Transactional
	public List<CallMappingBean> getSelected(final CallMappingBean callMappingBean)
			throws IllegalArgumentException, IllegalAccessException {
		final Session session = getSession();
		final Criteria crit = session.createCriteria(CallMappingBean.class);
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		for (Field f : callMappingBean.getClass().getFields()) {
			System.out.println("out : " + f.getName() + " value : " + f.get(callMappingBean));
			if (f.get(callMappingBean) != null) {
				System.out.println("in : " + f.getName());
				crit.add(Restrictions.eq(f.getName(), f.get(callMappingBean)));
			}
		}
		return crit.list();
	}

	@Transactional
	public void updateCall(List<CallBean> callBeanList) throws Exception {
		System.out.println("list : "+callBeanList.size());
		if (callBeanList != null) {
			this.callBeanList = callBeanList;
			if (!isUpdate) {
				isUpdate = true;
				isBefore = true;
				isInsert = false;
				isAfter = false;
				notifyCallObservers();
				isUpdate = false;
				isBefore = false;
				isInsert = false;
				isAfter = false;
			}
			List<CallMappingBean> mappingBeanList = new ArrayList<CallMappingBean>();
			for (CallBean callBean : callBeanList) {
				CallMappingBean callMappingBean = mappingService.getCallMappingObject(callBean);
				System.out.println("in dao id : " + callMappingBean.getId());
				CallMappingBean mappingBean = (CallMappingBean) getSession().get(CallMappingBean.class,
						callMappingBean.getId());

				if (mappingBean != null) {
					for (Field f : callMappingBean.getClass().getFields()) {
						if (f.get(callMappingBean) != null) {
							System.out.println("in rflection id : " + mappingBean.getId());
							Field tempField = mappingBean.getClass().getField(f.getName());
							tempField.set(mappingBean, f.get(callMappingBean));
						}
					}
				}
				update(mappingBean);
				mappingBeanList.add(mappingBean);
			}
			this.callBeanList = mappingService.getCallObjectList(mappingBeanList);
			System.out.println("list : "+callBeanList.size());
			if (!isUpdate) {
				isUpdate = true;
				isAfter = true;
				isBefore = false;
				isInsert = false;
				notifyCallObservers();
				isUpdate = false;
				isAfter = false;
				isBefore = false;
				isInsert = false;
			}
		}
	}

	@Transactional
	public void updateCalls(CallMappingBean callMappingBean) throws Exception {
		CallMappingBean mappingBean = (CallMappingBean) getSession().get(CallMappingBean.class,
				callMappingBean.getId());
		if (mappingBean != null) {
			for (Field f : callMappingBean.getClass().getFields()) {
				if (f.get(callMappingBean) != null) {
					Field tempField = mappingBean.getClass().getField(f.getName());
					tempField.set(mappingBean, f.get(callMappingBean));
				}
			}
		}
		update(mappingBean);
	}

	@Transactional
	public void changeLatestScored_Call(Scored_CallBean scored_CallBean) {
		final Session session = getSession();
		CallMappingBean callMappingBean = (CallMappingBean) session.get(CallMappingBean.class,
				scored_CallBean.getCall__c());
		callMappingBean.Latest_Scored_Call__c = scored_CallBean.getId();
		update(callMappingBean);
	}

	@Override
	public void registerObserver(CallObserver callObserver) {
		// TODO Auto-generated method stub
		callObserverList.add(callObserver);

	}

	@Override
	public void removeObserver(CallObserver callObserver) {
		// TODO Auto-generated method stub
		callObserverList.remove(callObserver);
	}

	@Override
	public void notifyCallObservers() {
		// TODO Auto-generated method stub
		for (CallObserver callObserver : callObserverList) {
			callObserver.insertOrUpdate(callBeanList, isInsert, isUpdate, isBefore, isAfter);
		}

	}
}
