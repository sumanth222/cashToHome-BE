package com.js.cashToHome.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.js.cashToHome.Entities.LocationDetails;

public interface LocationDetailRepo extends JpaRepository<LocationDetails,Long>{
	
}
