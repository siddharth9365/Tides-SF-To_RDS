package com.connecter.observers;

import java.util.List;

import com.connecter.bean.CallBean;

public interface CallObserver {
	public void insertOrUpdate(List<CallBean> callBeanList,Boolean isInsert,Boolean isUpdate,Boolean isBefore,Boolean isAfter);
}
