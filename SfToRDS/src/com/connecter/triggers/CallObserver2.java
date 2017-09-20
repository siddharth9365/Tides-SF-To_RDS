package com.connecter.triggers;

import java.util.List;

import com.connecter.bean.CallBean;
import com.connecter.dao.BaseDao;
import com.connecter.observers.CallObserver;

public class CallObserver2 extends BaseDao implements CallObserver {

	@Override
	public void insertOrUpdate(List<CallBean> callBeanList, Boolean isInsert, Boolean isUpdate, Boolean isBefore,
			Boolean isAfter) {
		System.out.println("observer 2 called....");
	}

}
