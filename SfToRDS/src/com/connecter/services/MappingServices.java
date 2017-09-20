package com.connecter.services;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connecter.bean.CallBean;
import com.connecter.bean.Scored_CallBean;
import com.connecter.mappingbean.CallMappingBean;
import com.connecter.mappingbean.Scored_CallMappingBean;

@Service
public class MappingServices {
	@Autowired
	private DozerBeanMapperFactoryBean dozerBean;

	public CallMappingBean getCallMappingObject(CallBean callBean) throws Exception {
		Mapper mapper = (Mapper) dozerBean.getObject();
		CallMappingBean callMappingBean = new CallMappingBean();
		mapper.map(callBean, callMappingBean, "call-sf-to-data-mapping");
		return callMappingBean;
	}

	public CallBean getCallObject(CallMappingBean callMappingBean) throws Exception {
		Mapper mapper = (Mapper) dozerBean.getObject();
		CallBean callBean = new CallBean();
		mapper.map(callMappingBean, callBean, "call-data-to-sf-mapping");
		return callBean;
	}

	public List<CallBean> getCallObjectList(List<CallMappingBean> callMappingBeanList) throws Exception {
		List<CallBean> callBeanList = new ArrayList<CallBean>();
		for (CallMappingBean callMappingBean : callMappingBeanList) {
			Mapper mapper = (Mapper) dozerBean.getObject();
			CallBean callBean = new CallBean();
			mapper.map(callMappingBean, callBean, "call-data-to-sf-mapping");
			callBeanList.add(callBean);
		}
		return callBeanList;
	}

	public Scored_CallMappingBean getScored_CallMappingObject(Scored_CallBean callBean) throws Exception {
		Mapper mapper = (Mapper) dozerBean.getObject();
		Scored_CallMappingBean callMappingBean = new Scored_CallMappingBean();
		mapper.map(callBean, callMappingBean, "scored_call-sf-to-data-mapping");
		return callMappingBean;
	}

	public Scored_CallBean getScored_CallObject(Scored_CallMappingBean callMappingBean) throws Exception {
		Mapper mapper = (Mapper) dozerBean.getObject();
		Scored_CallBean callBean = new Scored_CallBean();
		mapper.map(callMappingBean, callBean, "scored_call-data-to-sf-mapping");
		return callBean;
	}
}
