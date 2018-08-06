package com.example.login.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recentsearch")
public class RecentTrip {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "userid")
	private int userid;
	@Column(name = "source")
	private String source;
	@Column(name = "destination")
	private String destination;
	
public RecentTrip() {
		
	}
	public RecentTrip(int userid, String source, String destination ) {
		super();
		this.userid = userid;
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
		return "Trip [id=" + id + ", userid=" + userid + ", source=" + source + ", destination=" + destination + "]";
	} 
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
