package com.restaurant.advisor.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date; 
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.restaurant.advisor.domain.Review;
import com.restaurant.advisor.domain.Restaurant;
import com.restaurant.advisor.domain.Order;
import com.restaurant.advisor.service.RestaurantService;

@Controller
public class RestaurantController {
	@Autowired
	RestaurantService restService;

	@RequestMapping(value = "/displayRestaurants", method = RequestMethod.GET)
	public String formRestaurantDisplay(Model model) {
		List<Restaurant> restList = new ArrayList<Restaurant>();

		restList = restService.getRestList();
		model.addAttribute("restList",restList);
		return "displayRestaurants";
	}
	@RequestMapping(value = "/orderRestaurants", method = RequestMethod.GET)
	public String formRestaurantOrderDisplay(Model model) {
		List<Restaurant> restList = new ArrayList<Restaurant>();

		restList = restService.getRestList();
		model.addAttribute("restList",restList);
		return "orderRestaurants";
	}
	@RequestMapping(value = "/createOrder", method = RequestMethod.POST)
	public String formOrderDisplay(HttpServletRequest request, Model model) {
		List<Order> orderList = new ArrayList<Order>();
		Order newOrder = new Order();
		orderList = restService.getOrderList();
		Random rand = new Random();
		int ono = rand.nextInt(100000);
		boolean flag = false;
		while(flag == false) {
			for(Order o : orderList) {
				if(ono == o.getOno()) {
					ono = rand.nextInt(100000);
					break;
				}
				else {
					flag = true;
				}
			}
		}
		newOrder.setOno(ono);
		String custEmail = request.getParameter("custEmail");
		newOrder.setCustEmail(custEmail);
		String orderFlag = request.getParameter("orderTypeFlag");
		if(orderFlag.equals("1")) {
			newOrder.setOrderPickUpFlag("Y");
			newOrder.setOrderDineInFlag("N");
			newOrder.setOrderDeliveryFlag("N");
		}
		else if(orderFlag.equals("2")) {
			newOrder.setOrderDineInFlag("Y");
			newOrder.setOrderDeliveryFlag("N");
			newOrder.setOrderPickUpFlag("N");
		}
		else if(orderFlag.equals("3")) {
			newOrder.setOrderDeliveryFlag("Y");
			newOrder.setOrderPickUpFlag("N");
			newOrder.setOrderDineInFlag("N");
		}
		Date date = new Date();
		newOrder.setOrderDate(date);
		restService.insertOrder(newOrder);
		model.addAttribute("order",newOrder);
		return "displayOrder";
	}
	@RequestMapping(value = "/displayReviews", method = RequestMethod.GET)
	public String formReviewDisplay(Model model) {
		List<Review> reviewList = new ArrayList<Review>();
		
		reviewList = restService.getReviewList();
		model.addAttribute("reviewList",reviewList);
		
		List<Restaurant> restList = new ArrayList<Restaurant>();
		restList = restService.getRestList();
		model.addAttribute("restList",restList);
		
		return "displayReviews";
	}
	@RequestMapping(value = "/submitReview", method = RequestMethod.POST)
	public String handleReviewSubmit(@ModelAttribute Review newReview, Model model) {
		List<Review> reviewList = new ArrayList<Review>();
		reviewList = restService.getReviewList();
		
		Random rand = new Random();
		int randID = rand.nextInt(100000);
		boolean flag = false;
		while(flag == false) {
			for(Review r : reviewList) {
				if(randID == r.getReviewID()) {
					randID = rand.nextInt(100000);
					break;
				}
				else {
					flag = true;
				}
			}
		}
		newReview.setReviewID(randID);
		restService.insertReview(newReview);
		
		return "submitReview";
	}
	@RequestMapping(value ="/writeReview", method = RequestMethod.GET)
	public String handleReviewWrite(@ModelAttribute Review newReview, Model model) {	
		newReview = new Review();
		model.addAttribute("newReview",newReview);
		List<Restaurant> restList = new ArrayList<Restaurant>();

		restList = restService.getRestList();
		model.addAttribute("restList",restList);	
		return "writeReview";
	}
}
