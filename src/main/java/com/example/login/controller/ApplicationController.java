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
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.login.model.Driver;
import com.example.login.model.Trip;
import com.example.login.model.User;
import com.example.login.services.DriverService;
import com.example.login.services.TripService;
import com.example.login.services.UserService;

@Controller
@SessionAttributes("users.firstname")
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
	@RequestMapping("/loginDriver")
	public String LoginDriver()
	{
		return "loginpagedriver";
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
		return "userdashboard";
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
			
			//request.setAttribute("users",userService.showSpecificUsers(user.getEmail()));
			request.setAttribute("users",userService.findByEmail(user.getEmail()));
			return "userdashboard";
		}
		else {
			request.setAttribute("error","Invalid credentials");
			return "loginpage";
		}
		
		
	}
	@RequestMapping("/verify-driver")
	public String verifyDriver(@ModelAttribute Driver driver,HttpServletRequest request) {
		
		if(driverService.findByEmailAndPassword(driver.getEmail(),driver.getPassword())!=null) {
			Driver obj=driverService.findByEmail(driver.getEmail());
			int id=obj.getId();
			request.setAttribute("drivers",driverService.findByEmail(driver.getEmail()));
			//request.setAttribute("trips1",tripService.showHistoryDriver(id));
			request.setAttribute("trips1",tripService.findallById(id));
			return "driverdashboard";
		}
		else {
			request.setAttribute("error","Invalid credentials");
			return "loginpagedriver";
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
		return "showpagedriver";
	}
	
	@RequestMapping("/delete-driver")
	public String deleteDriver(@RequestParam int id,HttpServletRequest request) {
		driverService.deleteMyDriver(id);
		request.setAttribute("drivers",driverService.showAllDrivers());
		return "showpagedriver";
	}
	
	@RequestMapping("/edit-driver")
	public String editDriver(@RequestParam int id,HttpServletRequest request) {
		driverService.editMyDriver(id);
		request.setAttribute("driver",driverService.editMyDriver(id));
		return "editpagedriver";
	}
	
	/*@RequestMapping("/verify-driver")
	public String verifyDriver(@ModelAttribute Driver driver,HttpServletRequest request) {
		
		if(driverService.findByEmailAndPassword(driver.getEmail(),driver.getPassword())!=null) {
			
			request.setAttribute("drivers",driverService.showAllDrivers());
			return "showpagedriver";
		}
		else {
			request.setAttribute("error","Invalid credentials");
			return "loginpage";
		}
	}*/
	
	@Autowired
	private TripService tripService;
	
	@PostMapping("insert-trip")
	public String insertTrip(@ModelAttribute Trip trip,BindingResult bindingResult,HttpServletRequest request) {
		tripService.saveMyTrip(trip);
		//return "welcomepage";
		request.setAttribute("trips1",tripService.findById(trip.getDriverid()));
		return "driverdashboard";
	}
	
	@GetMapping("/show-trip")
	public String showAllTrips(HttpServletRequest request)
	{
		request.setAttribute("trips",tripService.showAllTrips());
		return "showtripdriver";
	}
	
	@RequestMapping("/delete-trip")
	public String deleteTrip(@RequestParam Long id,HttpServletRequest request) {
		tripService.deleteMyTrip(id);
		request.setAttribute("trips",tripService.showAllTrips());
		return "showtripdriver";
	}
	
	@RequestMapping("/edit-trip")
	public String editTrip(@RequestParam int id,HttpServletRequest request) {
		tripService.editMyTrip(id);
		request.setAttribute("trip",tripService.editMyTrip(id));
		return "edittripdriver";
	}
	
	@RequestMapping("/search-trip")
	public String searchTrip(@ModelAttribute Trip user,HttpServletRequest request) {
		
		if(tripService.findBySourceAndDestination(user.getSource(),user.getDestination())!=null) {
			
			request.setAttribute("trips",tripService.showAllTrips());
			return "showsearchtrip";
		}
		else {
			request.setAttribute("error","Invalid credentials");
			return "loginpage";
		}
	}
	
	
	
}
