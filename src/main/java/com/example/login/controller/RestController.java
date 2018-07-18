package com.example.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.login.model.Driver;
import com.example.login.model.Trip;
import com.example.login.model.User;
import com.example.login.services.DriverService;
import com.example.login.services.TripService;
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
	public String saveUser(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String email, @RequestParam int contact, @RequestParam String gender, @RequestParam String address, @RequestParam String password) {
		User user=new User(firstname,lastname,email,contact,gender,address,password);
		userService.saveMyUser(user);
		return "The user is saved";
	}
	
	@Autowired
	private DriverService driverService;
	
	
	@GetMapping("/save-driver")
	public String saveDriver(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String email, @RequestParam int contact, @RequestParam String gender, @RequestParam String address, @RequestParam String password ) {
		Driver driver=new Driver(firstname,lastname,email,contact,gender,address,password);
		driverService.saveMyDriver(driver);
		return "The driver is saved";
	}
	
	@Autowired
	private TripService tripService;
	
	
	@GetMapping("/save-trip")
	public String saveTrip(@RequestParam int driverid, @RequestParam String source, @RequestParam String destination ) {
		Trip trip=new Trip(driverid,source,destination);
		tripService.saveMyTrip(trip);
		return "The trip is saved";
	}
}
