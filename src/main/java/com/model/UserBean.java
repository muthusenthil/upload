package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/*
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;*/

import org.springframework.stereotype.Component;


@Entity
@Component

public class UserBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*@NotNull
	@Size(min=2,max=30)*/
	@Id
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/*@NotNull*/
	private String email;
	/*@NotNull
	@Size(min=3,max=8)*/
	private String password;
	/*@NotNull*/
	private String address;
	/*@NotNull*/
	private Integer age;
	/*@NotNull
	@Size(min=10,max=12)*/
	private String phonenumber;
	/*private Boolean enabled;
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}*/
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	
}
