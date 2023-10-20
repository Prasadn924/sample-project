package com.districtsApplication.responce;

import com.districtsApplication.entity.District;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UpdateDistrictResponce {
	private int districtId;
	private String districtName;
	private String stateName;
	 	
	public UpdateDistrictResponce(District district) {
		this.districtId=district.getDistrictId();
		this.districtName=district.getDistrictName();
		this.stateName=district.getState().getStateName();
	}
}
