package com.districtsApplication.responce;

import com.districtsApplication.entity.Constitution;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateConstitutionResponce {
	private Integer constitutionId;
	private String constitutionName;
	private Integer districtId;
	public UpdateConstitutionResponce(Constitution constitution) {

		this.constitutionId = constitution.getConstitutionId();
		this.constitutionName =constitution.getConstitutionName();
		this.districtId =constitution.getDistrict().getDistrictId();
	}
}
