package com.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {
	
	@Id
	@SequenceGenerator(name="customerId",initialValue=100 ,allocationSize=3)
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "customerId")
	private int customerId;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String mobile;
	@Column
	private String password;
	public int getId() {
		return customerId;
	}
	public void setId(int id) {
		this.customerId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [id=" + customerId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + "]";
	}
	
	

}
