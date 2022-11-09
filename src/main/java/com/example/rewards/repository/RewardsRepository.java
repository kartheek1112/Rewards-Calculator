package com.example.rewards.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rewards.entity.RewardsEntity;

@Repository
public interface RewardsRepository  extends JpaRepository<RewardsEntity, Integer>{
	
	List<RewardsEntity> findBycustomerid(Integer customerid);

}
