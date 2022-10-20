package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseclass.BaseClass;

public class BookingConformationPage extends BaseClass {

	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement bookingconfirmtext;

	@FindBy(xpath = "//input[@name='order_no']")
	private WebElement orderid;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookeditenary;
	
	public WebElement getBookingconfirmtext() {
		return bookingconfirmtext;
	}

	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getBookeditenary() {
		return bookeditenary;
	}

	public String orderid() throws IOException {

		String orderid = getAttribute(getOrderid(), "value");
		Writedata("omrbranch", orderid);
		return orderid;
	}

}
