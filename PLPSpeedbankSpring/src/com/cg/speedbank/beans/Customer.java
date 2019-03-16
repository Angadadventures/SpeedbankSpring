package com.cg.speedbank.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cusAccNo;

	@NotEmpty(message="Please Enter Customer Name")
	//@Pattern(regexp = "^[a-zA-Z]+$", message = "Username must contain only alphabets")

	private String cusName;
	private long cusBalance; 
	@NotEmpty(message="Please Enter Customer Address")
	private String cusAddress;
	@NotEmpty(message="Please Enter Customer Phone Number")
	//@Pattern(regexp = "(91|0)?[6-9][0-9]{9}", message = "Phone number must start from 6-9 and should be 10 digits")
	private String cusPhNo;
	@NotEmpty(message="Please Enter Customer Email Id")
	//@Pattern(regexp = "[a-zA-Z0-9]+[@][a-zA-Z0-9]+([.][a-zA-Z]+)+", message = "Phone number must start from 6-9 and should be 10 digits")
	private String cusEmail;
	
	public int getCusAccNo() {
		return cusAccNo;
	}

	public void setCusAccNo(int cusAccNo) {
		this.cusAccNo = cusAccNo;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public long getCusBalance() {
		return cusBalance;
	}

	public void setCusBalance(long cusBalance) {
		this.cusBalance = cusBalance;
	}

	public String getCusAddress() {
		return cusAddress;
	}

	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}

	public String getCusEmail() {
		return cusEmail;
	}

	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}

	public String getCusPhNo() {
		return cusPhNo;
	}

	public void setCusPhNo(String cusPhNo) {
		this.cusPhNo = cusPhNo;
	}

	@Override
	public String toString() {
		return "Bank [cusAccNo=" + cusAccNo + ", cusName=" + cusName + ", cusBalance=" + cusBalance + ", cusAddress="
				+ cusAddress + ", cusEmail=" + cusEmail + ", cusPhNo=" + cusPhNo + "]";
	}

}
