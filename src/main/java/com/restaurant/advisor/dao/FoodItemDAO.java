package com.restaurant.advisor.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restaurant.advisor.domain.FoodItem;

@Component
public class FoodItemDAO {
	@Autowired
	private FoodItemMapper foodMapper;
	public List<FoodItem> getMenu(int restID){
		List<FoodItem> menu = new ArrayList<FoodItem>();
		menu = foodMapper.getMenu(restID);
		return menu;
	}
}
