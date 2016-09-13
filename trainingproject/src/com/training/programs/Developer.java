package com.training.programs;

public class Developer extends Employee {

	public static double bonus = 0.1;

	public Developer(double salary) {
		this.salary = salary;
	}

	@Override
	public double getSalary() {

		return salary + salary * bonus;

	}

}
