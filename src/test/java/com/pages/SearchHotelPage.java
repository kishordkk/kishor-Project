package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {

	@FindBy(xpath = "//select[@id='location']")
	private WebElement ddnLocation;

	@FindBy(id = "hotels")
	private WebElement ddnHotels;

	@FindBy(id = "room_type")
	private WebElement ddnRoomType;

	@FindBy(id = "room_nos")
	private WebElement ddnRoomnumber;

	@FindBy(id = "datepick_in")
	private WebElement ChckIndateclear;

	@FindBy(id = "datepick_in")
	private WebElement ChckIndate;

	@FindBy(id = "datepick_out")
	private WebElement ChckOutdateclear;

	@FindBy(id = "datepick_out")
	private WebElement ChckOutdate;

	@FindBy(id = "adult_room")
	private WebElement ddnAdultperroom;

	@FindBy(id = "child_room")
	private WebElement ddnChildperroom;

	@FindBy(id = "Submit")
	private WebElement BtnSearch;

	public WebElement getDdnLocation() {
		return ddnLocation;
	}

	public WebElement getDdnHotels() {
		return ddnHotels;
	}

	public WebElement getDdnRoomType() {
		return ddnRoomType;
	}

	public WebElement getDdnRoomnumber() {
		return ddnRoomnumber;
	}

	public WebElement getChckIndate() {
		return ChckIndate;
	}

	public WebElement getChckOutdate() {
		return ChckOutdate;
	}

	public WebElement getDdnAdultperroom() {
		return ddnAdultperroom;
	}

	public WebElement getDdnChildperroom() {
		return ddnChildperroom;
	}

	public WebElement getBtnSearch() {
		return BtnSearch;
	}

	public WebElement getChckIndateclear() {
		return ChckIndateclear;
	}

	public WebElement getChckOutdateclear() {
		return ChckOutdateclear;
	}

	public void searchhotel(String location, String hotels, String roomtype, String roomnumber, String checkindate,
			String checkoutdate, String adultperroom, String childperroom) {

		Selectbyoptiontext(getDdnLocation(), location);
		Selectbyoptiontext(getDdnHotels(), hotels);
		Selectbyoptiontext(getDdnRoomType(), roomtype);
		Selectbyoptiontext(getDdnRoomnumber(), roomnumber);
		click(getChckIndateclear());

		Type(getChckIndate(), checkindate);
		click(getChckOutdateclear());
		Type(ChckOutdate, checkoutdate);
		Selectbyoptiontext(getDdnAdultperroom(), adultperroom);
		Selectbyoptiontext(getDdnChildperroom(), childperroom);
		click(getBtnSearch());

	}

	public void searchhotel(String location, String roomnumber, String checkindate, String checkoutdate,
			String adultperroom) {
		Selectbyoptiontext(getDdnLocation(), location);
		Selectbyoptiontext(getDdnRoomnumber(), roomnumber);
		click(getChckIndateclear());

		Type(getChckIndate(), checkindate);
		click(getChckOutdateclear());
		Type(ChckOutdate, checkoutdate);
		Selectbyoptiontext(getDdnAdultperroom(), adultperroom);
	
	}
	
	public void clickwithoutenter() {
		click(getBtnSearch());
		
	}
	
	

}