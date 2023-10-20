package com.districtsApplication.responce;

import com.districtsApplication.entity.State;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class UpdateStateResponce {
	
	private int stateId;
	private String stateName;
	public UpdateStateResponce( State state) {
		this.stateName=state.getStateName();
	}
}
