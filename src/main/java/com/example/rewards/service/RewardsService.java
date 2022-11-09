package com.example.rewards.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rewards.entity.RewardsEntity;
import com.example.rewards.repository.RewardsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RewardsService {
	
	@Autowired
	private RewardsRepository rewardsRepository;
	
	public Integer getRewardsForACustomer(Integer customerId) {
		List<RewardsEntity> rewardsEntityList = rewardsRepository.findBycustomerid(customerId);
		
		
		if(Objects.nonNull(rewardsEntityList)) {
			return rewardsEntityList.stream().map(r -> r.getPoints_earned()).reduce(0, Integer::sum);
		}
		return 0;
		
	}

}
