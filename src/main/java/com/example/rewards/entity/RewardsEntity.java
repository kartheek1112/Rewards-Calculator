package com.example.rewards.entity;



import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name="REWARDS")
@EqualsAndHashCode(callSuper=false)
public class RewardsEntity implements Serializable{
	
	private static final long serialVersionUID = -7147060504829145833L;

	@Id
	@Column(name="transactionid")
	private Integer transactionid;
	
	@Column(name="customerid")
	private Integer customerid;
	
	@Column(name="points_earned")
	private Integer points_earned;
	 
	@Column(name="purchase_amount")
	private BigDecimal  purchase_amount; 
	
	@Column(name="transaction_date")
	private LocalDate transaction_date;
	  
	 
}
