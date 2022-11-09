package com.example.rewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rewards.service.RewardsService;

@RestController
@RequestMapping("/rewards")
public class RewardsCalculatorController {
	
	@Autowired
	private RewardsService rewardsService;
	
	@GetMapping("{customerid}")
	public ResponseEntity<Integer> getRewardsByCustomerId(@PathVariable Integer customerid) {
		
		return ResponseEntity.ok(rewardsService.getRewardsForACustomer(customerid));
	}

}
