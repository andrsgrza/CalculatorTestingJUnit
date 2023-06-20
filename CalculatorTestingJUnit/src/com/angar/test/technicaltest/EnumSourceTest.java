package com.angar.test.technicaltest;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.angar.service.RomanNumeral;

class EnumSourceTest {
	@EnumSource(value = RomanNumeral.class, names = { "I", "IV" })
	@ParameterizedTest
	void checkRomanNumeralTest(RomanNumeral numeral) {
		assertTrue(RomanNumeral.contains(numeral.name()));
	}
}
