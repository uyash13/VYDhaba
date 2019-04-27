package com.yash.vydhaba.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "usr_dtl")
public class User {

	@Id
	@Column(name = "USR_ID",length = 20)
	private String userId;
	
	@Column(name = "FRST_NM", nullable = false, length = 20)
	private String firstName;
	
	@Column(name = "LST_NM", nullable = true, length = 20)
	private String lastName;
	
	@Column(name = "PSWRD", nullable = false, length = 100)
	private String password;
	
	@Column(name = "EML_ID", nullable = false, length = 55)
	@Email
	private String emailId;
	
	@Column(name = "MB_NO", nullable = false, length = 10)
	private String mobileNo;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
}
