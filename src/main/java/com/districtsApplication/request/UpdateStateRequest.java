package com.districtsApplication.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateStateRequest {
	private int stateId;
	private String stateName;
}
