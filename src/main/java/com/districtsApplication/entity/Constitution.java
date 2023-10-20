package com.districtsApplication.entity;

import com.districtsApplication.request.InsertConstitutionRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 @Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Constitution {
	@Id
	@GeneratedValue(generator = "seq_gen",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_gen",sequenceName = "Consti_seq",initialValue = 5,allocationSize = 1)
	@Column(name="Const_id")
private Integer constitutionId;
	@Column(name="Const_name")
private String constitutionName;
	@ManyToOne
	@JoinColumn(name="district_id")
private  District district;
	public Constitution(InsertConstitutionRequest insertConstitutionRequest) {

		this.constitutionName = insertConstitutionRequest.getConstitutionName();
		
	}
	

}
