package com.districtsApplication.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateDistricRequest {
	
private int districtId;
private String districtName;
private int stateId;
}
