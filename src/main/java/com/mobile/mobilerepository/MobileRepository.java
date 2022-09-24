package com.mobile.mobilerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobile.mobiledetails.MobileDetails;

public interface MobileRepository extends JpaRepository<MobileDetails, Integer> {

	
	
}
