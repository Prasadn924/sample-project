package com.districtsApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.districtsApplication.entity.State;
import com.districtsApplication.repositry.StateRepositry;
import com.districtsApplication.request.UpdateStateRequest;


@Service
public class StateService {
	@Autowired
StateRepositry StateRepositry;

	//Get all states
	public List<State> getAllState(){
		return StateRepositry.findAll();
	}
    
	//insert states
	public State insertState(State state) {
		StateRepositry.save(state);
		return state;
	}

	//delete states
	public String deleteState(Integer stateId) {
		StateRepositry.deleteById(stateId);
		return "delete Successfully";
	}

	//update the states
	public State updatetState( UpdateStateRequest updateStateRequest) {
		State state=StateRepositry.findById(updateStateRequest.getStateId()).get();
		state.setStateName(updateStateRequest.getStateName());
		state=StateRepositry.save(state);
		return state;
	}
}
