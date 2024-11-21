package com.techcarver.main;

import org.springframework.beans.factory.annotation.Value;

public class Employee {

	@Value(value = "${Employee.Id}")
	private int empId;

	@Value(value = "${Employee.name}")
	private String empName;

	@Value(value = "${Employee.salary}")
	private double salary;

	public void display() {
		System.out.println("Employee ID: " + this.empId);
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Employee Salary: " + this.salary);
	}
}
