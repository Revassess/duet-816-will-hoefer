package com.revature.tier1;

public class User {
	Integer id;
	String firstName;
	String lastName;
	String userName;
	String password;
	String role;

	public User(Integer id, String firstName, String lastName, String userName, String password, String role) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	};
	

	public static void main(String[] args) {
        String[] fieldNames = { "id", "firstName", "lastName", "username", "password", "role" };
	}
	
	}
	

