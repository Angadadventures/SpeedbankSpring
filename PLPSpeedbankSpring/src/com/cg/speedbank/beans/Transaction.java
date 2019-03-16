package com.cg.speedbank.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
public class Transaction {
	@Id
	int AccNo;
	@GeneratedValue(strategy=GenerationType.AUTO)
	int transactionId;
	double amount ;
	String type;
	LocalDate thisdate;

	public LocalDate getThisdate() {
		return thisdate;
	}
	public void setThisdate(LocalDate thisdate) {
		this.thisdate = thisdate;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}