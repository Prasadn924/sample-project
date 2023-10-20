package com.districtsApplication.responce;


import com.districtsApplication.entity.Constitution;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConstitutionResponce {

	private int districtId;
	private int constitutionId;
	private String constitutionName;
	public ConstitutionResponce(Constitution constitution) {
	this.districtId=constitution.getDistrict().getDistrictId();
	this.constitutionId=constitution.getConstitutionId();
	this.constitutionName=constitution.getConstitutionName();
	}
	
}
