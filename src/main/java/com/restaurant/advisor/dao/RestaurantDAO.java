package com.restaurant.advisor.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restaurant.advisor.domain.Restaurant;
import com.restaurant.advisor.domain.Order;
import com.restaurant.advisor.domain.Review;

@Component
public class RestaurantDAO {
	@Autowired
	private RestaurantMapper restaurantMapper;
	public List<Restaurant> getRestList(){
		List<Restaurant> restList = new ArrayList<Restaurant>();
		restList = restaurantMapper.getRestList();
		return restList;
	}
	public List<Order> getOrderList(){
		List<Order> orderList = new ArrayList<Order>();
		orderList = restaurantMapper.getOrderList();
		return orderList;
	}
	public void insertOrder(Order o) {
		restaurantMapper.insertOrder(o);
	}
	public void insertReview(Review r) {
		restaurantMapper.insertReview(r);
	}
	public List<Review> getReviewList(){
		List<Review> reviewList = new ArrayList<Review>();
		reviewList = restaurantMapper.getReviewList();
		return reviewList;
	}
}
