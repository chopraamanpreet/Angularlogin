package com.example.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.login.model.User;
import com.example.login.services.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String hello()
	{
		return "This id Home DB";
	}
	
	@GetMapping("/save-user")
	public String saveUser(@RequestParam String username,@RequestParam String password) {
		User user=new User(username,password);
		userService.saveMyUser(user);
		return "The user is saved";
	}
}
