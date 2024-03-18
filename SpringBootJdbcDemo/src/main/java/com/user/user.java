package com.user;

public class user {
	int uID;
	String firstName, email, password;

	public user() {
		uID = (int) (Math.random() * 10000000);
		while (uID > 100000) {
			uID = (int) (Math.random() * 10000000);
		}
	}

	public int getuID() {
		return uID;
	}

	public void setuID(int uID) {
		this.uID = uID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
