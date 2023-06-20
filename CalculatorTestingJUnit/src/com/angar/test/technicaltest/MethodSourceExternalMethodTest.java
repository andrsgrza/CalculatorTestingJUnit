package com.angar.test.technicaltest;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.angar.service.Calculator;

class MethodSourceExternalMethodTest {
	private Calculator cobj = new Calculator();
	@MethodSource("com.angar.test.InputParams#multipleProvider")
	@ParameterizedTest
	void checkMultipleTest(List<Integer> input) {
		for (Integer multiple : input) {
			assertEquals(0, cobj.modulus(multiple, 5));
		}
	}
}
