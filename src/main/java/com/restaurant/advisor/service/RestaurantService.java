package com.restaurant.advisor.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restaurant.advisor.dao.RestaurantDAO;
import com.restaurant.advisor.domain.Restaurant;
import com.restaurant.advisor.domain.Order;
import com.restaurant.advisor.domain.Review;


@Component
public class RestaurantService {
	
@Autowired
RestaurantDAO restDAO;
	
	public List<Restaurant> getRestList(){
		return restDAO.getRestList();
	}
	public List<Order> getOrderList(){
		return restDAO.getOrderList();
	}
	public List<Review> getReviewList(){
		return restDAO.getReviewList();
	}
	public void insertOrder(Order o) {
		restDAO.insertOrder(o);
	}
	public void insertReview(Review r) {
		restDAO.insertReview(r);
	}
}

