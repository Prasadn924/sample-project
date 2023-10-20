package com.districtsApplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.districtsApplication.entity.District;
import com.districtsApplication.request.InsertDistrictRequest;
import com.districtsApplication.request.UpdateDistricRequest;
import com.districtsApplication.responce.DistrictResponce;
import com.districtsApplication.responce.UpdateDistrictResponce;
import com.districtsApplication.service.DistrictService;

@RestController
@RequestMapping("district/")
public class DistrictController {
@Autowired
DistrictService districtService;
	
@GetMapping("/getdistrict/{stateId}")
public List<DistrictResponce> getAllDistrict(@PathVariable Integer stateId) {
	List<District> districtList=districtService.getAllDistrict();
	List<DistrictResponce> districtResponceList=new ArrayList<DistrictResponce>();
	districtList.stream().forEach(district->{
	districtResponceList.add(new DistrictResponce(district));	
	});
	return districtResponceList;
}	
	
@PostMapping("/insert")
public District insertDistrict(@RequestBody InsertDistrictRequest insertDistrictRequest) {
   District district=districtService.insertDistrict(insertDistrictRequest);
	return district;	
}

@PutMapping("/update")
public UpdateDistrictResponce updatetDistrict(@RequestBody UpdateDistricRequest updateDistricRequest) {
	District district= districtService.updatetDistrict(updateDistricRequest);
	return new UpdateDistrictResponce(district);	
}

@DeleteMapping("/delete/{districtId}")
public String deleteDistrict(@PathVariable Integer districtId) {
	String district= districtService.deleteDistrict(districtId);
	return district;
	
}
}
