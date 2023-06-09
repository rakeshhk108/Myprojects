package com.Myproject.OBM.model;


import javax.persistence.CascadeType;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Userr")
public class Userr{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Userr_id")
	private int UserrId;
	@Column(name = "Userr_email")
	private String emailId;
	@Column(name = "Userr_name")
	private String name;	
	@Column(name = "Userr_password")
	private String password;
	
	
	
	
	public int getUserrId() {
		return UserrId;
	}	
	
	public void setUserrId(int userrId) {
		UserrId = userrId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public Userr(int userrId, String emailId, String name, String password, Cart cartId) {
		super();
		UserrId = userrId;
		this.emailId = emailId;
		this.name = name;
		this.password = password;
		
	}



	public Userr() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	}
	
	
	
	
	
	
