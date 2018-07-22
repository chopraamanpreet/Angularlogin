package com.example.login.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.login.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByEmailAndPassword(String email,String password);
	
	/*@Query("SELECT u.email,u.firstname FROM User u where email= :email1")
	List<String> getAllEmail(@Param("email1") String email1);*/
	public User findByEmail(String email);
}
