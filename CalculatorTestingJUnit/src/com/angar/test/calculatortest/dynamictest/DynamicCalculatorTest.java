package com.angar.test.calculatortest.dynamictest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

import com.angar.service.Calculator;

public class DynamicCalculatorTest {
	private Calculator cobj = new Calculator();
	@TestFactory
	Collection<DynamicTest> convertToNumberTest(){
	List<String> romanSymbolsList = new ArrayList<>(Arrays.asList("I", "V", "X", "L", "C", "D", "M", "K", " "));
	List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 5, 10, 50, 100, 500, 1000, null, null));
	Collection<DynamicTest> dynamicTests = new ArrayList<>();
	for(int x=0;x<romanSymbolsList.size();x++) {
		String romanSymbol = romanSymbolsList.get(x);
		Integer number = numbersList.get(x);
		Executable execution = () -> assertEquals(number, cobj.convertToNumber(romanSymbol));
		String testName = "Testing input: "+ romanSymbol;
		DynamicTest dynamicTest = DynamicTest.dynamicTest(testName, execution);
		dynamicTests.add(dynamicTest);		
	}
	return dynamicTests;
	}
}
