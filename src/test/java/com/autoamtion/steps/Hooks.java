package com.autoamtion.steps;

import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	// This method will get executed before each scenario
	@Before
	public void setUp() {
		PropertyReader.initProperty();
		DriverUtils.initDriver();
	}

	// This method will get executed after each scenario
	@After
	public void cleanUp() {
		DriverUtils.quitDriver();
	}

}
