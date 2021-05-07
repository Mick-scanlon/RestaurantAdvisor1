package com.restaurant.advisor.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.restaurant.advisor.domain.RegisterCommand;
import com.restaurant.advisor.domain.User;
import com.restaurant.advisor.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping(value = "/displayUsers", method = RequestMethod.GET)
	public String formUserDisplay(Model model) {
		List<User> userList = new ArrayList<User>();

		userList = userService.getUserList();
		model.addAttribute("userList",userList);
		return "displayUsers";
	}
	@RequestMapping(value = "/registerForm", method = RequestMethod.POST)
	public String formExampleSubmission( @ModelAttribute RegisterCommand registerCommand, Model model) {
		
		List<User> userList = new ArrayList<User>();
		userList = userService.getUserList();
		
		for(User u : userList) {
			if(registerCommand.getEmail().equals(u.getEmail())) {
				return "emailExists";
		}}
		for(User u : userList) {
			if(registerCommand.getPhone().equals(u.getPhone())) {
				return "phoneExists";
		}}
		User newU = new User(registerCommand.getEmail(),registerCommand.getFname(), registerCommand.getLname(), registerCommand.getPhone(),
				registerCommand.getPassword(), registerCommand.getStreetno(), registerCommand.getStreetName(), registerCommand.getCity(), registerCommand.getState(), registerCommand.getZip());
		userService.insertUser(newU);

		model.addAttribute("registerCommand",registerCommand);
		return "formResults";
	}
	
	@RequestMapping(value="/checkLogin", method = RequestMethod.POST)
	public String checkLogin(HttpServletRequest request, Model model) {
		List<User> userList = new ArrayList<User>();
		userList = userService.getUserList();
		String password = request.getParameter("password");
		String email = request.getParameter("username");
		
		for(User u : userList) {
			if (u.getPassword().equals(password) & u.getEmail().equals(email)) {
				model.addAttribute("user",u);
				return "checkLogin";
			}
		}
		
		return "failLogin";
	}
	@RequestMapping(value = "/registerForm", method = RequestMethod.GET)
	public String formExampleDisplay( @ModelAttribute RegisterCommand registerCommand, Model model) {
		model.addAttribute("registerCommand",registerCommand);


		return "registerForm";
	}
	
}
