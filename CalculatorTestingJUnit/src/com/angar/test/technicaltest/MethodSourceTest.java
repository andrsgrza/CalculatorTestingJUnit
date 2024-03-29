package com.angar.test.technicaltest;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.angar.service.Calculator;

class MethodSourceTest {
	private Calculator cobj = new Calculator();
	static Stream<List<Integer>> multipleProvider() {
		return Stream.of(Arrays.asList(5, 10, 15, 20),Arrays.asList(65, 610, 615, 260));
	}
	@MethodSource("multipleProvider")
	@ParameterizedTest
	void explicitLocalMethodSourceTest(List<Integer> argument) {
		for (Integer multiple : argument) {
			assertEquals(0, cobj.modulus(multiple, 5));
		}
	}
}
