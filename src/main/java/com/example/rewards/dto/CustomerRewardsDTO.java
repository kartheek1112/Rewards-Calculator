package com.example.rewards.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

@Data
public class CustomerRewardsDTO implements Serializable {
	
	private static final long serialVersionUID = 9095712419921398210L;
	
	private Integer transactionId;
	private Integer customerId;
	private Double purchaseAmount;
	private Integer pointsEarned;
	private LocalDate transactionDate;

}
