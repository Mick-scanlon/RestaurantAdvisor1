package com.restaurant.advisor.service;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.restaurant.advisor.dao.UserDAO;
import com.restaurant.advisor.domain.User;

@Component
public class UserService {

	@Autowired
	UserDAO userDAO;
	
	public List<User> getUserList(){
		return userDAO.getUserList();
	}
	
	public void insertUser(User u) {
		userDAO.insertUser(u);
	}
	
	
	public void setCurrentUser(User u) {
		userDAO.setCurrentUser(u);
	}

}
