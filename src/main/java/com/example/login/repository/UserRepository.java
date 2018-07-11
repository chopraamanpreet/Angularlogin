package com.example.login.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.login.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByEmailAndPassword(String email,String password);
}
