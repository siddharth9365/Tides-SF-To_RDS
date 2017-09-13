package com.connecter.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CallListBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6775348284023313783L;
	public List<CallBean> CallList;
	
	@JsonIgnore
	public List<CallBean> getCallList() {
		return CallList;
	}

	public void setCallList(List<CallBean> callList) {
		CallList = callList;
	}
	
	
}
