package com.connecter.mappingbean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "call_scored_call_rel")
public class CallAndScored_CallMappingBean {
	@Id
	public String scored_CallId;
	public String callId;
	public int isLatestScored_Call;

	public String getCallId() {
		return callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
	}

	public String getScored_CallId() {
		return scored_CallId;
	}

	public void setScored_CallId(String scored_CallId) {
		this.scored_CallId = scored_CallId;
	}

	public int getIsLatestScored_Call() {
		return isLatestScored_Call;
	}

	public void setIsLatestScored_Call(int isLatestScored_Call) {
		this.isLatestScored_Call = isLatestScored_Call;
	}

}
