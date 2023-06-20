package com.angar.test.technicaltest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.angar.service.RomanNumeral;

class ParamAndValueSourceTest {

	@ValueSource(strings = { "V", "X" })
	@ParameterizedTest
	void valueSourceTest(String argument) {
		assertTrue(RomanNumeral.contains(argument));
	}

}
