package com.automation.steps;

import org.junit.Assert;

import com.automation.pages.HomePage;

import io.cucumber.java.en.Then;

public class HomeSteps {

	HomePage homePage = new HomePage();

	@Then("verify user is on homepage")
	public void verify_user_is_on_homepage() {
		Assert.assertTrue("Home page is not loaded", homePage.isHomePageLoaded());
	}

}
