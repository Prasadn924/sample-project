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

import com.districtsApplication.entity.Constitution;
import com.districtsApplication.request.InsertConstitutionRequest;
import com.districtsApplication.request.UpdateConstitutionRequest;
import com.districtsApplication.responce.ConstitutionResponce;
import com.districtsApplication.responce.UpdateConstitutionResponce;
import com.districtsApplication.service.ConstitutionService;

@RestController
@RequestMapping("constitution/")
public class ConstitutionController {
	
 @Autowired
 ConstitutionService constitutionService;
 
 @GetMapping("getAll/{districtId}")
 public List<ConstitutionResponce> getAllConstitution(@PathVariable Integer districtId) {
		List<Constitution> constitutionList=constitutionService.getAllConstitution();
		List<ConstitutionResponce> constitutionResponceList=new ArrayList<ConstitutionResponce>();
		constitutionList.stream().forEach(constitution->{
			constitutionResponceList.add(new ConstitutionResponce(constitution));	
		});
		return constitutionResponceList;
	}
 
 @PostMapping("/insert")
 public Constitution createConstitution(@RequestBody InsertConstitutionRequest insertConstitutionRequest) {
	 Constitution constitution =constitutionService.createConstitution(insertConstitutionRequest);
	return constitution;
	}
 
@PutMapping("/update")
public UpdateConstitutionResponce updateConstitution(@RequestBody UpdateConstitutionRequest updateConstitutionRequest) {
	Constitution constitution=constitutionService.updateConstitution(updateConstitutionRequest);
	return new UpdateConstitutionResponce(constitution);
	}
@DeleteMapping("/delete")
public String deleteConstitution(Integer constitutionId) {
	return constitutionService.deleteConstitution(constitutionId);
}


}

