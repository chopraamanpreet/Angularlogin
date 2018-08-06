package com.example.login.services;
import java.util.ArrayList;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.login.model.RecentTrip;
import com.example.login.model.Trip;
import com.example.login.repository.RecentTripRepository;

@Service
@Transactional
public class RecentTripService {

private final RecentTripRepository tripRepository;	
	
	public RecentTripService(RecentTripRepository tripRepository) {
		this.tripRepository=tripRepository;
	}
	
	public void saveMyTrip(RecentTrip trip)
		{
			tripRepository.save(trip);
		}
	
	public List<RecentTrip> showAllTrips(){
		
		List<RecentTrip> trips=new ArrayList<RecentTrip>();
		for(RecentTrip trip:tripRepository.findAll()) {
			trips.add(trip);
			}
		return trips;
	}
	
	public void deleteMyTrip(Long id) {
		tripRepository.deleteById(id);
	}
	
	public RecentTrip editMyTrip(int id) {
		//return userRepository.findOne(id);
		RecentTrip trip1 = null;
		for(RecentTrip trip:tripRepository.findAll()) {
			if(trip.getId()==id)
			{
				trip1=trip;
				break;
			}
		
		}
		return trip1;

	}
	
	public List<RecentTrip> findBySourceAndDestination(String source,String destination) {
		return tripRepository.findBySourceAndDestination(source, destination);
	}
	public Iterable<RecentTrip> findallById(int id) {
		return tripRepository.findAllByUserid(id);
	}
	public RecentTrip findById(int id) {
		return tripRepository.findById(id);
	}
	/*public List<Trip> showHistoryDriver() {
	return tripRepository.getHistoryDriver();
}*/
}
