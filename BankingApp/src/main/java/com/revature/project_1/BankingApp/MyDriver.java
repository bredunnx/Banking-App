package com.revature.project_1.BankingApp;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.revature.BankPrompt.MyHomeScreen;
import com.revature.BankPrompt.MyScreen;

/**
 * This program will run a banking account prompt to the bare minimum
 * expectations
 *
 */
public class MyDriver {
	public static void main(String[] args) throws InterruptedException {
		final Scanner scan = new Scanner(System.in);
		String isVillian;
		printWithDelays("Welcome to Villian's Banking where its as evil as posible...", TimeUnit.MILLISECONDS, 100);
		do {
			System.out.println("\nQuick question, Are you a villian? (Y) for (N)");
			isVillian = scan.nextLine();
			if (isVillian.equalsIgnoreCase("y")) {
				System.out.println("Welcome villian !\n");
			} else if (isVillian.equalsIgnoreCase("n"))
				System.out.println("NO HEROS ALLOWED");
		} while ((isVillian.equalsIgnoreCase("n")));

		MyScreen currentScreen = new MyHomeScreen();
		while (true) {
			currentScreen = currentScreen.run();
		}
	}

	public static void printWithDelays(String data, TimeUnit unit, long delay) throws InterruptedException {
		for (char ch : data.toCharArray()) {
			System.out.print(ch);
			unit.sleep(delay);
		}
	}
}
