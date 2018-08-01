package com.zenika.formation.tdd;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class SecurityManager {

	public static void createUser() {
		new SecurityManager().createAndValidateUser();
	}

	void createAndValidateUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a username:");
		String username = scanner.next();
		System.out.print("Enter your full name:");
		String userFullName = scanner.next();
		System.out.print("Enter your password:");
		String password = scanner.next();
		System.out.print("Re-enter your password:");
		String confirmPassword = scanner.next();
		scanner.close();

		if (!password.equals(confirmPassword)) {
			System.out.println("The passwords don't match !");
			return;
		}

		if (password.length() < 8) {
			System.out.println("Password must be at least 8 characters in length !");
			return;
		}

		// Encrypt the password (just reverse it, should be secure)
		char[] array = password.toCharArray();
		ArrayUtils.reverse(array);

		System.out.println(String.format("Saving Details for User (%s, %s, %s)\n",
				username,
				userFullName,
				Arrays.toString(array)));
	}

}
