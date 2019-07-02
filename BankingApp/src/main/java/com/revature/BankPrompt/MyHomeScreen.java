package com.revature.BankPrompt;

import java.util.Scanner;

import com.revature.doas.BankAccountDao;

public class MyHomeScreen implements MyScreen {

	private Scanner scan = new Scanner(System.in);

	@Override
	public MyScreen run() {

		String input;
		final BankAccountDao acctDao = BankAccountDao.currentImplementation;

		System.out.println("Please enter your account number");

		while (true) {
			System.out.println("(1). View account details");
			System.out.println("(2). Add new account");
			System.out.println("(3). Remove an account");
			input = scan.nextLine();

			switch (input) {
			case "1":
				return new ViewAccountSceen();
			case "2":
				return new AddAccount();
			case "3":
				acctDao.removeAcct();
				break;
			}

			return null;
		}
	}

}
