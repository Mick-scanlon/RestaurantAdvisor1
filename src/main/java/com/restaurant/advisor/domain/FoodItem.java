package com.restaurant.advisor.domain;

public class FoodItem {
	
	String foodName;
	int price;
	int restID;

	public FoodItem() {}
	
	public FoodItem(int restID, String foodName,int price) {
		this.foodName = foodName;
		this.restID = restID;
		this.price = price;
	}
	public int getFoodPrice() {
		return price;
	}
	public void setFoodPrice(int foodPrice) {
		this.price = foodPrice;
	}	
	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getRestID() {
		return restID;
	}

	public void setRestID(int restID) {
		this.restID = restID;
	}

	public String toString() {
		return restID+" "+foodName+" "+price;
	}
}
