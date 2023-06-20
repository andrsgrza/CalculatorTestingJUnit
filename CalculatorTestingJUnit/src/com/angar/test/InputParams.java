package com.angar.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class InputParams {
	private InputParams() {
		
	}
	static Stream<List<Integer>> multipleProvider(){
		return Stream.of(Arrays.asList(5, 10, 15, 20));		
	}
}
