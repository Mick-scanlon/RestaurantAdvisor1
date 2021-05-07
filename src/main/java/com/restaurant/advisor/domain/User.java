package com.restaurant.advisor.domain;

public class User {
	
	String email, fname, lname, password, phone, streetno, streetName, city, state, zip;

	public User(String email, String fname, String lname, String phone, String password, String streetno,
				String streetName, String city, String state, String zip){
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.password = password;
		this.streetno = streetno;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public String getEmail(){
		return email;
	}
	public String getFname(){
		return fname;
	}
	public String getLname(){
		return lname;
	}
	public String getPassword(){
		return password;
	}
	public String getPhone(){
		return phone;
	}
	public String getStreetNo(){
		return streetno;
	}
	public String getStreetName(){
		return streetName;
	}
	public String getCity(){
		return city;
	}
	public String getState(){
		return state;
	}
	public String getZip(){
		return zip;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setFname(String fname){
		this.fname = fname;
	}
	public void setLname(String lname){
		this.lname = lname;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public void setStreetNo(String streetno){
		this.streetno = streetno;
	}
	public void setStreetName(String streetName){
		this.streetName = streetName;
	}
	public void setCity(String city){
		this.city = city;
	}
	public void setState(String state){
		this.state = state;
	}
	public void setZip(String zip){
		this.zip = zip;
	}
	public String toString() {
		return fname+" "+lname;
	}
}
