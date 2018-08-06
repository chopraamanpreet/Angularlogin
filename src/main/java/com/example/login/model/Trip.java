package com.example.login.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="drivertrip")
public class Trip {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "driverid")
	private int driverid;
	@Column(name = "source")
	private String source;
	@Column(name = "destination")
	private String destination;
	
	
	public Trip() {
		
	}
	public Trip(int driverid, String source, String destination ) {
		super();
		this.driverid = driverid;
		this.source = source;
		this.destination = destination;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Trip [id=" + id + ", driverid=" + driverid + ", source=" + source + ", destination=" + destination + "]";
	} 
	public int getDriverid() {
		return driverid;
	}
	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
		
}
