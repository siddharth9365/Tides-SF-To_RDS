package com.connecter.dao;

import java.lang.reflect.Field;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.connecter.mappingbean.Scored_CallMappingBean;

@Repository
public class Scored_CallDao extends BaseDao {
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
		// crit.add(Restrictions.in("Id", Scored_CallIdList));

		// Criterion ct = (Criterion) Scored_CallBeanList;
		// crit.add(Restrictions.conjunction(ct));
		return crit.list();
	}

	@Transactional
	public void updateScored_Calls(final Scored_CallMappingBean scored_CallMappingBean) throws Exception {
		Scored_CallMappingBean mappingBean = (Scored_CallMappingBean) getSession().get(Scored_CallMappingBean.class,
				scored_CallMappingBean.getId());
		for (Field f : scored_CallMappingBean.getClass().getFields()) {
			if (f.get(scored_CallMappingBean) != null) {
				Field tempField = mappingBean.getClass().getField(f.getName());
				tempField.set(mappingBean, f.get(scored_CallMappingBean));
			}
		}
		update(mappingBean);
	}
}
