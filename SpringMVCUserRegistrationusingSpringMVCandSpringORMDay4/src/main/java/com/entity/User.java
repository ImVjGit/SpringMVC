package com.entity;

public class User {

	private String userName;
	private String userPassword;
	private String email;

	

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
		return "User [userName=" + userName + ", userPassword=" + userPassword + ", email=" + email + "]";
	}

}
