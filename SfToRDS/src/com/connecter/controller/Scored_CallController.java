package com.connecter.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.connecter.bean.Scored_CallBean;
import com.connecter.bean.Scored_CallListBean;
import com.connecter.mappingbean.Scored_CallMappingBean;
import com.connecter.services.Scored_CallService;
import com.connecter.services.MappingServices;

@RestController
public class Scored_CallController {
	@Autowired
	MappingServices mappingService;

	@Autowired
	Scored_CallService scored_CallService;

	@RequestMapping(value = "/ws/scored_Call/ping", method = RequestMethod.GET)
	public @ResponseBody Boolean testConnection() {
		System.out.println("Scored_Call Reach to test method");
		return Boolean.TRUE;
	}

	@RequestMapping(value = "/ws/scored_Call/addScored_Calls", method = RequestMethod.POST)
	public @ResponseBody List<String> addScored_Calls(@RequestBody Scored_CallListBean scored_CallBeanList) {
		List<String> insertedScored_CallList = new ArrayList<String>();
		try {
			//System.out.println(scored_CallBeanList.Scored_CallList.get(0).getBulk_Import__c());
			
			for (Scored_CallBean scored_CallBean : scored_CallBeanList.getScored_CallList()) {
				//System.out.println(scored_CallBean.getBulk_Import__c());
				//System.out.println(scored_CallBean.getScored_CallerName__c());
				System.out.println("in score "+scored_CallBean.getCall_Type__c());
				String id = scored_CallService.addScored_Calls(scored_CallBean);
				//Scored_CallMappingBean scored_CallMappingBean = mappingService.getScored_CallMappingObject(scored_CallBean);
				//String id = (String) scored_CallService.save(scored_CallMappingBean);
				insertedScored_CallList.add(id);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return insertedScored_CallList;
	}
	
	@RequestMapping(value = "/ws/scored_Call/selectScored_Calls", method = RequestMethod.POST)
	public @ResponseBody List<Scored_CallBean> selectScored_Calls(@RequestBody Scored_CallBean scored_CallBean) {
		System.out.println("in controller : "+scored_CallBean.getId());
		List<Scored_CallBean> selectedScored_CallList = new ArrayList<Scored_CallBean>();
		selectedScored_CallList = scored_CallService.getSelected(scored_CallBean);
		return selectedScored_CallList;
	}
	
	@RequestMapping(value = "/ws/scored_Call/selectScored_Call", method = RequestMethod.POST)
	public @ResponseBody List<Map<String,Object>> selectFormulaScored_Calls(@RequestBody Scored_CallBean scored_CallBean) {
		System.out.println("in controller : "+scored_CallBean.getId());
		List<Map<String,Object>> selectedScored_CallList = new ArrayList<Map<String,Object>>();
		selectedScored_CallList = scored_CallService.getFormulaSelected(scored_CallBean);
		return selectedScored_CallList;
	}

	@RequestMapping(value = "/ws/scored_Call/deleteScored_Calls", method = RequestMethod.POST)
	public @ResponseBody List<String> deleteScored_Calls(@RequestBody Scored_CallListBean scored_CallBeanList) {
		List<String> deletedScored_CallList = new ArrayList<String>();
		for (Scored_CallBean scored_CallBean : scored_CallBeanList.getScored_CallList()) {
			try {
				Scored_CallMappingBean scored_CallMappingBean = mappingService.getScored_CallMappingObject(scored_CallBean);
				scored_CallService.delete(scored_CallMappingBean);
				deletedScored_CallList.add("{result : success , Id :" + scored_CallBean.getId() + " }");
			} catch (Exception e) {
				e.printStackTrace();
				deletedScored_CallList
						.add("{result : failure, Id : " + scored_CallBean.getId() + ", Error : " + e.getMessage() + "}");
			}
			// insertedScored_CallList.add(id);
		}

		return deletedScored_CallList;
	}

	@RequestMapping(value = "/ws/scored_Call/updateScored_Calls", method = RequestMethod.POST)
	public @ResponseBody List<String> updateScored_Calls(@RequestBody Scored_CallListBean scored_CallBeanList) {
		List<String> updatedScored_CallList = new ArrayList<String>();

		//System.out.println(scored_CallBeanList.Scored_CallList.get(0).getScored_CallerName__c());
		if (scored_CallBeanList != null) {
			for (Scored_CallBean scored_CallBean : scored_CallBeanList.getScored_CallList()) {
				try {
					Scored_CallMappingBean scored_CallMappingBean = mappingService.getScored_CallMappingObject(scored_CallBean);
					scored_CallService.updateScored_Call(scored_CallMappingBean);
					updatedScored_CallList.add("{result : success , Id :" + scored_CallBean.getId() + " }");
				} catch (Exception e) {
					e.printStackTrace();
					updatedScored_CallList
							.add("{result : failure, Id : " + scored_CallBean.getId() + ", Error : " + e.getMessage() + "}");
				}
			}
		}

		return updatedScored_CallList;
	}
}
