package com.cg.speedbank.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.speedbank.beans.Customer;
import com.cg.speedbank.beans.Transaction;
import com.cg.speedbank.service.IBankService;

@Controller
public class BankController {

	@Autowired
	IBankService service;

	public IBankService getService() {
		return service;
	}

	public void setService(IBankService service) {
		this.service = service;
	}

	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "loginForm";
	}

	@RequestMapping("/validateLogin")
	public String validateLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
		if (username.equals("admin") && password.equals("root"))
			return "menu";
		else
			return "loginError";
	}
	@RequestMapping("/menu")
	public String goToMenu() {
		return "menu";
	}
	

	@RequestMapping("/createAccountForm")
	public ModelAndView createAccountForm() {
		Customer customer = new Customer();
		return new ModelAndView("createAccountForm", "customer", customer);
	}

	@RequestMapping("/createAccount")
	public ModelAndView createAccount(@ModelAttribute("customer") @Valid Customer customer, BindingResult result) {
		ModelAndView mv = null;

		if (!result.hasErrors()) {
			
			customer = service.createAccount(customer);
			mv = new ModelAndView("createSuccess", "customerId", customer.getCusAccNo());
		} else {
			mv = new ModelAndView("createAccountForm", "customer", customer);
		}

		return mv;
	}
	
	@RequestMapping("/showBalanceForm")
	public ModelAndView showBalanceForm() {
		Customer customer = new Customer();
		return new ModelAndView("showBalanceForm", "customer", customer);
	}
	
	@RequestMapping("/showBalance")
	public ModelAndView showBalance(@RequestParam("cusAccNo") int cusAccNo) {
		double balance = service.showBalance(cusAccNo);
		return new ModelAndView("showBalanceForm", "balance", balance);
	}
	
	@RequestMapping("/depositAccountForm")
	public String depositAccountForm() {
		return "depositAccountForm";
	}
	@RequestMapping("/showDepositAmount")
	public ModelAndView depositWithdrawAmount(@RequestParam("cusAccNo") int cusAccNo, @RequestParam("amount") long amount) {
		
		boolean choice = service.deposit(cusAccNo, amount);
		String message = "Amount Has been Deposited into your account!";
		String error = "The Deposit cannot be done!!! ";
		if(choice==true)
			return new ModelAndView("depositAccountForm", "message", message);
		else
			return new ModelAndView("depositAccountForm", "message", error);


	}

	@RequestMapping("/withdrawAccountForm")
	public ModelAndView withdrawAccountForm() {
		Customer customer = new Customer();
		return new ModelAndView("withdrawAccountForm", "customer", customer);
	}
	
	@RequestMapping("/showWithdrawAmount")
	public ModelAndView showWithdrawAmount(@RequestParam("cusAccNo") int cusAccNo, @RequestParam("amount") long amount) {
		boolean choice = service.withdraw(cusAccNo, amount);
		String message = "Amount Has been Withdrawn from your account!";
		String error = "The withdraw cannot be done!!! ";
		if(choice==true)
			return new ModelAndView("withdrawAccountForm", "message", message);
		else
			return new ModelAndView("withdrawAccountForm", "message", error);


	}
	
	@RequestMapping("/showFundTransfer")
	public String showFundTransfer() {
		return "fundTransferAccountForm";
	}
	
	@RequestMapping("/showFundTransferForm")
	public ModelAndView showFundTransferForm(@RequestParam("cusAccNoSender") int cusAccNoSender, @RequestParam("cusAccNoReciever") int cusAccNoReciever , @RequestParam("amount") long amount) {
		boolean choice = service.fundTransfer(cusAccNoSender, cusAccNoReciever, amount);
		String message = "Amount has been transferred successfully!";
		String error = "Fund transfer could not be carried out successfully! ";
		if(choice==true) {
			return new ModelAndView("fundTransferAccountForm", "message", message);
		}
		else {
			return new ModelAndView("fundTransferAccountForm", "message", error);
		}
	}
	
	@RequestMapping("/printAllTransactions")
	public String printAllTransactions() {
		return "printAllTransactionsForm";
	}
	

	@RequestMapping("/printAllTransactionsForm")
	public ModelAndView printAllTransactionsForm(@RequestParam("cusAccNo") int cusAccNo ) {
		List<Transaction> transactions = service.printTransactions(cusAccNo);
		String error = "Transactions cannot be displayed! ";
		if(transactions!=null) {
			return new ModelAndView("printAllTransactionsForm", "transactions", transactions);
		}
		else {
			return new ModelAndView("printAllTransactionsForm", "transactions", error);
		}
	}
	
	
	
	

}
