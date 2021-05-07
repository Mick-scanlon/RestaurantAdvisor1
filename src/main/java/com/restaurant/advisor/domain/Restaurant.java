package com.restaurant.advisor.domain;

public class Restaurant {
	String name;
	String phone;
	String email;
	int restID;
	
	public Restaurant(int restID,String name, String phone, String email) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.restID = restID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getRestID() {
		return restID;
	}
	public void setRestID(int restID) {
		this.restID = restID;
	}
	
	public String toString() {
		return "Restaurant "+ name + email + phone;
	}
	
	
}
