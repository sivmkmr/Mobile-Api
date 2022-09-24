package com.mobile.mobileservice;

import com.mobile.apiresponse.ApiResponse;
import com.mobile.mobiledetailsmodel.MobileDetailsModel;

public interface MobileService {

	public ApiResponse dummyApi();

	public ApiResponse saveData(MobileDetailsModel mobileDetailsModel);

	public ApiResponse getAllData();

	public ApiResponse getDataById(Integer id);

	public ApiResponse dataUpdation(MobileDetailsModel mobileDetailsModel, Integer id);
	
	public ApiResponse dataDeleteById(Integer id);
}
