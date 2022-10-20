package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement Btnlogin;

	@FindBy(xpath = "//b[contains(text(),'Invalid Login details')]")
	private WebElement TextErrorLogin;

	public WebElement getTextErrorLogin() {
		return TextErrorLogin;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnlogin() {
		return Btnlogin;
	}

	public void login(String Username, String Password) {

		Type(getTxtUserName(), Username);

		Type(getTxtPassword(), Password);
		click(getBtnlogin());
	}

	public void loginWithEnter(String username, String Password) throws AWTException {
		Type(getTxtUserName(), username);
		
		
		Type(getTxtPassword(), Password);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}