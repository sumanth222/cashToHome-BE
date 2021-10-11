package com.js.cashToHome.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.cashToHome.Entities.LocationDetails;
import com.js.cashToHome.Repositories.LocationDetailRepo;

@Service
public class LocationDetailService{
	
	@Autowired
	private LocationDetailRepo locRepo;
	
	public void saveDetails(LocationDetails ld) {
		locRepo.save(ld);
	}
	
	public List<LocationDetails> getAll(){
		return locRepo.findAll();
	}
}