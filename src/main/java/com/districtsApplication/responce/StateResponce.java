package com.districtsApplication.responce;


import com.districtsApplication.entity.State;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StateResponce {

private Integer stateId;
private String stateName;
public StateResponce(State state) {
	super();
	this.stateId = state.getStateId();
	this.stateName = state.getStateName();
}
}
