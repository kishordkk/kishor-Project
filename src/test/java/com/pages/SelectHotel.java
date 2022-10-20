package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SelectHotel extends BaseClass {

	@FindBy(id = "radiobutton_0", xpath = "//input[@id='radiobutton_0']")
	private WebElement Selecthotel;

	@FindBy(id = "continue")
	private WebElement btncontiue;

	public WebElement getSelecthotel() {
		return Selecthotel;
	}

	public WebElement getBtncontiue() {
		return btncontiue;
	}

	public void selecthotel() {
		click(getSelecthotel());
		click(getBtncontiue());
	}

	private void withNotSelecting() {
		click(getBtncontiue());

	}

}