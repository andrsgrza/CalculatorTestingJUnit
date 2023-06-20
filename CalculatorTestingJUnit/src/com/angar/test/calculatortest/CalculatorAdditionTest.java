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

import com.angar.service.Calculator;

//Extension registered using automatic approach
public class CalculatorAdditionTest {
	static final Logger logger = Logger.getLogger(CalculatorAdditionTest.class.getName());
	Calculator cobj = new Calculator();
	int a;
	int b;
	int c;
	int actual;

	@BeforeAll
	static void setUpBeforeClass(TestInfo test) {
		logger.info("Inside BeforeAll method" + test.getDisplayName());
	}

	@AfterAll
	static void tearDownAfterClass(TestInfo test) {
		logger.info("Inside AfterAll method: " + test.getDisplayName());
	}
	
	@BeforeEach
	void setUp(TestInfo test) {
		a = 20;
		b = 30;
		logger.info("Before test: "+test.getDisplayName());
	}
	
	@AfterEach
	void tearDown(TestInfo test){
		a=0;
		b=0;
		logger.info("After test: "+test.getDisplayName());
	}
	@Test
	@Tag("Success")
	void additionSuccessTest() {
		actual = cobj.addition(a, b);
		assertEquals(50, actual);
	}
	
	@Test
	@Tag("Cloud")
	@Tag("Failure")
	void additionCloudTest() {
		actual = cobj.addition(a, b);
		assertEquals(50, actual);
	}


}
