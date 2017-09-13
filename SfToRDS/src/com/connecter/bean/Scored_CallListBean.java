package com.connecter.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Scored_CallListBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -882770644525947634L;
	public List<Scored_CallBean> Scored_CallList;

	@JsonIgnore
	public List<Scored_CallBean> getScored_CallList() {
		return Scored_CallList;
	}

	public void setScored_CallList(List<Scored_CallBean> scored_Scored_CallList) {
		Scored_CallList = scored_Scored_CallList;
	}

}
