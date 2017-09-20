package com.connecter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.connecter.bean.CallBean;
import com.connecter.bean.CallListBean;
import com.connecter.mappingbean.CallMappingBean;
import com.connecter.services.CallService;
import com.connecter.services.MappingServices;

@RestController
public class CallController {

	@Autowired
	MappingServices mappingService;

	@Autowired
	CallService callService;

	@RequestMapping(value = "/ws/call/ping", method = RequestMethod.GET)
	public @ResponseBody Boolean testConnection() {
		System.out.println("Call Reach to test method");
		return Boolean.TRUE;
	}

	@RequestMapping(value = "/ws/call/addCalls", method = RequestMethod.POST)
	public @ResponseBody List<String> addCalls(@RequestBody CallListBean callBeanList) {
		List<String> insertedCallList = new ArrayList<String>();
		try {
			//System.out.println(callBeanList.CallList.get(0).getBulk_Import__c());
			for (CallBean callBean : callBeanList.getCallList()) {
				System.out.println("add : "+callBean.getCallers_Phone_Number__c());
				CallMappingBean callMappingBean = mappingService.getCallMappingObject(callBean);
				String id = (String) callService.addCall(callMappingBean);
				insertedCallList.add(id);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return insertedCallList;
	}
	
	@RequestMapping(value = "/ws/call/selectCalls", method = RequestMethod.POST)
	public @ResponseBody List<CallBean> selectCalls(@RequestBody CallBean callBean) {
		System.out.println("in controller : "+callBean.getId());
		List<CallBean> selectedCallList = new ArrayList<CallBean>();
		selectedCallList = callService.getSelected(callBean);
		return selectedCallList;
	}

	@RequestMapping(value = "/ws/call/deleteCalls", method = RequestMethod.POST)
	public @ResponseBody List<String> deleteCalls(@RequestBody CallListBean callBeanList) {
		List<String> deletedCallList = new ArrayList<String>();
		for (CallBean callBean : callBeanList.getCallList()) {
			try {
				CallMappingBean callMappingBean = mappingService.getCallMappingObject(callBean);
				callService.deleteCall(callMappingBean);
				deletedCallList.add("{result : success , Id :" + callBean.getId() + " }");
			} catch (Exception e) {
				e.printStackTrace();
				deletedCallList
						.add("{result : failure, Id : " + callBean.getId() + ", Error : " + e.getMessage() + "}");
			}
			// insertedCallList.add(id);
		}

		return deletedCallList;
	}

	@RequestMapping(value = "/ws/call/updateCalls", method = RequestMethod.POST)
	public @ResponseBody List<String> updateCalls(@RequestBody CallListBean callBeanList) {
		List<String> updatedCallList = new ArrayList<String>();

		//System.out.println(callBeanList.CallList.get(0).getCallerName__c());
		if (callBeanList != null) {
			for (CallBean callBean : callBeanList.getCallList()) {
				try {
					CallMappingBean callMappingBean = mappingService.getCallMappingObject(callBean);
					callService.updateCall(callMappingBean);
					updatedCallList.add("{result : success , Id :" + callBean.getId() + " }");
				} catch (Exception e) {
					e.printStackTrace();
					updatedCallList
							.add("{result : failure, Id : " + callBean.getId() + ", Error : " + e.getMessage() + "}");
				}
			}
		}

		return updatedCallList;
	}
	
	@RequestMapping(value = "/ws/call/updateCall", method = RequestMethod.POST)
	public @ResponseBody List<String> updateCall(@RequestBody CallListBean callBeanList) {
		List<String> updatedCallList = new ArrayList<String>();

		//System.out.println(callBeanList.CallList.get(0).getCallerName__c());
		if (callBeanList != null) {
			try {
				callService.updateCalls(callBeanList.getCallList());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return updatedCallList;
	}

}
