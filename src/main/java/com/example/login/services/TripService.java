package com.example.login.services;

import java.util.ArrayList;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.login.model.Trip;
import com.example.login.repository.TripRepository;

@Service
@Transactional
public class TripService {
	
	private final TripRepository tripRepository;	
	
	public TripService(TripRepository tripRepository) {
		this.tripRepository=tripRepository;
	}
	
	public void saveMyTrip(Trip trip)
		{
			tripRepository.save(trip);
		}
	
	public List<Trip> showAllTrips(){
		
		List<Trip> trips=new ArrayList<Trip>();
		for(Trip trip:tripRepository.findAll()) {
			trips.add(trip);
			}
		return trips;
	}
	
	public void deleteMyTrip(int id) {
		tripRepository.deleteById(id);
	}
	
	public Trip editMyTrip(int id) {
		//return userRepository.findOne(id);
		Trip trip1 = null;
		for(Trip trip:tripRepository.findAll()) {
			if(trip.getId()==id)
			{
				trip1=trip;
				break;
			}
		
		}
		return trip1;

	}
	
	public Trip findBySourceAndDestination(String source,String destination) {
		return tripRepository.findBySourceAndDestination(source, destination);
	}
}
