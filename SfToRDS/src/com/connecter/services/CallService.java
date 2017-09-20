package com.connecter.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.connecter.bean.CallBean;
import com.connecter.bean.Scored_CallBean;
import com.connecter.dao.CallDao;
import com.connecter.mappingbean.CallMappingBean;
import com.connecter.subjects.CallSubject;

@Service
public class CallService{

	@Autowired
	MappingServices mappingService;

	@Autowired
	private CallDao callDao;
	
	public String addCall(CallMappingBean callMappingBean){
		return ((CallDao)callDao).save(callMappingBean);
	}
	
	public void deleteCall(CallMappingBean callMappingBean){
		((CallDao)callDao).delete(callMappingBean);
	}

	public void updateCall(CallMappingBean callMappingBean) throws Exception {
		((CallDao)callDao).updateCalls(callMappingBean);
	}
	
	public void updateCalls(List<CallBean> callBeanList) throws Exception {
		((CallDao)callDao).updateCall(callBeanList);
	}

	public List<CallBean> getSelected(final CallBean callBean) {
		List<CallBean> finalCallBeanList = new ArrayList<CallBean>();
		List<CallMappingBean> callMappingBeanList = null;
		CallMappingBean callMappingBean = null;

		try {
			callMappingBean = mappingService.getCallMappingObject(callBean);
			System.out.println("in service  : " + callMappingBean.getId());
			callMappingBeanList = ((CallDao)callDao).getSelected(callMappingBean);
		} catch (Exception e) {

			e.printStackTrace();
		}
		CallBean callBean2;
		for (CallMappingBean mappingBean : callMappingBeanList) {
			try {
				callBean2 = mappingService.getCallObject(mappingBean);
				finalCallBeanList.add(callBean2);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		return finalCallBeanList;
	}

	public void updateLatestScored_Call(Scored_CallBean scored_CallBean) {
		((CallDao)callDao).changeLatestScored_Call(scored_CallBean);
	}

}
