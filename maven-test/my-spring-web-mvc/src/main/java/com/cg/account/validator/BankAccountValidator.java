package com.cg.account.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cg.app.account.BankAccount;
import com.cg.app.account.SavingsAccount;


public class BankAccountValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
	
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		/*
		 * Employee employee = (Employee) target; if (employee.getEmpName().length() <
		 * 2) { errors.rejectValue("empName", "empname.lenght",
		 * "Employee Name must have 2 or more Characters"); } if (employee.getSalary() <
		 * 100000) { errors.rejectValue("salary", "salary.minimum",
		 * "Salary must be higher than 100000"); }
		 */
		
		BankAccount account = (BankAccount) target;
		if(account.getAccountHolderName().length()<2) {
			errors.rejectValue("account_hn", "account_hn.length", "Account holder Name must have 2 or more characters");
		}
	
		SavingsAccount account1 = (SavingsAccount) target;
		if(account1.isSalary()==false) {
			errors.rejectValue("account_bal", "accountBalance", "AccountBalance should greater than 1000");
		}
	}

}
