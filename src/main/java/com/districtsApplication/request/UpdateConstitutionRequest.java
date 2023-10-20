package com.districtsApplication.request;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateConstitutionRequest {
private Integer constitutionId;
private String constitutionName;
private Integer districtId;
}
