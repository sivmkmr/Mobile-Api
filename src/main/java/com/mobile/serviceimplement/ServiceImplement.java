package com.mobile.serviceimplement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.apiresponse.ApiResponse;
import com.mobile.globalconstant.GlobalConstant;
import com.mobile.mobiledetails.MobileDetails;
import com.mobile.mobiledetailsmodel.MobileDetailsModel;
import com.mobile.mobilerepository.MobileRepository;
import com.mobile.mobileservice.MobileService;

@Service
public class ServiceImplement implements MobileService {

	@Autowired
	MobileRepository mobileRepository;

	MobileDetails mobileDetails = new MobileDetails();

//	Dummy API Block for Testing
	
//	public ApiResponse dummyApi() {
//	ApiResponse apiResponse = new ApiResponse();
//	apiResponse.setMessage("This is dummy API");
//	return apiResponse;
//}
	
	
	

	@Override
	public ApiResponse dummyApi() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(GlobalConstant.dummyApi);
		return apiResponse;
	}

//	Data Insertion Block 

	@Override
	public ApiResponse saveData(MobileDetailsModel mobileDetailsModel) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();

		MobileDetails mobileDetails = new MobileDetails();
		try {
			mobileDetails.setMobileName(mobileDetailsModel.getMobileName());
			mobileDetails.setMobileModel(mobileDetailsModel.getMobileModel());
			mobileDetails.setMobileColor(mobileDetailsModel.getMobileColor());
			mobileDetails.setMobileRam(mobileDetailsModel.getMobileRam());
			mobileDetails.setMobileRom(mobileDetailsModel.getMobileRom());
			mobileDetails.setMobilePrice(mobileDetailsModel.getMobilePrice());

			mobileRepository.save(mobileDetails);
			apiResponse.setMessage(GlobalConstant.insertionSuccess);
		} catch (Exception e) {
			apiResponse.setMessage(GlobalConstant.insertionFail);
		}

		return apiResponse;
	}

//	Get All Data Block

	@Override
	public ApiResponse getAllData() {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();

		apiResponse.setAllMobileDetails(mobileRepository.findAll());

		return apiResponse;
	}

//	Get Data By Id Block 

	@Override
	public ApiResponse getDataById(Integer id) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		Optional<MobileDetails> dbData = mobileRepository.findById(id);

		if (dbData.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.getDataByIdfail + id);
		} else {
			apiResponse.setMobileDetails(dbData.get());
			apiResponse.setMessage(GlobalConstant.getDataByIdSuccess);
		}

		return apiResponse;
	}

//	Data Updation Block 

	public ApiResponse dataUpdation(MobileDetailsModel mobileDetailsModel, Integer id) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();
		Optional<MobileDetails> dbData = mobileRepository.findById(id);

		if (dbData.isEmpty()) {
			apiResponse.setStatus(false);
			apiResponse.setMessage(GlobalConstant.updateDataFail);
		} else {
			MobileDetails mobileDetails = dbData.get();

			mobileDetails.setMobileName(mobileDetailsModel.getMobileName());
			mobileDetails.setMobileModel(mobileDetailsModel.getMobileModel());
			mobileDetails.setMobileColor(mobileDetailsModel.getMobileColor());
			mobileDetails.setMobileRam(mobileDetailsModel.getMobileRam());
			mobileDetails.setMobileRom(mobileDetailsModel.getMobileRom());
			mobileDetails.setMobilePrice(mobileDetailsModel.getMobilePrice());

			mobileRepository.save(mobileDetails);
			apiResponse.setMessage(GlobalConstant.updateDataSuccess);
			apiResponse.setStatus(true);

		}

		return apiResponse;
	}

//	Data Deletion By Id

	public ApiResponse dataDeleteById(Integer id) {
		// TODO Auto-generated method stub
		ApiResponse apiResponse = new ApiResponse();

		Optional<MobileDetails> dbData = mobileRepository.findById(id);
		if (dbData.isEmpty()) {
			apiResponse.setMessage(GlobalConstant.dataDeletionFail);
		} else {
			mobileRepository.deleteById(id);
			apiResponse.setMessage(GlobalConstant.dataDeletionSuccess);

		}
		return apiResponse;
	}



}

//

//

//

//

//

//
