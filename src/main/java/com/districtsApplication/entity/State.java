package com.districtsApplication.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "States")
public class State {
	
	@Id
	@GeneratedValue(generator = "seq_gen")
	@SequenceGenerator(name = "seq_gen", sequenceName = "states_seq"  , initialValue = 5,allocationSize = 1)
	@Column(name = "state_id")
	private Integer stateId;
	
	@Column(name = "state_name")
	private String stateName;
	
}
