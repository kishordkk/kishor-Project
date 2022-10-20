package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class BookingHotel extends BaseClass {

	@FindBy(id = "first_name")
	private WebElement FirstName;

	@FindBy(id = "last_name")
	private WebElement LastName;

	@FindBy(id = "address")
	private WebElement BillingAddress;

	@FindBy(id = "cc_num")
	private WebElement CreditcardNumber;

	@FindBy(id = "cc_type")
	private WebElement CreditcardType;

	@FindBy(id = "cc_exp_month")
	private WebElement Expirymonth;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement cardexpiryYear;

	@FindBy(id = "cc_cvv")
	private WebElement CvvNumber;

	@FindBy(id = "book_now")
	private WebElement Booknow;

	@FindBy(xpath = "//input[@name='order_no']")
	private WebElement orderid;

	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditcardNumber() {
		return CreditcardNumber;
	}

	public WebElement getCreditcardType() {
		return CreditcardType;
	}

	public WebElement getExpirymonth() {
		return Expirymonth;
	}

	public WebElement getCardexpiryYear() {
		return cardexpiryYear;
	}

	public WebElement getCvvNumber() {
		return CvvNumber;
	}

	public WebElement getBooknow() {
		return Booknow;
	}

	public void bookhotel(String firstname, String lastname, String billingaddress, String creditcardnumber,
			String creditcardtype, String expirymonth, String cardexpiryYear, String cvvnumber) throws Throwable {
		// String cardexpiryyear;
		Type(getFirstName(), firstname);
		Type(getLastName(), lastname);
		Type(getBillingAddress(), billingaddress);
		Type(getCreditcardNumber(), creditcardnumber);
		Selectbyoptiontext(getCreditcardType(), creditcardtype);
		Selectbyoptiontext(getExpirymonth(), expirymonth);

		Selectbyoptiontext(getCardexpiryYear(), cardexpiryYear);

		// Type(getCardexpiryYear(), cardexpiryYear);
		Type(getCvvNumber(), cvvnumber);
		click(getBooknow());

	}

	private void bookhotelnoar() {
		click(getBooknow());

	}
}