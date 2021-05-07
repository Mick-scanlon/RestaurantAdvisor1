package com.restaurant.advisor.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.restaurant.advisor.domain.FoodItem;

@Mapper
public interface FoodItemMapper {
	
	@Select("SELECT RESTID, FOODNAME, PRICE FROM MENU WHERE RESTID = #{restID}")
	List<FoodItem> getMenu(int restID);
	
}
