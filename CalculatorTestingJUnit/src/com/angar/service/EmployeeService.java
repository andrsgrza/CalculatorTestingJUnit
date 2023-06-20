package com.angar.service;

import com.angar.employee.Employee;

public class EmployeeService {
	// Calculate the yearly salary of employee
	public double calculateYearlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary() * 12;
		return yearlySalary;
	}
	
	public double calculateHike(Employee employee) {
		double hike = 0;
		if (employee.getMonthlySalary() < 10000) {
			hike = 2000;
		} else {
			hike = 1000;
		}
		return hike;
	}
}

