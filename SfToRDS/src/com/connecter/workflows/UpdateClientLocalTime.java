package com.connecter.workflows;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.connecter.bean.CallBean;
import com.connecter.dao.CallDao;
import com.connecter.observers.CallObserver;
import com.connecter.subjects.CallSubject;

@Service
public class UpdateClientLocalTime implements CallObserver {

	private CallDao callDao;

	public UpdateClientLocalTime(CallDao callDao){
		this.callDao = callDao;
	}
	
	@PostConstruct
	public void doInit(){
		System.out.println("Initialized "+ this.getClass().getName());
		System.out.println(callDao);
		System.out.println("call dao : "+((CallDao)callDao));
	}
	
	@Override
	public void insertOrUpdate(List<CallBean> callBeanList, Boolean isInsert, Boolean isUpdate, Boolean isBefore,
			Boolean isAfter) {
		// TODO Auto-generated method stub
		if ((isInsert && isAfter) || (isUpdate && isAfter)) {
			for (CallBean callBean : callBeanList) {
				if (callBean.getCall_Date_Time__c() != null) {
					if (callBean.getClient_Local_Time_Zone__c().equalsIgnoreCase("Eastern")) {
						long calltime = callBean.getCall_Date_Time__c().getTime() + (120 / 1440);
						Timestamp timestamp = new Timestamp(calltime);
						System.out.println("eastern");
						callBean.setClient_Local_Call_Date_Time__c(timestamp);
					} else if (callBean.getClient_Local_Time_Zone__c().equalsIgnoreCase("Central")) {
						long calltime = callBean.getCall_Date_Time__c().getTime() + (60 / 1440);
						Timestamp timestamp = new Timestamp(calltime);
						callBean.setClient_Local_Call_Date_Time__c(timestamp);
					} else if (callBean.getClient_Local_Time_Zone__c().equalsIgnoreCase("Pacific")) {
						long calltime = callBean.getCall_Date_Time__c().getTime() - (60 / 1440);
						Timestamp timestamp = new Timestamp(calltime);
						callBean.setClient_Local_Call_Date_Time__c(timestamp);
					} else {
						callBean.setClient_Local_Call_Date_Time__c(callBean.getCall_Date_Time__c());
					}
				}
			}
			try {
				System.out.println("call dao : "+((CallDao)callDao));
				
				((CallDao)callDao).updateCall(callBeanList);
				System.out.println("workflow called....");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
