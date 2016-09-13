package com.training.programs;

import java.util.Scanner;

public class ProgramList {

	public void isStringPalindrome() {
		System.out.println("Enter the string to check if it is palindrome..");
		Scanner scanner = new Scanner(System.in);
		String inputstring = scanner.nextLine();
		char[] chr1 = inputstring.toCharArray();
		scanner.close();
		int l = chr1.length;
		String b = "";
		for (int i = l - 1; i >= 0; i--) {
			b = b + inputstring.charAt(i);

		}

		System.out.println("Your reversed String is " + b);

		if (b.equals(inputstring)) {
			System.out.println("Your String is palindrome ");
		} else
			System.out.println("Your String is not palindrome ");

	}

	public void findTwoNumbersFromAray() {

		int[] n = { 1, 2, 3, 4, 16, 7, 8 };
		int sum1 = 0;
		int l = n.length;
		System.out.println(
				"Enter the sum/number which makes the addition of two numbers from this array - {1,2,3,4,16,7,8}  ");
		Scanner scanner = new Scanner(System.in);
		int sum = scanner.nextInt();
		scanner.close();
		for (int i = 0; i < l; i++) {

			for (int j = i; j < l; j++) {

				sum1 = n[i] + n[j];
				if (sum1 == sum) {
					System.out.println("These are the two numbers which makes the given addtion.." + n[i] + "," + n[j]);
				}
			}
		}

	}

	public void adition(int a, int b) {
		int intResult;

		intResult = a + b;
		System.out.println("Addition of two integers is " + intResult);

	}

	// overloaded method
	public void addition(float x, float y) {
		double floatResult = 0.0;

		floatResult = x + y;
		System.out.println("Addition of two integers is " + floatResult);

	}

}
