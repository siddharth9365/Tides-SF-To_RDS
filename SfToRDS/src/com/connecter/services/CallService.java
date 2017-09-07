package com.connecter.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connecter.bean.CallBean;
import com.connecter.dao.BaseDao;
import com.connecter.dao.CallDao;
import com.connecter.mappingbean.CallMappingBean;

@Service
public class CallService extends BaseService {

	@Autowired
	MappingServices mappingService;

	@Autowired
	private CallDao callDao;

	@Override
	protected BaseDao getDao() {
		// TODO Auto-generated method stub
		return callDao;
	}
	public void updateCall(CallMappingBean callMappingBean) throws Exception{
		callDao.updateCalls(callMappingBean);
	}

	public List<CallBean> getSelected(final CallBean callBean) {
		List<CallBean> finalCallBeanList = new ArrayList<CallBean>();
		List<CallMappingBean> callMappingBeanList = null;
		CallMappingBean callMappingBean = null;

		try {
			callMappingBean = mappingService.getCallMappingObject(callBean);
			System.out.println("in service  : "+callMappingBean.getId());
			callMappingBeanList = callDao.getSelected(callMappingBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CallBean callBean2;
		for (CallMappingBean mappingBean : callMappingBeanList) {
			try {
				callBean2 = mappingService.getCallObject(mappingBean);
				finalCallBeanList.add(callBean2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return finalCallBeanList;
	}

}
