package com.restaurant.advisor.dao;

import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.restaurant.advisor.domain.User;

@Component
public class UserDAO {
	@Autowired
	private UserMapper userMapper;
	public List<User> getUserList(){
		List<User> userList = new ArrayList<User>();
		userList = userMapper.getUserList();
		return userList;
	}

	public void insertUser(User u) {
		userMapper.insertUser(u);
	}
	
	public void setCurrentUser(User u) {
		userMapper.setCurrentUser(u);
	}
}
