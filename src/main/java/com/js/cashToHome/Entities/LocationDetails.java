package com.js.cashToHome.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
@Table(name = "LocationInfo")
public class LocationDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loc_seq_gen")
	@SequenceGenerator(name="loc_seq_gen", sequenceName = "loc_seq", allocationSize=1)
	private Long id;
	private String userName;
	private String lat;
	private String lng;
	private String address;
	private String requestAccepted;
	
	
	public LocationDetails() {
		super();
	}

 
	public LocationDetails(Long id, String userName, String lat, String lng, String address, String requestAccepted) {
		super();
		this.id = id;
		this.userName = userName;
		this.lat = lat;
		this.lng = lng;
		this.address = address;
		this.requestAccepted = requestAccepted;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getLat() {
		return lat;
	}


	public void setLat(String lat) {
		this.lat = lat;
	}


	public String getLng() {
		return lng;
	}


	public void setLng(String lng) {
		this.lng = lng;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getRequestAccepted() {
		return requestAccepted;
	}


	public void setRequestAccepted(String requestAccepted) {
		this.requestAccepted = requestAccepted;
	}
	
	
	
}
