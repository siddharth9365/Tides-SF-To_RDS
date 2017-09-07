package com.connecter.dao;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.connecter.bean.CallBean;
import com.connecter.mappingbean.CallMappingBean;

@Repository
public class CallDao extends BaseDao{

	@Transactional
	public List<CallMappingBean> getSelected(final CallMappingBean callMappingBean) throws IllegalArgumentException, IllegalAccessException {
		final Session session = getSession();
		final Criteria crit = session.createCriteria(CallMappingBean.class);
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		for(Field f : callMappingBean.getClass().getFields()){
			System.out.println("out : "+f.getName() +" value : "+f.get(callMappingBean));
			if(f.get(callMappingBean)!=null){
				System.out.println("in : " + f.getName());
				crit.add(Restrictions.eq(f.getName(), f.get(callMappingBean)));
			}
		}
		//crit.add(Restrictions.in("Id", callIdList));
		
//		Criterion ct = (Criterion) callBeanList;
//		crit.add(Restrictions.conjunction(ct));
		return crit.list();
	}
	
	@Transactional
	public void updateCalls(CallMappingBean callMappingBean) throws Exception{
		CallMappingBean mappingBean = (CallMappingBean) getSession().get(CallMappingBean.class,callMappingBean.getId());
		for(Field f : callMappingBean.getClass().getFields()){
			if(f.get(callMappingBean)!=null){
				Field tempField = mappingBean.getClass().getField(f.getName());
				tempField.set(mappingBean,f.get(callMappingBean));
			}
		}
		update(mappingBean);
	}
}
