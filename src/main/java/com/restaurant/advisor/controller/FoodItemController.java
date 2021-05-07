package com.restaurant.advisor.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.restaurant.advisor.domain.FoodItem;
import com.restaurant.advisor.service.FoodItemService;

@Controller
public class FoodItemController {
	@Autowired
	FoodItemService foodItemService; 
	@RequestMapping(value = "/displayMenu", method = RequestMethod.POST)
	public String formRestaurantDisplay(HttpServletRequest request, Model model) {
		String restID1 = request.getParameter("restID");
		int restID = Integer.parseInt(restID1);
		
		List<FoodItem> menu = new ArrayList<FoodItem>();
		menu = foodItemService.getMenu(restID);
		model.addAttribute("menu",menu);
		
		return "displayMenu";
	}
}
