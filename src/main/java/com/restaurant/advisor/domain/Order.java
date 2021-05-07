package com.restaurant.advisor.domain;

import java.util.Date;

public class Order {
	int ono;
	Date orderDate;
	String custEmail;
	String orderDineInFlag, orderDeliveryFlag, orderPickUpFlag;
	
	public Order() {}
	
	public Order(int ono, Date orderDate, String odf,
			String odf2, String opf) {
		this.ono = ono;
		this.orderDate = orderDate;
		this.orderDeliveryFlag = odf2;
		this.orderPickUpFlag = opf;
		this.orderDineInFlag = odf;
	}
	
	public int getOno() {
		return ono;
	}
	public void setOno(int ono) {
		this.ono = ono;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String isOrderDineInFlag() {
		return orderDineInFlag;
	}
	public void setOrderDineInFlag(String orderDineInFlag) {
		this.orderDineInFlag = orderDineInFlag;
	}
	public String isOrderDeliveryFlag() {
		return orderDeliveryFlag;
	}
	public void setOrderDeliveryFlag(String orderDeliveryFlag) {
		this.orderDeliveryFlag = orderDeliveryFlag;
	}
	public String isOrderPickUpFlag() {
		return orderPickUpFlag;
	}
	public void setOrderPickUpFlag(String orderPickUpFlag) {
		this.orderPickUpFlag = orderPickUpFlag;
	}

	public String toString() {
		return "Your order Number is: "+ono+"\n"+"For email: "+custEmail;
	}

	
}
