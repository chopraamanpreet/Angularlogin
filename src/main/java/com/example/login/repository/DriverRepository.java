package com.example.login.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.login.model.Driver;


public interface DriverRepository extends CrudRepository<Driver, Integer> {

	public Driver findByEmailAndPassword(String email,String password);
	public Driver findByEmail(String email);
	public Driver findById(int id);
}
