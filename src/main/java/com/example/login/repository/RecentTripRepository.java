package com.example.login.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.login.model.RecentTrip;
import com.example.login.model.Trip;

public interface RecentTripRepository extends CrudRepository<RecentTrip, Long>{
	public List<RecentTrip> findBySourceAndDestination(String source,String destination);
	public RecentTrip findById(int id);
	//@Query(value="SELECT t.source,t.destination FROM drivertrip t where t.id = 5;",nativeQuery = true)
	//@Query(value="select u.source,u.destination from (select source source,destination destination from drivertrip)u;",nativeQuery = true)
	//public List<Trip> getHistoryDriver();
	public Iterable<RecentTrip> findAllByUserid(int id);
}
