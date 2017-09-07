package com.connecter.services;

import java.util.List;

import com.connecter.dao.BaseDao;

abstract public class BaseService {
	
	public <T> String save(final T o) {
		return  (String)getDao().save(o);
	}

	
	public void delete(final Object object) {
		getDao().delete(object);
	}

	/***/
	
	public <T> T get(final Class<T> type, final Long id) {
		return (T) getDao().get(type, id);
	}

	
	public <T> T merge(final T o) {
		return (T) getDao().merge(o);
	}
	
	
	public <T> void update(final T o) {
		getDao().update(o);
	}

	
	public <T> void saveOrUpdate(final T o) {
		getDao().saveOrUpdate(o);
	}

	
	public <T> List<T> getAll(final Class<T> o) {
		return getDao().getAll(o);
	}
	
	protected abstract BaseDao getDao();
	
}
