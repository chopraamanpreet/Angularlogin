package com.example.login.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.login.model.Trip;


public interface TripRepository extends CrudRepository<Trip, Long> {

	public Trip findBySourceAndDestination(String source,String destination);
	public Trip findById(int id);
	/*@Query("SELECT t.source,t.destination FROM Trip t where t.driverid =:driver")
	public List<Object[]> getHistoryDriver(@Param("driver")int id);*/
	public Iterable<Trip> findAllById(int id);
}
