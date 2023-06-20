package com.angar.employee;

public class Employee {
	public String name;
	double monthlySalary;
	private int id;		
	
	public Employee(String name, double monthlySalary, int id) {
		super();
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void reset() {
		this.setId(0);
		this.setMonthlySalary(0);
		this.setName(null);
	}
	

}
