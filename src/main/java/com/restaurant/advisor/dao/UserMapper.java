package com.restaurant.advisor.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.restaurant.advisor.domain.User;
@Mapper
public interface UserMapper {

	@Select("SELECT EMAIL, FNAME, LNAME, PHONE, PASSWORD, STREETNO, STREETNAME, CITY, STATE, ZIP FROM RESTAURANT_CUSTOMER")
	List<User> getUserList();
	@Insert("INSERT INTO RESTAURANT_CUSTOMER(EMAIL, FNAME, LNAME, PHONE, PASSWORD, STREETNO, STREETNAME, CITY, STATE, ZIP) "
			+ "VALUES(#{email}, #{fname}, #{lname}, #{phone}, #{password}, #{streetno}, #{streetName},#{city},#{state},#{zip})")
	void insertUser(User u);
	
	void setCurrentUser(User u);
}
