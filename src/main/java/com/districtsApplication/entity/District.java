package com.districtsApplication.entity;

import com.districtsApplication.request.InsertDistrictRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class District {
	@Id
	@GeneratedValue(generator = "seq_gen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_gen", sequenceName = "district_seq" , initialValue = 5,allocationSize = 1)
	@Column(name = "district_id")
	private Integer districtId;

	

	@Column(name = "district_name")
	private String districtName;	
	
	
	@ManyToOne
	@JoinColumn(name = "state_id")
	private State state;

	public District(InsertDistrictRequest insertDistrictRequest) {		
		this.districtName = insertDistrictRequest.getDistrictName();
		
		
	}
}
