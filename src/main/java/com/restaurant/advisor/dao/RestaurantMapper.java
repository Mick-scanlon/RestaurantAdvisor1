package com.restaurant.advisor.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.restaurant.advisor.domain.Restaurant;
import com.restaurant.advisor.domain.Order;
import com.restaurant.advisor.domain.Review;

@Mapper
public interface RestaurantMapper {
	
	@Select("SELECT RESTID, RNAME, PHONE, EMAIL FROM RESTAURANT")
	List<Restaurant> getRestList();
	@Select("SELECT ONO, ORDERDATE, CUSTEMAIL, ORDERDINEINFLAG, ORDERDELIVERYFLAG, ORDERPICKUPFLAG FROM RESTAURANT_ORDER")
	List<Order> getOrderList();
	@Insert("INSERT INTO RESTAURANT_ORDER(ONO, ORDERDATE, CUSTEMAIL, ORDERDINEINFLAG, ORDERDELIVERYFLAG, ORDERPICKUPFLAG)"+
	"VALUES(#{ono}, #{orderDate}, #{custEmail}, #{orderDineInFlag}, #{orderDeliveryFlag}, #{orderPickUpFlag})")
	void insertOrder(Order o);
	@Select("SELECT REVIEWID, RESTID, RATING, CUSTEMAIL, REVIEWDESCR FROM CUST_REVIEW")
	List<Review> getReviewList();
	@Insert("INSERT INTO CUST_REVIEW(REVIEWID, RESTID, RATING, CUSTEMAIL, REVIEWDESCR)"+
	"VALUES(#{reviewID}, #{restID}, #{rating}, #{custEmail}, #{reviewDescr})")
	void insertReview(Review r);
}
