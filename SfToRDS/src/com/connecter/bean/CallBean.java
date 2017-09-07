package com.connecter.bean;

import java.util.Date;

public class CallBean {
	String Id;
	Date CreatedDate;
	String CreatedById;
	Boolean IsDeleted;
	Date LastModifiedDate;
	Date LastReferencedDate;
	Date LastViewedDate;
	String LastModifiedById;
	String Name;
	String RecordTypeId;
	Date SystemModstamp;
	String Account__c;
	Boolean add_walk_in__c;
	Boolean Bulk_Import__c;
	Boolean Bulk_Workflow_Toggle__c;
	// Date Call_Date__c;
	Date Call_Date_Time__c;
	// String Call_Duration_MM_SS__c;
	// String Call_Duration_MS__c;
	String CallerName__c;
	String Callers_Phone_Number__c;
	// String Call_Hour__c;
	String Call_Language__c;
	String Call_Receiver__c;
	String Call_Receiver_Contact__c;
	Date Call_scoring_send_time__c;
	String Call_Skip_By_Contact__c;
	String Call_skip_by_user__c;
	String Call_Type__c;
	Boolean Call_Type_Changed__c;
	// Date Client_Local_Call_Date__c;
	Date Client_Local_Call_Date_Time__c;
	// Date Client_Local_Call_Date_Time1__c;
	// String Client_Local_Call_Time__c;
	Integer Client_Local_Call_Time_H__c;
	// Double Client_Local_Call_Time_M__c;
	// String Client_Local_Time_Zone__c;
	String Client_Number__c;
	String Client_Number_Formatted__c;
	// String Company_Name__c;
	String Current_Contact_user__c;
	String Current_Scorer__c;
	String Dentist_Number__c;
	Integer Duration__c;
	// Double Duration_H__c;
	// Double Duration_M__c;
	// String Duration_Bucket__c;
	String External_System_ID__c;
	String Follow_Up_Status__c;
	String Google_UUID__c;
	// Integer How_Many_Appointments_Set__c;
	Boolean is_migrated__c;
	Boolean isAudioCheckRequired__c;
	Boolean isAudioEncrypted__c;
	Boolean isAudioMigrated__c;
	Boolean Is_Busy__c;
	Boolean Is_Missed__c;
	Boolean Is_Newly_Migrated__c;
	Boolean Is_Unanswered__c;
	// Integer Is_Updated_Via_Dashboard__c;
	Boolean Is_Update_Via_Batch_T__c;
	String Language__c;
	String Latest_Scored_Call__c;
	// Integer Latest_Scored_Call_Datetime__c;
	// String Client_Local_Date_Time_Formated1__c;
	String Month_Created__c;
	Boolean Moved_to_Old_System__c;
	String Old_SF_ID__c;
	String Old_call_type__c;
	String Order__c;
	Boolean Outbound__c;
	String Outbound_or_Inbound__c;
	String QA__c;
	String QA_contact_user__c;
	Boolean QA_Flag__c;
	String QA_Scorer__c;
	Boolean readyToMigrate__c;
	Boolean Ready_to_Score__c;
	String Recording_URL__c;
	Boolean Removed_from_Queue__c;
	// Integer Scored_Call_count__c;
	Boolean SendToAmazon__c;
	Date SendToAmazonDateTime__c;
	Boolean SentForEncryption__c;
	String Skipped_by_CA_contact__c;
	String Skipped_by_CA_user__c;
	Boolean skipped_more_than_once__c;
	Boolean Skipped_by_CA__c;
	// Double Star_Rating__c;
	// String Temp_Amazon_URL__c;
	Boolean tirth_moved_out_of_queue__c;
	Integer Total_Errors__c;
	// Integer Tracking_Data_Count__c;
	String Twilio_Number__c;
	Boolean Update_Counter__c;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}

	public String getCreatedById() {
		return CreatedById;
	}

	public void setCreatedById(String createdById) {
		CreatedById = createdById;
	}

	public Boolean getIsDeleted() {
		return IsDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		IsDeleted = isDeleted;
	}

	public Date getLastModifiedDate() {
		return LastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		LastModifiedDate = lastModifiedDate;
	}

	public Date getLastReferencedDate() {
		return LastReferencedDate;
	}

	public void setLastReferencedDate(Date lastReferencedDate) {
		LastReferencedDate = lastReferencedDate;
	}

	public Date getLastViewedDate() {
		return LastViewedDate;
	}

	public void setLastViewedDate(Date lastViewedDate) {
		LastViewedDate = lastViewedDate;
	}

	public String getLastModifiedById() {
		return LastModifiedById;
	}

	public void setLastModifiedById(String lastModifiedById) {
		LastModifiedById = lastModifiedById;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRecordTypeId() {
		return RecordTypeId;
	}

	public void setRecordTypeId(String recordTypeId) {
		RecordTypeId = recordTypeId;
	}

	public Date getSystemModstamp() {
		return SystemModstamp;
	}

	public void setSystemModstamp(Date systemModstamp) {
		SystemModstamp = systemModstamp;
	}

	public String getAccount__c() {
		return Account__c;
	}

	public void setAccount__c(String account__c) {
		Account__c = account__c;
	}

	public Boolean getAdd_walk_in__c() {
		return add_walk_in__c;
	}

	public void setAdd_walk_in__c(Boolean add_walk_in__c) {
		this.add_walk_in__c = add_walk_in__c;
	}

	public Boolean getBulk_Import__c() {
		return Bulk_Import__c;
	}

	public void setBulk_Import__c(Boolean bulk_Import__c) {
		Bulk_Import__c = bulk_Import__c;
	}

	public Boolean getBulk_Workflow_Toggle__c() {
		return Bulk_Workflow_Toggle__c;
	}

	public void setBulk_Workflow_Toggle__c(Boolean bulk_Workflow_Toggle__c) {
		Bulk_Workflow_Toggle__c = bulk_Workflow_Toggle__c;
	}

	public Date getCall_Date_Time__c() {
		return Call_Date_Time__c;
	}

	public void setCall_Date_Time__c(Date call_Date_Time__c) {
		Call_Date_Time__c = call_Date_Time__c;
	}

	public String getCallerName__c() {
		return CallerName__c;
	}

	public void setCallerName__c(String callerName__c) {
		CallerName__c = callerName__c;
	}

	public String getCallers_Phone_Number__c() {
		return Callers_Phone_Number__c;
	}

	public void setCallers_Phone_Number__c(String callers_Phone_Number__c) {
		Callers_Phone_Number__c = callers_Phone_Number__c;
	}

	public String getCall_Language__c() {
		return Call_Language__c;
	}

	public void setCall_Language__c(String call_Language__c) {
		Call_Language__c = call_Language__c;
	}

	public String getCall_Receiver__c() {
		return Call_Receiver__c;
	}

	public void setCall_Receiver__c(String call_Receiver__c) {
		Call_Receiver__c = call_Receiver__c;
	}

	public String getCall_Receiver_Contact__c() {
		return Call_Receiver_Contact__c;
	}

	public void setCall_Receiver_Contact__c(String call_Receiver_Contact__c) {
		Call_Receiver_Contact__c = call_Receiver_Contact__c;
	}

	public Date getCall_scoring_send_time__c() {
		return Call_scoring_send_time__c;
	}

	public void setCall_scoring_send_time__c(Date call_scoring_send_time__c) {
		Call_scoring_send_time__c = call_scoring_send_time__c;
	}

	public String getCall_Skip_By_Contact__c() {
		return Call_Skip_By_Contact__c;
	}

	public void setCall_Skip_By_Contact__c(String call_Skip_By_Contact__c) {
		Call_Skip_By_Contact__c = call_Skip_By_Contact__c;
	}

	public String getCall_skip_by_user__c() {
		return Call_skip_by_user__c;
	}

	public void setCall_skip_by_user__c(String call_skip_by_user__c) {
		Call_skip_by_user__c = call_skip_by_user__c;
	}

	public String getCall_Type__c() {
		return Call_Type__c;
	}

	public void setCall_Type__c(String call_Type__c) {
		Call_Type__c = call_Type__c;
	}

	public Boolean getCall_Type_Changed__c() {
		return Call_Type_Changed__c;
	}

	public void setCall_Type_Changed__c(Boolean call_Type_Changed__c) {
		Call_Type_Changed__c = call_Type_Changed__c;
	}

	public Date getClient_Local_Call_Date_Time__c() {
		return Client_Local_Call_Date_Time__c;
	}

	public void setClient_Local_Call_Date_Time__c(Date client_Local_Call_Date_Time__c) {
		Client_Local_Call_Date_Time__c = client_Local_Call_Date_Time__c;
	}

	public Integer getClient_Local_Call_Time_H__c() {
		return Client_Local_Call_Time_H__c;
	}

	public void setClient_Local_Call_Time_H__c(Integer client_Local_Call_Time_H__c) {
		Client_Local_Call_Time_H__c = client_Local_Call_Time_H__c;
	}

	public String getClient_Number__c() {
		return Client_Number__c;
	}

	public void setClient_Number__c(String client_Number__c) {
		Client_Number__c = client_Number__c;
	}

	public String getClient_Number_Formatted__c() {
		return Client_Number_Formatted__c;
	}

	public void setClient_Number_Formatted__c(String client_Number_Formatted__c) {
		Client_Number_Formatted__c = client_Number_Formatted__c;
	}

	public String getCurrent_Contact_user__c() {
		return Current_Contact_user__c;
	}

	public void setCurrent_Contact_user__c(String current_Contact_user__c) {
		Current_Contact_user__c = current_Contact_user__c;
	}

	public String getCurrent_Scorer__c() {
		return Current_Scorer__c;
	}

	public void setCurrent_Scorer__c(String current_Scorer__c) {
		Current_Scorer__c = current_Scorer__c;
	}

	public String getDentist_Number__c() {
		return Dentist_Number__c;
	}

	public void setDentist_Number__c(String dentist_Number__c) {
		Dentist_Number__c = dentist_Number__c;
	}

	public Integer getDuration__c() {
		return Duration__c;
	}

	public void setDuration__c(Integer duration__c) {
		Duration__c = duration__c;
	}

	public String getExternal_System_ID__c() {
		return External_System_ID__c;
	}

	public void setExternal_System_ID__c(String external_System_ID__c) {
		External_System_ID__c = external_System_ID__c;
	}

	public String getFollow_Up_Status__c() {
		return Follow_Up_Status__c;
	}

	public void setFollow_Up_Status__c(String follow_Up_Status__c) {
		Follow_Up_Status__c = follow_Up_Status__c;
	}

	public String getGoogle_UUID__c() {
		return Google_UUID__c;
	}

	public void setGoogle_UUID__c(String google_UUID__c) {
		Google_UUID__c = google_UUID__c;
	}

	public Boolean getIs_migrated__c() {
		return is_migrated__c;
	}

	public void setIs_migrated__c(Boolean is_migrated__c) {
		this.is_migrated__c = is_migrated__c;
	}

	public Boolean getIsAudioCheckRequired__c() {
		return isAudioCheckRequired__c;
	}

	public void setIsAudioCheckRequired__c(Boolean isAudioCheckRequired__c) {
		this.isAudioCheckRequired__c = isAudioCheckRequired__c;
	}

	public Boolean getIsAudioEncrypted__c() {
		return isAudioEncrypted__c;
	}

	public void setIsAudioEncrypted__c(Boolean isAudioEncrypted__c) {
		this.isAudioEncrypted__c = isAudioEncrypted__c;
	}

	public Boolean getIsAudioMigrated__c() {
		return isAudioMigrated__c;
	}

	public void setIsAudioMigrated__c(Boolean isAudioMigrated__c) {
		this.isAudioMigrated__c = isAudioMigrated__c;
	}

	public Boolean getIs_Busy__c() {
		return Is_Busy__c;
	}

	public void setIs_Busy__c(Boolean is_Busy__c) {
		Is_Busy__c = is_Busy__c;
	}

	public Boolean getIs_Missed__c() {
		return Is_Missed__c;
	}

	public void setIs_Missed__c(Boolean is_Missed__c) {
		Is_Missed__c = is_Missed__c;
	}

	public Boolean getIs_Newly_Migrated__c() {
		return Is_Newly_Migrated__c;
	}

	public void setIs_Newly_Migrated__c(Boolean is_Newly_Migrated__c) {
		Is_Newly_Migrated__c = is_Newly_Migrated__c;
	}

	public Boolean getIs_Unanswered__c() {
		return Is_Unanswered__c;
	}

	public void setIs_Unanswered__c(Boolean is_Unanswered__c) {
		Is_Unanswered__c = is_Unanswered__c;
	}

	public Boolean getIs_Update_Via_Batch_T__c() {
		return Is_Update_Via_Batch_T__c;
	}

	public void setIs_Update_Via_Batch_T__c(Boolean is_Update_Via_Batch_T__c) {
		Is_Update_Via_Batch_T__c = is_Update_Via_Batch_T__c;
	}

	public String getLanguage__c() {
		return Language__c;
	}

	public void setLanguage__c(String language__c) {
		Language__c = language__c;
	}

	public String getLatest_Scored_Call__c() {
		return Latest_Scored_Call__c;
	}

	public void setLatest_Scored_Call__c(String latest_Scored_Call__c) {
		Latest_Scored_Call__c = latest_Scored_Call__c;
	}

	public String getMonth_Created__c() {
		return Month_Created__c;
	}

	public void setMonth_Created__c(String month_Created__c) {
		Month_Created__c = month_Created__c;
	}

	public Boolean getMoved_to_Old_System__c() {
		return Moved_to_Old_System__c;
	}

	public void setMoved_to_Old_System__c(Boolean moved_to_Old_System__c) {
		Moved_to_Old_System__c = moved_to_Old_System__c;
	}

	public String getOld_SF_ID__c() {
		return Old_SF_ID__c;
	}

	public void setOld_SF_ID__c(String old_SF_ID__c) {
		Old_SF_ID__c = old_SF_ID__c;
	}

	public String getOld_call_type__c() {
		return Old_call_type__c;
	}

	public void setOld_call_type__c(String old_call_type__c) {
		Old_call_type__c = old_call_type__c;
	}

	public String getOrder__c() {
		return Order__c;
	}

	public void setOrder__c(String order__c) {
		Order__c = order__c;
	}

	public Boolean getOutbound__c() {
		return Outbound__c;
	}

	public void setOutbound__c(Boolean outbound__c) {
		Outbound__c = outbound__c;
	}

	public String getOutbound_or_Inbound__c() {
		return Outbound_or_Inbound__c;
	}

	public void setOutbound_or_Inbound__c(String outbound_or_Inbound__c) {
		Outbound_or_Inbound__c = outbound_or_Inbound__c;
	}

	public String getQA__c() {
		return QA__c;
	}

	public void setQA__c(String qA__c) {
		QA__c = qA__c;
	}

	public String getQA_contact_user__c() {
		return QA_contact_user__c;
	}

	public void setQA_contact_user__c(String qA_contact_user__c) {
		QA_contact_user__c = qA_contact_user__c;
	}

	public Boolean getQA_Flag__c() {
		return QA_Flag__c;
	}

	public void setQA_Flag__c(Boolean qA_Flag__c) {
		QA_Flag__c = qA_Flag__c;
	}

	public String getQA_Scorer__c() {
		return QA_Scorer__c;
	}

	public void setQA_Scorer__c(String qA_Scorer__c) {
		QA_Scorer__c = qA_Scorer__c;
	}

	public Boolean getReadyToMigrate__c() {
		return readyToMigrate__c;
	}

	public void setReadyToMigrate__c(Boolean readyToMigrate__c) {
		this.readyToMigrate__c = readyToMigrate__c;
	}

	public Boolean getReady_to_Score__c() {
		return Ready_to_Score__c;
	}

	public void setReady_to_Score__c(Boolean ready_to_Score__c) {
		Ready_to_Score__c = ready_to_Score__c;
	}

	public String getRecording_URL__c() {
		return Recording_URL__c;
	}

	public void setRecording_URL__c(String recording_URL__c) {
		Recording_URL__c = recording_URL__c;
	}

	public Boolean getRemoved_from_Queue__c() {
		return Removed_from_Queue__c;
	}

	public void setRemoved_from_Queue__c(Boolean removed_from_Queue__c) {
		Removed_from_Queue__c = removed_from_Queue__c;
	}

	public Boolean getSendToAmazon__c() {
		return SendToAmazon__c;
	}

	public void setSendToAmazon__c(Boolean sendToAmazon__c) {
		SendToAmazon__c = sendToAmazon__c;
	}

	public Date getSendToAmazonDateTime__c() {
		return SendToAmazonDateTime__c;
	}

	public void setSendToAmazonDateTime__c(Date sendToAmazonDateTime__c) {
		SendToAmazonDateTime__c = sendToAmazonDateTime__c;
	}

	public Boolean getSentForEncryption__c() {
		return SentForEncryption__c;
	}

	public void setSentForEncryption__c(Boolean sentForEncryption__c) {
		SentForEncryption__c = sentForEncryption__c;
	}

	public String getSkipped_by_CA_contact__c() {
		return Skipped_by_CA_contact__c;
	}

	public void setSkipped_by_CA_contact__c(String skipped_by_CA_contact__c) {
		Skipped_by_CA_contact__c = skipped_by_CA_contact__c;
	}

	public String getSkipped_by_CA_user__c() {
		return Skipped_by_CA_user__c;
	}

	public void setSkipped_by_CA_user__c(String skipped_by_CA_user__c) {
		Skipped_by_CA_user__c = skipped_by_CA_user__c;
	}

	public Boolean getSkipped_more_than_once__c() {
		return skipped_more_than_once__c;
	}

	public void setSkipped_more_than_once__c(Boolean skipped_more_than_once__c) {
		this.skipped_more_than_once__c = skipped_more_than_once__c;
	}

	public Boolean getSkipped_by_CA__c() {
		return Skipped_by_CA__c;
	}

	public void setSkipped_by_CA__c(Boolean skipped_by_CA__c) {
		Skipped_by_CA__c = skipped_by_CA__c;
	}

	public Boolean getTirth_moved_out_of_queue__c() {
		return tirth_moved_out_of_queue__c;
	}

	public void setTirth_moved_out_of_queue__c(Boolean tirth_moved_out_of_queue__c) {
		this.tirth_moved_out_of_queue__c = tirth_moved_out_of_queue__c;
	}

	public Integer getTotal_Errors__c() {
		return Total_Errors__c;
	}

	public void setTotal_Errors__c(Integer total_Errors__c) {
		Total_Errors__c = total_Errors__c;
	}

	public String getTwilio_Number__c() {
		return Twilio_Number__c;
	}

	public void setTwilio_Number__c(String twilio_Number__c) {
		Twilio_Number__c = twilio_Number__c;
	}

	public Boolean getUpdate_Counter__c() {
		return Update_Counter__c;
	}

	public void setUpdate_Counter__c(Boolean update_Counter__c) {
		Update_Counter__c = update_Counter__c;
	}

}
