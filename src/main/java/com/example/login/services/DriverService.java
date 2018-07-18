package com.example.login.services;

import java.util.ArrayList;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.login.model.Driver;
import com.example.login.repository.DriverRepository;

@Service
@Transactional
public class DriverService {
	
	private final DriverRepository driverRepository;	
	
	public DriverService(DriverRepository driverRepository) {
		this.driverRepository=driverRepository;
	}
	
	public void saveMyDriver(Driver driver)
		{
			driverRepository.save(driver);
		}
	
	public List<Driver> showAllDrivers(){
		
		List<Driver> drivers=new ArrayList<Driver>();
		for(Driver driver:driverRepository.findAll()) {
			drivers.add(driver);
			}
		return drivers;
	}
	
	public void deleteMyDriver(int id) {
		driverRepository.deleteById(id);
	}
	
	public Driver editMyDriver(int id) {
		//return userRepository.findOne(id);
		Driver driver1 = null;
		for(Driver driver:driverRepository.findAll()) {
			if(driver.getId()==id)
			{
				driver1=driver;
				break;
			}
		
		}
		return driver1;

	}
	
	public Driver findByEmailAndPassword(String email,String password) {
		return driverRepository.findByEmailAndPassword(email, password);
	}
}
