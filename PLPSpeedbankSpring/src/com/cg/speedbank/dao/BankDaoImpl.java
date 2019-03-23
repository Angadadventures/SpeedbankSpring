package com.cg.speedbank.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.speedbank.beans.Customer;
import com.cg.speedbank.beans.Transaction;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class BankDaoImpl implements IBankDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Customer createAccount(Customer b) {
		entityManager.persist(b);
		entityManager.flush();
		return b;
	}

	@Override
	public double showBalance(int cusAccNo) {
		Customer customer = entityManager.find(Customer.class, cusAccNo);
		return customer.getCusBalance();
	}

	@Override
	public boolean deposit(Integer cusAccNo, long amount) {
		Customer customer = entityManager.find(Customer.class, cusAccNo);
		if (customer != null) {
			long balance = customer.getCusBalance();
			balance = balance + amount;
			customer.setCusBalance(balance);

			Transaction t = new Transaction();
			t.setTransactionId(t.getTransactionId());
			t.setCusAccNo(cusAccNo);
			t.setAmount(amount);
			t.setThisdate(Date.valueOf(LocalDate.now()));
			t.setType("Deposited!!");
			entityManager.persist(t);

			return true;

		} else
			return false;

	}

	@Override
	public boolean withdraw(Integer cusAccNo, long amount) {
		Customer customer = entityManager.find(Customer.class, cusAccNo);
		if (customer != null) {
			long balance = customer.getCusBalance();
			balance = balance - amount;
			if (balance < 0)
				return false;
			customer.setCusBalance(balance);

			Transaction t = new Transaction();
			t.setTransactionId(t.getTransactionId());
			t.setCusAccNo(cusAccNo);
			t.setAmount(amount);
			t.setThisdate(Date.valueOf(LocalDate.now()));
			t.setType("Withdrawn!!");
			entityManager.persist(t);

			return true;

		} else
			return false;

	}

	@Override
	public boolean fundTransfer(Integer AccNo1, Integer AccNo2, long amount) {

		Customer customer1 = entityManager.find(Customer.class, AccNo1);
		Customer customer2 = entityManager.find(Customer.class, AccNo2);
		if (customer1 != null && customer2 != null) {
			withdraw(AccNo1, amount);
			deposit(AccNo2, amount);

			return true;
		} else
			return false;

	}

	@Override
	public List<Transaction> printTransactions(int cusAccNo) {
		
		TypedQuery<Transaction> query;
		query = entityManager.createQuery("SELECT transactions FROM Transaction transactions WHERE transactions.cusAccNo=:ano", Transaction.class);
		query.setParameter("ano", cusAccNo);
		return query.getResultList();
	
	}

}
