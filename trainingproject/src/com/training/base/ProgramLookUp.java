package com.training.base;

import java.util.*;

import com.training.programs.*;

public class ProgramLookUp {

	public static void main(String[] args) {

		System.out.println("===================== Select the valid option from the below list ======================");
		System.out.println("1. Program to find a substring from a given string..");
		System.out.println("2. Program to find two numbers from array which makes the given addition..");
		System.out.println("3. Program to find addition of two integer numbers..");
		System.out.println("4. Program to find addition of two float numbers..");
		System.out.println("5. Program to find CTC of manager and developer given the basic salary..");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		ProgramLookUp lookup = new ProgramLookUp();
		lookup.programSelector(option);
		scanner.close();

	}

	public void programSelector(int option) {
		ProgramList plist = new ProgramList();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Your option is " + option);
		switch (option)

		{
		case 1:
			plist.isStringPalindrome();
			break;
		case 2:
			plist.findTwoNumbersFromAray();
			break;
		case 3:
			System.out.println("Enter two integer numbers for addition..");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			plist.addition(a, b);
			break;
		case 4:
			System.out.println("Enter two float numbers for addition..");
			float x = scanner.nextFloat();
			float y = scanner.nextFloat();
			plist.addition(x, y);
		case 5:
			System.out.println("Enter the base salary of employee");
			double sal = scanner.nextDouble();
			Manager mgr = new Manager(sal);
			Developer dev = new Developer(sal);
			System.out.println("Total Salary of manager is " + mgr.getSalary() + "LPA");
			System.out.println("Total Salary of developer is " + dev.getSalary() + "LPA");
			break;
		default:
			System.out.println("Please enter the valid option");

		}

		scanner.close();
	}

}
