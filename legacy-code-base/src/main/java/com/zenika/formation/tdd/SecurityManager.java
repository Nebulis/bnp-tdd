package com.zenika.formation.tdd;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class SecurityManager {

	public static void createUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a username:");
		String input1 = scanner.next();
		System.out.print("Enter your full name:");
		String input2 = scanner.next();
		System.out.print("Enter your password:");
		String input3 = scanner.next();
		System.out.print("Re-enter your password:");
		String input4 = scanner.next();
		scanner.close();

		if (!input3.equals(input4)) {
			System.out.println("The passwords don't match !");
			return;
		}

		if (input3.length() < 8) {
			System.out.println("Password must be at least 8 characters in length !");
			return;
		}

		// Encrypt the password (just reverse it, should be secure)
		char[] array = input3.toCharArray();
		ArrayUtils.reverse(array);

		System.out.println(String.format("Saving Details for User (%s, %s, %s)\n",
				input1,
				input2,
				Arrays.toString(array)));
	}

}
