package com.angar.test.employeetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.angar.employee.Employee;
import com.angar.service.EmployeeService;

class EmployeeServiceTest {
	public static Employee emp1;
	public static Employee emp2;
	public static EmployeeService empService;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		empService= new EmployeeService();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emp1.reset();
		emp2.reset();
	}

	@BeforeEach
	void setUp() throws Exception {
		emp1 = new Employee("Jack",8000.0,101);
		emp2 = new Employee("John",100000.0,102);
	}

	@Test
	void calculateYearlySalaryTest() {
		assertEquals(emp1.getMonthlySalary(),empService.calculateYearlySalary(emp1)/12,"Are equals");
		assertEquals(emp2.getMonthlySalary(),empService.calculateYearlySalary(emp2)/12,"Are equals");
	}
	
	@Test
	void calculateHikeTest() {
		assertEquals(2000,empService.calculateHike(emp1));
		assertEquals(1000,empService.calculateHike(emp2));
	}
	
	

}
