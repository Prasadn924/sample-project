package com.districtsApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.districtsApplication.entity.Constitution;
import com.districtsApplication.entity.District;
import com.districtsApplication.repositry.ConstitutionRepositry;
import com.districtsApplication.repositry.DistrictRepositry;
import com.districtsApplication.request.InsertConstitutionRequest;
import com.districtsApplication.request.UpdateConstitutionRequest;

@Service
public class ConstitutionService {
@Autowired
ConstitutionRepositry  constitutionRepositry;

@Autowired
DistrictRepositry districtRepositry;

public List<Constitution> getAllConstitution(){
	return constitutionRepositry.findAll();
}

public Constitution createConstitution(InsertConstitutionRequest insertConstitutionRequest) {
	Constitution constitution=new Constitution(insertConstitutionRequest);
		Optional<District> optional = districtRepositry.findById(insertConstitutionRequest.getDistrictId());
		District district = optional.get();
		constitution.setDistrict(district);
		constitutionRepositry.save(constitution);
	return constitution;
	
}

public Constitution updateConstitution(UpdateConstitutionRequest updateConstitutionRequest) {
	Constitution constitution=constitutionRepositry.findById(updateConstitutionRequest.getConstitutionId()).get();
	constitution.setConstitutionName(updateConstitutionRequest.getConstitutionName());
	constitution=constitutionRepositry.save(constitution);
	return constitution;
	
	
}

public String deleteConstitution(Integer constitutionId) {
	Optional<Constitution> optional = constitutionRepositry.findById(constitutionId);
	Constitution constitution = optional.get();
	constitutionRepositry.delete(constitution);
	return "deleted successfully";
}
}
