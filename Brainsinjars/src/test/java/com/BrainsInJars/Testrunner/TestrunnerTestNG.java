package com.BrainsInJars.Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestrunnerTestNG {
	
	@CucumberOptions (
			   
			   features = {"Features"},
			   glue = {"com.BrainsInJars.Stepdef"}
			   
			   )

			public class TestRunner extends AbstractTestNGCucumberTests{}
	
}
