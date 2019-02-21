package com.cg.app.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.app.account.ui.AccountCUI;

public class Bootstrap {
	
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("ApplicationContext.xml"); AccountCUI
		 * accountCUI = context.getBean(AccountCUI.class); accountCUI.start();
		 */
	}

}




/*
 * static { try { Class.forName("com.mysql.jdbc.Driver"); Connection connection
 * = DriverManager.getConnection ("jdbc:mysql://localhost:3306/bankapp_db",
 * "root", "root"); } catch (ClassNotFoundException e) { e.printStackTrace(); }
 * catch (SQLException e) { e.printStackTrace(); } }
 */