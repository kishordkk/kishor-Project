package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public final class LoginPageStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@Given("User id on the Adaction login page")
	public void user_id_on_the_Adaction_login_page() throws IOException {
		getdrivers("chrome");
		maximize();
		implicitwait(30);
		loadurl(getpropertyfile("url"));

	}

	@When("User should perform login {string}and{string}")
	public void user_should_perform_login_and(String Username, String Password) {
		pom.getLoginPage().login(Username, Password);
	}

	@When("User should perform login {string}and{string} with Enter key")
	public void user_should_perform_login_and_with_Enter_key(String Username, String Password) throws AWTException {
		pom.getLoginPage().loginWithEnter(Username, Password);

	}

	@Then("User should verify after login error message contains {string}")
	public void user_should_verify_after_login_error_message_contains(String expectedLoginErrorMessage) {

		WebElement textErrorLogin = pom.getLoginPage().getTextErrorLogin();
		String gettext = gettext(textErrorLogin);
		boolean contains = gettext.contains(expectedLoginErrorMessage);
		Assert.assertTrue(expectedLoginErrorMessage, contains);

	}

}
