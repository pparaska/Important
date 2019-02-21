
package com.cg.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.cg.app.account.SavingsAccount;
import com.cg.app.account.service.SavingsAccountService;

@Controller
@SessionAttributes("accounts")
public class AccountController {

	@Autowired
	private SavingsAccountService service;

	@RequestMapping("/getAll")
	public String getAllSavingsAccounts(Model model) {
		List<SavingsAccount> accounts = service.getAllSavingsAccount();
		model.addAttribute("accounts", accounts);
		// System.out.println(accounts);
		return "AccountDetails";
	}

	@RequestMapping("/searchForUpdate")
	public String updateForm() {
		return "searchForUpdate";
	}

	@RequestMapping("/updateForm")
	public String getUpdateForm(HttpServletRequest request, Model model) {
		int accountNumber = Integer.parseInt(request.getParameter("accountNumber"));
		SavingsAccount account = service.getAccountById(accountNumber);
		model.addAttribute("account", account);
		return "UpdateForm";
	}

	@RequestMapping("/updateResult")
	public String updateResult(HttpServletRequest request, Model model) {
		String accountHolderName = request.getParameter("txtAccHn");
		int accountNumber = Integer.parseInt(request.getParameter("txtNum"));
		double accBal = Double.parseDouble(request.getParameter("txtBal"));
		boolean salary = request.getParameter("rdSal").equalsIgnoreCase("no") ? false : true;
		int account = service.updateAccount(accountNumber, salary, accountHolderName);
		List<SavingsAccount> accounts = service.getAllSavingsAccount();
		model.addAttribute("accounts", accounts);
		return "AccountDetails";
	}

	@RequestMapping("/addNewSAForm")
	public String createNewAccount() {
		return "addNewSAForm";
	}

	@RequestMapping("/createAccount")
	public String createNewSavingsAccount(HttpServletRequest request, Model model, SessionStatus status) {

		String accountHolderName = request.getParameter("txtAccHN");
		double accountBalance = Double.parseDouble(request.getParameter("txtBalance"));
		boolean salaried = request.getParameter("rdSalary").equalsIgnoreCase("yes") ? true : false;
		SavingsAccount account = service.createNewAccount(accountHolderName, accountBalance, salaried);
		// model.addAttribute("account", account);

		List<SavingsAccount> accounts = service.getAllSavingsAccount();
		model.addAttribute("accounts", accounts);
		status.setComplete();
		return "AccountDetails";
//		return "redirect:afterSave";

	}

	@RequestMapping("/searchByIdForm")
	public String searchById() {
		return "SearchForm";
	}

	@RequestMapping("/searchByIdResult")
	public String searchByIdResult(HttpServletRequest request, Model model) {
		int accountNumber = Integer.parseInt(request.getParameter("txtAccountNumber"));
		SavingsAccount account = service.getAccountById(accountNumber);
		model.addAttribute("account", account);
		return "AccountDetailsForSearch";
	}

	@RequestMapping("/searchByNameForm")
	public String searchByName() {
		return "searchByName";
	}

	@RequestMapping("/searchByNameResult")
	public String searchByNameResult(HttpServletRequest request, Model model) {
		String accountHolderName = request.getParameter("txtAccHN");
		SavingsAccount account = service.getAccountByName(accountHolderName);
		model.addAttribute("account", account);
		return "AccountDetails";

	}

	@RequestMapping("/withdrawForm")
	public String withdraw() {
		return "withdrawForm";
	}

	@RequestMapping("/searchByNameResult")
	public String withdrawResult(HttpServletRequest request, Model model) {
		int accountNumber = Integer.parseInt(request.getParameter("accountNumber"));
		SavingsAccount account = service.getAccountById(accountNumber);
		double amountWithdraw = Double.parseDouble(request.getParameter("amount"));

		return "AccountDetails";

	}

}
