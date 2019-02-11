package com.kienletrung.LoginProject.entity;

public class User {

	private String Id;
	private String name;
	private String password;

	

	public User(String Id, String name, String password) {
		this.Id = Id;
		this.name = name;
		this.password = password;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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

}
