package com.training.programs;

public class Manager extends Employee {

	public static double bonus = 0.2;

	public Manager(double salary) {
		this.salary = salary;
	}

	@Override
	public double getSalary() {

		return salary + salary * bonus;

	}

}
