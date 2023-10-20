package com.districtsApplication.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.districtsApplication.entity.Constitution;

@Repository
public interface ConstitutionRepositry extends JpaRepository<Constitution, Integer>{

}
