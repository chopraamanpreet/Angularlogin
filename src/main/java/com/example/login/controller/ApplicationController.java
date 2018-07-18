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

import com.example.login.model.Driver;
import com.example.login.model.Trip;
import com.example.login.model.User;
import com.example.login.services.DriverService;
import com.example.login.services.TripService;
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
	
	@RequestMapping("/driverregister")
	public String DriverRegister()
	{
		return "registerdriver";
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
		
		if(userService.findByEmailAndPassword(user.getEmail(),user.getPassword())!=null) {
			
			request.setAttribute("users",userService.showAllUsers());
			return "showpage";
		}
		else {
			request.setAttribute("error","Invalid credentials");
			return "loginpage";
		}
		
		
	}
	
	@Autowired
	private DriverService driverService;
	
	@PostMapping("insert-driver")
	public String insertDriver(@ModelAttribute Driver driver,BindingResult bindingResult,HttpServletRequest request) {
		driverService.saveMyDriver(driver);
		//return "welcomepage";
		request.setAttribute("drivers",driverService.showAllDrivers());
		return "driverdashboard";
	}
	
	@GetMapping("/show-driver")
	public String showAllDrivers(HttpServletRequest request)
	{
		request.setAttribute("drivers",driverService.showAllDrivers());
		return "showpage";
	}
	
	@RequestMapping("/delete-driver")
	public String deleteDriver(@RequestParam int id,HttpServletRequest request) {
		driverService.deleteMyDriver(id);
		request.setAttribute("drivers",driverService.showAllDrivers());
		return "showpage";
	}
	
	@RequestMapping("/edit-driver")
	public String editDriver(@RequestParam int id,HttpServletRequest request) {
		driverService.editMyDriver(id);
		request.setAttribute("driver",driverService.editMyDriver(id));
		return "editpage";
	}
	
	@RequestMapping("/verify-driver")
	public String verifyDriver(@ModelAttribute Driver user,HttpServletRequest request) {
		
		if(driverService.findByEmailAndPassword(user.getEmail(),user.getPassword())!=null) {
			
			request.setAttribute("drivers",driverService.showAllDrivers());
			return "showpage";
		}
		else {
			request.setAttribute("error","Invalid credentials");
			return "loginpage";
		}
	}
	
	@Autowired
	private TripService tripService;
	
	@PostMapping("insert-trip")
	public String insertTrip(@ModelAttribute Trip trip,BindingResult bindingResult,HttpServletRequest request) {
		tripService.saveMyTrip(trip);
		//return "welcomepage";
		request.setAttribute("trips",tripService.showAllTrips());
		return "showpage";
	}
	
	@GetMapping("/show-trip")
	public String showAllTrips(HttpServletRequest request)
	{
		request.setAttribute("trips",tripService.showAllTrips());
		return "showpage";
	}
	
	@RequestMapping("/delete-trip")
	public String deleteTrip(@RequestParam int id,HttpServletRequest request) {
		tripService.deleteMyTrip(id);
		request.setAttribute("trips",tripService.showAllTrips());
		return "showpage";
	}
	
	@RequestMapping("/edit-trip")
	public String editTrip(@RequestParam int id,HttpServletRequest request) {
		tripService.editMyTrip(id);
		request.setAttribute("trip",tripService.editMyTrip(id));
		return "editpage";
	}
	
	@RequestMapping("/verify-trip")
	public String verifyTrip(@ModelAttribute Trip user,HttpServletRequest request) {
		
		if(tripService.findBySourceAndDestination(user.getSource(),user.getDestination())!=null) {
			
			request.setAttribute("trips",tripService.showAllTrips());
			return "showpage";
		}
		else {
			request.setAttribute("error","Invalid credentials");
			return "loginpage";
		}
	}
}
