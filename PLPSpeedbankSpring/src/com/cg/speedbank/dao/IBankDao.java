package com.cg.speedbank.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.speedbank.beans.Customer;
import com.cg.speedbank.beans.Transaction;

public interface IBankDao {
	
	Customer createAccount(Customer b);

	
	double showBalance(int cusAccNo);
	
	public boolean deposit(Integer cusAccNo , long amount) ;
	
	public boolean withdraw(Integer cusAccNo , long amount) ;
	
	public boolean fundTransfer (Integer AccNo1, Integer AccNo2, long amount);
	
	public List<Transaction> printTransactions(int accNo) ;

	

	

}
