package com.angar.test.calculatortest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;

import com.angar.service.Calculator;
import com.angar.test.extension.MyLoggerExtension;

////Extension registered declaratively at class level
@ExtendWith(MyLoggerExtension.class)
class CalculatorDivisionTest {
	public static final Logger logger = Logger.getLogger(CalculatorDivisionTest.class.getName());
	Calculator calc;
	
	@BeforeEach
	void setup(TestInfo test) {
		logger.info("Before test: "+test.getDisplayName());
		calc = new Calculator();
	}
	
	@Test
	void divisionValidTest() {
		assertEquals(17,calc.division(34, 2));
	}
	@Test
	void divisionInvalidTest() {
		Exception exception = assertThrows(ArithmeticException.class, () -> calc.division(10, 0));
		assertEquals("/ by zero", exception.getMessage());
	}

}
