package com.restaurant.advisor.domain;

public class Review {
	int reviewID, rating, restID;
	String custEmail, reviewDescr;

	public Review() {}
	public Review(int reviewID){
		this.reviewID = reviewID;
	}
	
	public Review(int reviewID,int restID, int rating, String custEmail, String reviewDescr) {
		this.reviewID = reviewID;
		this.rating = rating;
		this.custEmail = custEmail;
		this.reviewDescr = reviewDescr;
		this.restID = restID;	
	}
	public int getRestID() {
		return restID;
	}

	public void setRestID(int restID) {
		this.restID = restID;
	}
	public int getReviewID() {
		return reviewID;
	}

	public void setReviewID(int reviewID) {
		this.reviewID = reviewID;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getReviewDescr() {
		return reviewDescr;
	}

	public void setReviewDescr(String reviewDescription) {
		this.reviewDescr = reviewDescription;
	}
	
}
