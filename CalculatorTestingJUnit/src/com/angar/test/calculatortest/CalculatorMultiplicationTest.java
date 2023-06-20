package com.angar.test.calculatortest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.RegisterExtension;

import com.angar.service.Calculator;
import com.angar.test.extension.MyLoggerExtension;

class CalculatorMultiplicationTest {
	static final Logger logger = Logger.getLogger(CalculatorMultiplicationTest.class.getName());
	
	//Extension registered programmatically
	@RegisterExtension
	public MyLoggerExtension le = new MyLoggerExtension("MyLoggerExtension registered for " + this.getClass());
	
	Calculator cobj = new Calculator();
	int a;
	int b;
	int actual;

	@BeforeAll
	static void setUpBeforeClass(TestInfo test) {
		logger.info("Inside BeforeAll method: " + test.getDisplayName());
	}
	@AfterAll
	static void tearDownAfterClass(TestInfo test) {
		logger.info("Inside AfterAll method: " + test.getDisplayName());
	}
	@BeforeEach
	void setUp(TestInfo test) {
		logger.info("Inside BeforeEach in method: " + test.getDisplayName());
		a = 20;
		b = 30;
	}
	@AfterEach
	void tearDown(TestInfo test) {
		logger.info("Inside AfterEach in method: " + test.getDisplayName());
	}
	@Test
	@Tag("Success")
	void multiplicationSuccessTest() {
		actual = cobj.multiplication(a, b);
		assertEquals(600, actual);
	}
	@Test
	@Tag("Failure")
	void multiplicationFailureTest() {
		actual = cobj.multiplication(a, b);
		assertNotEquals(400, actual);
	}
	
	@Test
	@Tag("Cloud")
	@Tag("Failure")
	void multiplicationCloudTest() {
		actual = cobj.multiplication(a, b);
		assertNotEquals(400, actual);
	}
	
}
