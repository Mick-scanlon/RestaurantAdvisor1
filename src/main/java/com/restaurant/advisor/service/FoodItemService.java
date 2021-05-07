package com.restaurant.advisor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restaurant.advisor.dao.FoodItemDAO;
import com.restaurant.advisor.domain.FoodItem;

@Component
public class FoodItemService {
	@Autowired
	FoodItemDAO foodItemDAO;
		
	public List<FoodItem> getMenu(int restID){
		return foodItemDAO.getMenu(restID);
	}
}

