package com.autoamtion.steps;

import org.junit.Assert;

import com.automation.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage();

	@Given("user open website")
	public void user_open_website() {
		loginPage.openWebsite();
	}

	@Then("verify user is on login page")
	public void verify_user_is_on_login_page() {
		Assert.assertTrue("Login page is not loaded", loginPage.isLoginPageLoaded());
	}

	@When("user login with username {string} and password {string}")
	public void user_login_with_username_and_password(String string, String string2) {
		loginPage.doLogin();
	}

}
