package com.example.login.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.login.model.Trip;

public interface TripRepository extends CrudRepository<Trip, Integer> {

	public Trip findBySourceAndDestination(String source,String destination);
}
