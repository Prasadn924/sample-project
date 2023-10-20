package com.districtsApplication.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.districtsApplication.entity.District;

public interface DistrictRepositry extends JpaRepository<District, Integer>{

}
