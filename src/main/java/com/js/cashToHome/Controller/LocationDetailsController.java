package com.js.cashToHome.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.js.cashToHome.Entities.LocationDetails;
import com.js.cashToHome.Service.LocationDetailService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LocationDetailsController{

	@Autowired
	private LocationDetailService locService;
	
	@RequestMapping(value="/saveLocation")
	public void saveLocation(@RequestBody LocationDetails locDetails) {
		locService.saveDetails(locDetails);
	}
	
	@RequestMapping(value = "/sample")
	public String sample() {
		return "Hi";
	}
	
	@RequestMapping(value="/getAll")
	public List<LocationDetails> retLocDetails(){
		return locService.getAll();
	}
	
	@RequestMapping(value="/modifyReq")
	public void modifyReq(@RequestBody LocationDetails locDetails) {
		System.out.println("Hi");
		System.out.println(locDetails.getId()+ " " +locDetails.getRequestAccepted());
		locService.modifyRequest(locDetails.getId(), locDetails.getRequestAccepted());
	}
}
