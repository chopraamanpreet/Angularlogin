package com.example.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.login.model.User;
import com.example.login.services.UserService;

@Controller
public class ApplicationController {
	
	@ResponseBody
	@RequestMapping("/home")
	public String home()
	{
		return "This is Home page";
	}
	
	@RequestMapping("/welcome")
	public String Welcome()
	{
		return "welcomepage";
	}
	
	@RequestMapping("/login")
	public String Login()
	{
		return "loginpage";
	}
	
	@Autowired
	private UserService userService;
	
	@PostMapping("insert")
	public String insertUser(@ModelAttribute User user,BindingResult bindingResult,HttpServletRequest request) {
		userService.saveMyUser(user);
		//return "welcomepage";
		request.setAttribute("users",userService.showAllUsers());
		return "showpage";
	}
	
	@GetMapping("/show")
	public String showAllUsers(HttpServletRequest request)
	{
		request.setAttribute("users",userService.showAllUsers());
		return "showpage";
	}
	
	@RequestMapping("/delete-user")
	public String deleteUser(@RequestParam int id,HttpServletRequest request) {
		userService.deleteMyUser(id);
		request.setAttribute("users",userService.showAllUsers());
		return "showpage";
	}
	
	@RequestMapping("/edit-user")
	public String editUser(@RequestParam int id,HttpServletRequest request) {
		userService.editMyUser(id);
		request.setAttribute("user",userService.editMyUser(id));
		return "editpage";
	}
	
	@RequestMapping("/verify-user")
	public String verifyUser(@ModelAttribute User user,HttpServletRequest request) {
		
		if(userService.findByUsernameAndPassword(user.getUsername(),user.getPassword())!=null) {
			
			request.setAttribute("users",userService.showAllUsers());
			return "showpage";
		}
		else {
			request.setAttribute("error","Invalid credentials");
			return "loginpage";
		}
		
		
	}
	
	
}
