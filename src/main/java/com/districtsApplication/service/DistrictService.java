package com.districtsApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.districtsApplication.entity.District;
import com.districtsApplication.entity.State;
import com.districtsApplication.repositry.DistrictRepositry;
import com.districtsApplication.repositry.StateRepositry;
import com.districtsApplication.request.InsertDistrictRequest;
import com.districtsApplication.request.UpdateDistricRequest;

@Service
public class DistrictService {
@Autowired
DistrictRepositry districtRepositry;

@Autowired
StateRepositry stateRepositry;

//Get District Details using StateId
public List<District> getAllDistrict(){
	return districtRepositry.findAll();
}

//insert District values
public District insertDistrict(InsertDistrictRequest insertDistrictRequest) {
	District district=new District(insertDistrictRequest);
	Optional<State> optional = stateRepositry.findById(insertDistrictRequest.getStateId());
	State state = optional.get();
	district.setState(state);
	district=districtRepositry.save(district);
	return district;	
}


//Update  the District record
public District updatetDistrict(UpdateDistricRequest updateDistricRequest) {
	District district=districtRepositry.findById(updateDistricRequest.getDistrictId()).get();
	district.setDistrictName(updateDistricRequest.getDistrictName());
	district=districtRepositry.save(district);
	return district;
	
}
//delete the delete record 
public String deleteDistrict(Integer districtId) {
	Optional<District> optional = districtRepositry.findById(districtId);
	District district = optional.get();
	districtRepositry.delete(district);
	return "deleted successfully";
}
}
