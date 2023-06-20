package com.angar.test.technicaltest;

import static org.junit.Assert.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.angar.service.Calculator;

class MethodSourceWithoutMethodNameTest {
	private Calculator cobj = new Calculator();
	
	static Stream<Arguments> test() {
		return Stream.of(Arguments.of(50, 60));
	}
	@MethodSource
	@ParameterizedTest
	void test(Integer a, Integer b) {
		assertEquals(110, cobj.addition(a, b));
	}
}
