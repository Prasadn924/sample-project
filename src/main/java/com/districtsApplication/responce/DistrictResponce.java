package com.districtsApplication.responce;

import com.districtsApplication.entity.District;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter


public class DistrictResponce {
	
private Integer stateId;
	
private Integer districtId;
private String districtName;

//private String stateName;
 	
public DistrictResponce(District district) {
	
	this.stateId=district.getState().getStateId();
	
	this.districtId=district.getDistrictId();
	this.districtName=district.getDistrictName();

	//this.stateName=district.getState().getStateName();
}
}
