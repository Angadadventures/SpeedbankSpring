package com.cg.speedbank.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int transactionId;
	int cusAccNo;
	double amount;
	String type;
	Date thisdate;

	public Date getThisdate() {
		return thisdate;
	}

	public void setThisdate(Date thisdate) {
		this.thisdate = thisdate;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	

	public int getCusAccNo() {
		return cusAccNo;
	}

	public void setCusAccNo(int cusAccNo) {
		this.cusAccNo = cusAccNo;
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