package com.mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.apiresponse.ApiResponse;
import com.mobile.mobiledetailsmodel.MobileDetailsModel;
import com.mobile.serviceimplement.ServiceImplement;

@RestController
public class Controller {

	@Autowired
	ServiceImplement serviceImplement;

//	Dummy API Block for Testing
	
//	@GetMapping("/dummy-api")
//	public ApiResponse dummyApi() {
//		return serviceImplement.dummyApi();
//	}
	
	

	@GetMapping("/dummy-api")
	public ResponseEntity<ApiResponse> dummyApi() {
		ApiResponse response = serviceImplement.dummyApi();
		return new ResponseEntity<ApiResponse>(response,HttpStatus.OK);
	}

//	Data Insertion Block 

	@PostMapping("/data-insertion")
	public ResponseEntity<ApiResponse> saveData(@RequestBody MobileDetailsModel mobileDetailsModel) {
		ApiResponse response = serviceImplement.saveData(mobileDetailsModel);
		return new ResponseEntity<ApiResponse>(response,HttpStatus.OK);
	}

//	Get All Data Block 

	@GetMapping("/get-all-data")
	public ApiResponse getAllData() {
		return serviceImplement.getAllData();

	}

//	Get Data By Id

	@GetMapping("/get-data-by-id/{id}")
	public ApiResponse getDataById(@PathVariable("id") Integer id) {
		return serviceImplement.getDataById(id);

	}
	
//	Data Updation Block 
	
	@PutMapping("/data-updation-by-id/{id}")
	public ApiResponse dataUpdation(@RequestBody MobileDetailsModel mobileDetailsModel, @PathVariable("id") Integer id) {
		return serviceImplement.dataUpdation(mobileDetailsModel,id);
		
	}
	
//	Data Deletion By Id
	
	@DeleteMapping("/data-deletion-by-id/{id}")
	public ApiResponse dataDeleteById(@PathVariable("id") Integer id) {
		return serviceImplement.dataDeleteById(id);
	}
	
	
	
	
	
}

//

//

//