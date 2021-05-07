package com.restaurant.advisor.domain;

public class RegisterCommand {
    
	String fname, lname, email, password, phone, streetno, streetName, city, state, zip;
    
	public RegisterCommand() {
    	
    }
	public RegisterCommand(String fname, String lname, String email, String password, String phone, 
			String streetno, String streetName, String city, String state, String zip) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.city = city;
		this.phone = phone;
		this.streetName = streetName;
		this.streetno = streetno;
		this.zip = zip;
		this.state = state;
	}  
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStreetno() {
		return streetno;
	}
	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

    
    public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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

    public String toString() {
    	return "Email: "+email+"\n"+"Name: "+fname+" "+lname;
    }
    
}