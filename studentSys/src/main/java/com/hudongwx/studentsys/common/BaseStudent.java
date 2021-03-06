package com.hudongwx.studentsys.common;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseStudent<M extends BaseStudent<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setClassId(java.lang.Integer classId) {
		set("classId", classId);
	}

	public java.lang.Integer getClassId() {
		return get("classId");
	}

	public void setClassName(java.lang.String className) {
		set("className", className);
	}

	public java.lang.String getClassName() {
		return get("className");
	}

	public void setTutor(java.lang.String tutor) {
		set("tutor", tutor);
	}

	public java.lang.String getTutor() {
		return get("tutor");
	}

	public void setTutorId(java.lang.Integer tutorId) {
		set("tutorId", tutorId);
	}

	public java.lang.Integer getTutorId() {
		return get("tutorId");
	}

	public void setSubject(java.lang.Integer subject) {
		set("subject", subject);
	}

	public java.lang.Integer getSubject() {
		return get("subject");
	}

	public void setContactInformation(java.lang.String contactInformation) {
		set("contactInformation", contactInformation);
	}

	public java.lang.String getContactInformation() {
		return get("contactInformation");
	}

	public void setAdmission(java.lang.Long admission) {
		set("admission", admission);
	}

	public java.lang.Long getAdmission() {
		return get("admission");
	}

	public void setCredit(java.lang.Integer credit) {
		set("credit", credit);
	}

	public java.lang.Integer getCredit() {
		return get("credit");
	}

	public void setGrade(java.lang.Integer grade) {
		set("grade", grade);
	}

	public java.lang.Integer getGrade() {
		return get("grade");
	}

	public void setState(java.lang.String state) {
		set("state", state);
	}

	public java.lang.String getState() {
		return get("state");
	}

	public void setEmployment(java.lang.String employment) {
		set("employment", employment);
	}

	public java.lang.String getEmployment() {
		return get("employment");
	}

	public void setCreateTime(java.lang.Long createTime) {
		set("createTime", createTime);
	}

	public java.lang.Long getCreateTime() {
		return get("createTime");
	}

	public void setIp(java.lang.String ip) {
		set("ip", ip);
	}

	public java.lang.String getIp() {
		return get("ip");
	}

	public void setOperaterId(java.lang.Integer operaterId) {
		set("operaterId", operaterId);
	}

	public java.lang.Integer getOperaterId() {
		return get("operaterId");
	}

	public void setOperater(java.lang.String operater) {
		set("operater", operater);
	}

	public java.lang.String getOperater() {
		return get("operater");
	}

	public void setConsultantId(java.lang.Integer consultantId) {
		set("consultantId", consultantId);
	}

	public java.lang.Integer getConsultantId() {
		return get("consultantId");
	}

	public void setUserId(java.lang.Integer userId) {
		set("userId", userId);
	}

	public java.lang.Integer getUserId() {
		return get("userId");
	}

}
