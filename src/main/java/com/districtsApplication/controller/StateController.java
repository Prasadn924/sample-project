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

import com.districtsApplication.entity.State;
import com.districtsApplication.request.UpdateStateRequest;
import com.districtsApplication.responce.StateResponce;
import com.districtsApplication.responce.UpdateStateResponce;
import com.districtsApplication.service.StateService;
@RestController
@RequestMapping("state/")
public class StateController {
	@Autowired
	StateService stateService;
		
	@GetMapping("/getState")
	public List<StateResponce> getAllState() {
		List<State> stateList=stateService.getAllState();
		List<StateResponce> stateResponceList=new ArrayList<StateResponce>();
		stateList.stream().forEach(state->{
			stateResponceList.add(new StateResponce(state));	
		});
		return stateResponceList;
	}
	
@PostMapping("/insert")
public State insertState(@RequestBody State state) {
    state=stateService.insertState(state);
	return state;	
}

@PutMapping("/update")
public UpdateStateResponce updatetState(@RequestBody UpdateStateRequest updateStateRequest) {
	State state=stateService.updatetState(updateStateRequest);
	return new UpdateStateResponce(state);	
}

@DeleteMapping("/delete/{stateId}")
public String deleteState(@PathVariable Integer stateId) {
	String state= stateService.deleteState(stateId);
	return state;
	
}
}
