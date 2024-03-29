package com.angar.test.technicaltest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.angar.service.Calculator;
class CsvFileSourceTest {
	private Calculator cobj = new Calculator();
	@CsvFileSource(resources = "/input.csv", delimiter = ';')
	@ParameterizedTest
	void divisionValidTest(int num, int denum, int quotient) {
		assertEquals(quotient, cobj.division(num, denum));
	}
}
