package com.angar.test;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import com.angar.test.calculatortest.CalculatorAdditionTest;


@Suite
@SelectPackages("com.angar.test.calculatortest")
//@ExcludePackages("com.infosys.test.employeetest")
//@SelectClasses(CalculatorAdditionTest.class)
//@IncludeTags("Success")
//@IncludeTags({ "Success", "Cloud" })
@ExcludeTags("Failure")
//@ExcludeClassNamePatterns(".*SuiteB.*")
public class SelectPackageTest {
	
}
