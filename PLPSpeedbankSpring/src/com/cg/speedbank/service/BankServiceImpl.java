package com.cg.speedbank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.speedbank.beans.Customer;
import com.cg.speedbank.beans.Transaction;
import com.cg.speedbank.dao.IBankDao;

@Service
@Transactional
public class BankServiceImpl implements IBankService {
		
	@Autowired
	IBankDao dao ;		
	
	public IBankDao getDao() {
		return dao;
	}

	public void setDao(IBankDao dao) {
		this.dao = dao;
	}

	@Override
	public Customer createAccount(Customer b)  {
		// TODO Auto-generated method stub
		return dao.createAccount(b);
		
	}


	@Override
	public double showBalance(int cusAccNo)   {
		// TODO Auto-generated method stub
		return dao.showBalance(cusAccNo);
		
	}

	@Override
	public boolean deposit(Integer cusAccNo , long amount)   {
		// TODO Auto-generated method stub
		return dao.deposit(cusAccNo, amount);
		
	}

	@Override
	public boolean withdraw(Integer cusAccNo , long amount)   {
		// TODO Auto-generated method stub
		return dao.withdraw(cusAccNo, amount);
		
	}

	@Override
	public boolean fundTransfer(Integer AccNo1, Integer AccNo2, long amount)   {
		// TODO Auto-generated method stub
		return dao.fundTransfer(AccNo1,AccNo2,amount);
		
	}

	@Override
	public List<Transaction> printTransactions(int accNo)   {
		// TODO Auto-generated method stub
		return dao.printTransactions(accNo);
		
	}
	@Override
	public boolean accHolderValidation(String accHolder) {
		String regex = "[A-Z][a-z]{3,10}";
		if(accHolder == null)
			return false;
	
		return accHolder.matches(regex);
	}
	@Override
	public boolean validatePhoneNumber(String pn) {
		String regEx = "(91|0)?[6-9][0-9]{9}";
		if(pn.matches(regEx))
			return true;
		else
			return false;
	}
	@Override
	public boolean validateEmail(String em) {
		String regEx = "[a-zA-Z0-9]+[@][a-zA-Z0-9]+([.][a-zA-Z]+)+";
		if(em.matches(regEx))
			return true;
		else
			return false;
	}



	
	
	
	

}
