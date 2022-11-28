package com.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	private String userPassword;
	private String email;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String userName, String userPassword, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", email=" + email
				+ "]";
	}

	
	
	
	
	
}
