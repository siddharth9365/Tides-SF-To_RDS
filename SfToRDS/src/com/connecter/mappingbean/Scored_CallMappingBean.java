package com.connecter.mappingbean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scoredcall")
public class Scored_CallMappingBean {
	@Id
	public String Id;
	@Column(columnDefinition="TIMESTAMP")
	public Timestamp CreatedDate;
	public String CreatedById;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer IsDeleted;
	@Column(columnDefinition="TIMESTAMP")
	public Timestamp LastModifiedDate;
	@Column(columnDefinition="TIMESTAMP")
	public Timestamp LastActivityDate;
	// Timestamp LastViewedTimestamp;
	public String LastModifiedById;
	public String Name;
	// String RecordTypeId;
	@Column(columnDefinition="TIMESTAMP")
	public Timestamp SystemModstamp;
	public Double Accuracy_Point__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Appt_Scheduled__c;
	public String Call__c;
	// Timestamp Call_Timestamp_Time__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Caller_left_name__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Caller_Asked_Appt__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Caller_Interest_In_Appt__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Caller_Left_Number__c;
	public String Caller_Name__c;
	public String Callers_Phone_Number__c;
	public String Caller_User__c;
	public String Call_Language__c;
	public String Call_Receiver__c;
	public String Call_Receiver_Contact__c;
	// String Call_Scoring_Queue_Time__c;
	// Double Call_Scoring_Turnaround__c;
	public String Call_Type__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Cancel_Appt__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Change_Appt__c;
	// Double temp_num_Clear_and_Courteous__c;
	// String Contact_Or_User_Name__c;
	public String Contact_user__c;
	// Timestamp createdTimestamp_datetime__c;
	public String Current_Scorer__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Did_audio_Played__c;
	// Double Efficiency__c;
	public String General_call_details__c;
	public Integer How_Many_Appts__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer is_call_back_before_scored__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Is_latest_scored__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Is_QA_Process_completed__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Is_unclear_voice__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer is_updated_via_dashboard__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Is_Update_Via_Batch_T__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Left_Message__c;
	public String Log__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Maintained_Control__c;
	// Double Temp_Num_Maintained_Control__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Medicare__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Name_Twice__c;
	// Double temp_num_Name_Twice__c;
	@Column(name = "N_Please_choose_Why_called__c")
	public String No_Please_choose_Why_They_called__c;
	public String Old_SF_ID__c;
	public String Outbound_or_Inbound__c;
	@Column(columnDefinition="TIMESTAMP")
	public Timestamp Patient_1_Appt_Date__c;
	public String Patient_1_First_Name__c;
	public String Patient_1_Last_Name__c;
	@Column(columnDefinition="TIMESTAMP")
	public Timestamp Patient_2_Appt_Date__c;
	public String Patient_2_First_Name__c;
	public String Patient_2_Last_Name__c;
	@Column(columnDefinition="TIMESTAMP")
	public Timestamp Patient_3_Appt_Date__c;
	public String Patient_3_First_Name__c;
	public String Patient_3_Last_Name__c;
	@Column(columnDefinition="TIMESTAMP")
	public Timestamp Patient_4_Appt_Date__c;
	public String Patient_4_First_Name__c;
	public String Patient_4_Last_Name__c;
	@Column(columnDefinition="TIMESTAMP")
	public Timestamp Patient_5_Appt_Date__c;
	public String Patient_5_First_Name__c;
	public String Patient_5_Last_Name__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Clear_and_Courteous__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer QA__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer QA_Flag__c;
	public String QA_Pass_Fail__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Ready_to_Score__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Schedule_Appt__c;
	// Double temp_num_Schedule_Appt__c;
	@Column(columnDefinition="TIMESTAMP")
	public Timestamp Score_DateTime__c;
	public String Scorer__c;
	// Timestamp ScorerLocalTime__c;
	public Double Scoring_Time__c;
	// Double Scoring_time_in_second__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Skipped_by_CA__c;
	public String Staff_Comments__c;
	// Double Star_Rating__c;
	// String Text_CreatedTimestamp__c;
	@Column(name = "Total_Psbl_Accuracy_Pnt__c")
	public Double Total_Possible_Accuracy_Point__c;
	// String Total_Scoring_time__c;
	// String total_time_score__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer updated_via_new_batch__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer VM_Request__c;
	@Column(columnDefinition = "NUMBER(1)")
	public Integer Was_the_audio_bad__c;
	@Column(columnDefinition = "NUMBER(1)", name = "Was_This_new_App_Opp__c")
	public Integer Was_This_a_new_Appointment_Opportuni__c;
	@Column(columnDefinition = "NUMBER(1)", name = "Was_This_new_App_Oppty__c")
	public Integer Was_This_a_new_Appointment_Opportunity__c;
	@Column(name = "Y_Please_Choose_Why_called__c")
	public String Yes_Please_Choose_Why_They_called__c;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Timestamp getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		CreatedDate = createdDate;
	}

	public String getCreatedById() {
		return CreatedById;
	}

	public void setCreatedById(String createdById) {
		CreatedById = createdById;
	}

	public Integer getIsDeleted() {
		return IsDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		IsDeleted = isDeleted;
	}

	public Timestamp getLastModifiedDate() {
		return LastModifiedDate;
	}

	public void setLastModifiedDate(Timestamp lastModifiedDate) {
		LastModifiedDate = lastModifiedDate;
	}

	public Timestamp getLastActivityDate() {
		return LastActivityDate;
	}

	public void setLastActivityDate(Timestamp lastActivityDate) {
		LastActivityDate = lastActivityDate;
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

	public Timestamp getSystemModstamp() {
		return SystemModstamp;
	}

	public void setSystemModstamp(Timestamp systemModstamp) {
		SystemModstamp = systemModstamp;
	}

	public Double getAccuracy_Point__c() {
		return Accuracy_Point__c;
	}

	public void setAccuracy_Point__c(Double accuracy_Point__c) {
		Accuracy_Point__c = accuracy_Point__c;
	}

	public Integer getAppt_Scheduled__c() {
		return Appt_Scheduled__c;
	}

	public void setAppt_Scheduled__c(Integer appt_Scheduled__c) {
		Appt_Scheduled__c = appt_Scheduled__c;
	}

	public String getCall__c() {
		return Call__c;
	}

	public void setCall__c(String call__c) {
		Call__c = call__c;
	}

	public Integer getCaller_left_name__c() {
		return Caller_left_name__c;
	}

	public void setCaller_left_name__c(Integer caller_left_name__c) {
		Caller_left_name__c = caller_left_name__c;
	}

	public Integer getCaller_Asked_Appt__c() {
		return Caller_Asked_Appt__c;
	}

	public void setCaller_Asked_Appt__c(Integer caller_Asked_Appt__c) {
		Caller_Asked_Appt__c = caller_Asked_Appt__c;
	}

	public Integer getCaller_Interest_In_Appt__c() {
		return Caller_Interest_In_Appt__c;
	}

	public void setCaller_Interest_In_Appt__c(Integer caller_Interest_In_Appt__c) {
		Caller_Interest_In_Appt__c = caller_Interest_In_Appt__c;
	}

	public Integer getCaller_Left_Number__c() {
		return Caller_Left_Number__c;
	}

	public void setCaller_Left_Number__c(Integer caller_Left_Number__c) {
		Caller_Left_Number__c = caller_Left_Number__c;
	}

	public String getCaller_Name__c() {
		return Caller_Name__c;
	}

	public void setCaller_Name__c(String caller_Name__c) {
		Caller_Name__c = caller_Name__c;
	}

	public String getCallers_Phone_Number__c() {
		return Callers_Phone_Number__c;
	}

	public void setCallers_Phone_Number__c(String callers_Phone_Number__c) {
		Callers_Phone_Number__c = callers_Phone_Number__c;
	}

	public String getCaller_User__c() {
		return Caller_User__c;
	}

	public void setCaller_User__c(String caller_User__c) {
		Caller_User__c = caller_User__c;
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

	public String getCall_Type__c() {
		return Call_Type__c;
	}

	public void setCall_Type__c(String call_Type__c) {
		Call_Type__c = call_Type__c;
	}

	public Integer getCancel_Appt__c() {
		return Cancel_Appt__c;
	}

	public void setCancel_Appt__c(Integer cancel_Appt__c) {
		Cancel_Appt__c = cancel_Appt__c;
	}

	public Integer getChange_Appt__c() {
		return Change_Appt__c;
	}

	public void setChange_Appt__c(Integer change_Appt__c) {
		Change_Appt__c = change_Appt__c;
	}

	public String getContact_user__c() {
		return Contact_user__c;
	}

	public void setContact_user__c(String contact_user__c) {
		Contact_user__c = contact_user__c;
	}

	public String getCurrent_Scorer__c() {
		return Current_Scorer__c;
	}

	public void setCurrent_Scorer__c(String current_Scorer__c) {
		Current_Scorer__c = current_Scorer__c;
	}

	public Integer getDid_audio_Played__c() {
		return Did_audio_Played__c;
	}

	public void setDid_audio_Played__c(Integer did_audio_Played__c) {
		Did_audio_Played__c = did_audio_Played__c;
	}

	public String getGeneral_call_details__c() {
		return General_call_details__c;
	}

	public void setGeneral_call_details__c(String general_call_details__c) {
		General_call_details__c = general_call_details__c;
	}

	public Integer getHow_Many_Appts__c() {
		return How_Many_Appts__c;
	}

	public void setHow_Many_Appts__c(Integer how_Many_Appts__c) {
		How_Many_Appts__c = how_Many_Appts__c;
	}

	public Integer getIs_call_back_before_scored__c() {
		return is_call_back_before_scored__c;
	}

	public void setIs_call_back_before_scored__c(Integer is_call_back_before_scored__c) {
		this.is_call_back_before_scored__c = is_call_back_before_scored__c;
	}

	public Integer getIs_latest_scored__c() {
		return Is_latest_scored__c;
	}

	public void setIs_latest_scored__c(Integer is_latest_scored__c) {
		Is_latest_scored__c = is_latest_scored__c;
	}

	public Integer getIs_QA_Process_completed__c() {
		return Is_QA_Process_completed__c;
	}

	public void setIs_QA_Process_completed__c(Integer is_QA_Process_completed__c) {
		Is_QA_Process_completed__c = is_QA_Process_completed__c;
	}

	public Integer getIs_unclear_voice__c() {
		return Is_unclear_voice__c;
	}

	public void setIs_unclear_voice__c(Integer is_unclear_voice__c) {
		Is_unclear_voice__c = is_unclear_voice__c;
	}

	public Integer getIs_updated_via_dashboard__c() {
		return is_updated_via_dashboard__c;
	}

	public void setIs_updated_via_dashboard__c(Integer is_updated_via_dashboard__c) {
		this.is_updated_via_dashboard__c = is_updated_via_dashboard__c;
	}

	public Integer getIs_Update_Via_Batch_T__c() {
		return Is_Update_Via_Batch_T__c;
	}

	public void setIs_Update_Via_Batch_T__c(Integer is_Update_Via_Batch_T__c) {
		Is_Update_Via_Batch_T__c = is_Update_Via_Batch_T__c;
	}

	public Integer getLeft_Message__c() {
		return Left_Message__c;
	}

	public void setLeft_Message__c(Integer left_Message__c) {
		Left_Message__c = left_Message__c;
	}

	public String getLog__c() {
		return Log__c;
	}

	public void setLog__c(String log__c) {
		Log__c = log__c;
	}

	public Integer getMaintained_Control__c() {
		return Maintained_Control__c;
	}

	public void setMaintained_Control__c(Integer maintained_Control__c) {
		Maintained_Control__c = maintained_Control__c;
	}

	public Integer getMedicare__c() {
		return Medicare__c;
	}

	public void setMedicare__c(Integer medicare__c) {
		Medicare__c = medicare__c;
	}

	public Integer getName_Twice__c() {
		return Name_Twice__c;
	}

	public void setName_Twice__c(Integer name_Twice__c) {
		Name_Twice__c = name_Twice__c;
	}

	public String getNo_Please_choose_Why_They_called__c() {
		return No_Please_choose_Why_They_called__c;
	}

	public void setNo_Please_choose_Why_They_called__c(String no_Please_choose_Why_They_called__c) {
		No_Please_choose_Why_They_called__c = no_Please_choose_Why_They_called__c;
	}

	public String getOld_SF_ID__c() {
		return Old_SF_ID__c;
	}

	public void setOld_SF_ID__c(String old_SF_ID__c) {
		Old_SF_ID__c = old_SF_ID__c;
	}

	public String getOutbound_or_Inbound__c() {
		return Outbound_or_Inbound__c;
	}

	public void setOutbound_or_Inbound__c(String outbound_or_Inbound__c) {
		Outbound_or_Inbound__c = outbound_or_Inbound__c;
	}

	public Timestamp getPatient_1_Appt_Date__c() {
		return Patient_1_Appt_Date__c;
	}

	public void setPatient_1_Appt_Date__c(Timestamp patient_1_Appt_Date__c) {
		Patient_1_Appt_Date__c = patient_1_Appt_Date__c;
	}

	public String getPatient_1_First_Name__c() {
		return Patient_1_First_Name__c;
	}

	public void setPatient_1_First_Name__c(String patient_1_First_Name__c) {
		Patient_1_First_Name__c = patient_1_First_Name__c;
	}

	public String getPatient_1_Last_Name__c() {
		return Patient_1_Last_Name__c;
	}

	public void setPatient_1_Last_Name__c(String patient_1_Last_Name__c) {
		Patient_1_Last_Name__c = patient_1_Last_Name__c;
	}

	public Timestamp getPatient_2_Appt_Date__c() {
		return Patient_2_Appt_Date__c;
	}

	public void setPatient_2_Appt_Date__c(Timestamp patient_2_Appt_Date__c) {
		Patient_2_Appt_Date__c = patient_2_Appt_Date__c;
	}

	public String getPatient_2_First_Name__c() {
		return Patient_2_First_Name__c;
	}

	public void setPatient_2_First_Name__c(String patient_2_First_Name__c) {
		Patient_2_First_Name__c = patient_2_First_Name__c;
	}

	public String getPatient_2_Last_Name__c() {
		return Patient_2_Last_Name__c;
	}

	public void setPatient_2_Last_Name__c(String patient_2_Last_Name__c) {
		Patient_2_Last_Name__c = patient_2_Last_Name__c;
	}

	public Timestamp getPatient_3_Appt_Date__c() {
		return Patient_3_Appt_Date__c;
	}

	public void setPatient_3_Appt_Date__c(Timestamp patient_3_Appt_Date__c) {
		Patient_3_Appt_Date__c = patient_3_Appt_Date__c;
	}

	public String getPatient_3_First_Name__c() {
		return Patient_3_First_Name__c;
	}

	public void setPatient_3_First_Name__c(String patient_3_First_Name__c) {
		Patient_3_First_Name__c = patient_3_First_Name__c;
	}

	public String getPatient_3_Last_Name__c() {
		return Patient_3_Last_Name__c;
	}

	public void setPatient_3_Last_Name__c(String patient_3_Last_Name__c) {
		Patient_3_Last_Name__c = patient_3_Last_Name__c;
	}

	public Timestamp getPatient_4_Appt_Date__c() {
		return Patient_4_Appt_Date__c;
	}

	public void setPatient_4_Appt_Date__c(Timestamp patient_4_Appt_Date__c) {
		Patient_4_Appt_Date__c = patient_4_Appt_Date__c;
	}

	public String getPatient_4_First_Name__c() {
		return Patient_4_First_Name__c;
	}

	public void setPatient_4_First_Name__c(String patient_4_First_Name__c) {
		Patient_4_First_Name__c = patient_4_First_Name__c;
	}

	public String getPatient_4_Last_Name__c() {
		return Patient_4_Last_Name__c;
	}

	public void setPatient_4_Last_Name__c(String patient_4_Last_Name__c) {
		Patient_4_Last_Name__c = patient_4_Last_Name__c;
	}

	public Timestamp getPatient_5_Appt_Date__c() {
		return Patient_5_Appt_Date__c;
	}

	public void setPatient_5_Appt_Date__c(Timestamp patient_5_Appt_Date__c) {
		Patient_5_Appt_Date__c = patient_5_Appt_Date__c;
	}

	public String getPatient_5_First_Name__c() {
		return Patient_5_First_Name__c;
	}

	public void setPatient_5_First_Name__c(String patient_5_First_Name__c) {
		Patient_5_First_Name__c = patient_5_First_Name__c;
	}

	public String getPatient_5_Last_Name__c() {
		return Patient_5_Last_Name__c;
	}

	public void setPatient_5_Last_Name__c(String patient_5_Last_Name__c) {
		Patient_5_Last_Name__c = patient_5_Last_Name__c;
	}

	public Integer getClear_and_Courteous__c() {
		return Clear_and_Courteous__c;
	}

	public void setClear_and_Courteous__c(Integer clear_and_Courteous__c) {
		Clear_and_Courteous__c = clear_and_Courteous__c;
	}

	public Integer getQA__c() {
		return QA__c;
	}

	public void setQA__c(Integer qA__c) {
		QA__c = qA__c;
	}

	public Integer getQA_Flag__c() {
		return QA_Flag__c;
	}

	public void setQA_Flag__c(Integer qA_Flag__c) {
		QA_Flag__c = qA_Flag__c;
	}

	public String getQA_Pass_Fail__c() {
		return QA_Pass_Fail__c;
	}

	public void setQA_Pass_Fail__c(String qA_Pass_Fail__c) {
		QA_Pass_Fail__c = qA_Pass_Fail__c;
	}

	public Integer getReady_to_Score__c() {
		return Ready_to_Score__c;
	}

	public void setReady_to_Score__c(Integer ready_to_Score__c) {
		Ready_to_Score__c = ready_to_Score__c;
	}

	public Integer getSchedule_Appt__c() {
		return Schedule_Appt__c;
	}

	public void setSchedule_Appt__c(Integer schedule_Appt__c) {
		Schedule_Appt__c = schedule_Appt__c;
	}

	public Timestamp getScore_DateTime__c() {
		return Score_DateTime__c;
	}

	public void setScore_DateTime__c(Timestamp score_DateTime__c) {
		Score_DateTime__c = score_DateTime__c;
	}

	public String getScorer__c() {
		return Scorer__c;
	}

	public void setScorer__c(String scorer__c) {
		Scorer__c = scorer__c;
	}

	public Double getScoring_Time__c() {
		return Scoring_Time__c;
	}

	public void setScoring_Time__c(Double scoring_Time__c) {
		Scoring_Time__c = scoring_Time__c;
	}

	public Integer getSkipped_by_CA__c() {
		return Skipped_by_CA__c;
	}

	public void setSkipped_by_CA__c(Integer skipped_by_CA__c) {
		Skipped_by_CA__c = skipped_by_CA__c;
	}

	public String getStaff_Comments__c() {
		return Staff_Comments__c;
	}

	public void setStaff_Comments__c(String staff_Comments__c) {
		Staff_Comments__c = staff_Comments__c;
	}

	public Double getTotal_Possible_Accuracy_Point__c() {
		return Total_Possible_Accuracy_Point__c;
	}

	public void setTotal_Possible_Accuracy_Point__c(Double total_Possible_Accuracy_Point__c) {
		Total_Possible_Accuracy_Point__c = total_Possible_Accuracy_Point__c;
	}

	public Integer getUpdated_via_new_batch__c() {
		return updated_via_new_batch__c;
	}

	public void setUpdated_via_new_batch__c(Integer updated_via_new_batch__c) {
		this.updated_via_new_batch__c = updated_via_new_batch__c;
	}

	public Integer getVM_Request__c() {
		return VM_Request__c;
	}

	public void setVM_Request__c(Integer vM_Request__c) {
		VM_Request__c = vM_Request__c;
	}

	public Integer getWas_the_audio_bad__c() {
		return Was_the_audio_bad__c;
	}

	public void setWas_the_audio_bad__c(Integer was_the_audio_bad__c) {
		Was_the_audio_bad__c = was_the_audio_bad__c;
	}

	public Integer getWas_This_a_new_Appointment_Opportuni__c() {
		return Was_This_a_new_Appointment_Opportuni__c;
	}

	public void setWas_This_a_new_Appointment_Opportuni__c(Integer was_This_a_new_Appointment_Opportuni__c) {
		Was_This_a_new_Appointment_Opportuni__c = was_This_a_new_Appointment_Opportuni__c;
	}

	public Integer getWas_This_a_new_Appointment_Opportunity__c() {
		return Was_This_a_new_Appointment_Opportunity__c;
	}

	public void setWas_This_a_new_Appointment_Opportunity__c(Integer was_This_a_new_Appointment_Opportunity__c) {
		Was_This_a_new_Appointment_Opportunity__c = was_This_a_new_Appointment_Opportunity__c;
	}

	public String getYes_Please_Choose_Why_They_called__c() {
		return Yes_Please_Choose_Why_They_called__c;
	}

	public void setYes_Please_Choose_Why_They_called__c(String yes_Please_Choose_Why_They_called__c) {
		Yes_Please_Choose_Why_They_called__c = yes_Please_Choose_Why_They_called__c;
	}

}
