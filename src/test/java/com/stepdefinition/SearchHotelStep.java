package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();
	
	@When("user should perform search hotel{string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_perform_search_hotel_and(String location, String hotels, String roomtype, String roomnumber, String checkindate, String checkoutdate, String adultperroom, String childperroom) {
	    pom.getSearchHotelPage().searchhotel(location, hotels, roomtype, roomnumber, checkindate, checkoutdate, adultperroom, childperroom);
	}

	@Then("User should be verify after search hotel {string}")
	public void user_should_be_verify_after_search_hotel(String expectedSearchSuccessMessage) {
//		WebElement selecthotelMsg = pom.getSearchHotelPage().getSelecthotelMsg();
//		String actualselecthotelMsg = gettext(selecthotelMsg);
//		Assert.assertEquals("ExpectedSerachHotelSuccessMessage", expectedSerachSuccessMessage, actualselecthotelMsg);
	}
	    


	@When("user should perform search hotel{string},{string},{string},{string}and{string}")
	public void user_should_perform_search_hotel_and(String location, String numberOfRooms, String checkInDate,
			String checkOutDate, String adultsperRoom) {
		pom.getSearchHotelPage().searchhotel(location, numberOfRooms, checkInDate, checkOutDate, adultsperRoom);
	}
	

	@Then("User should be verify date checking after search hotel error message as {string},{string}")
	public void user_should_be_verify_date_checking_after_search_hotel_error_message_as(String expecteddateErrorMesseage,
			String expectedOutdateErrorMesseage) {
//		WebElement checkInErrorMsg = pom.getSearchHotelPage().getCheckInErrorMsg();
//		String actualCheckInErrorMsg = gettext(checkInErrorMsg);
//		Assert.assertEquals("CheckInErrorMsg", expecteddateErrorMesseage, actualCheckInErrorMsg);
//
//		WebElement checkOutErrorMsg = pom.getSearchHotelPage().getCheckOutErrorMsg();
//		String actualCheckOutErrorMsg = gettext(checkOutErrorMsg);
//		Assert.assertEquals("CheckOutErrorMsg", expectedOutdateErrorMesseage, actualCheckOutErrorMsg);

	}

	@When("User should perform search hotel without entering any fields")
	public void user_should_perform_search_hotel_without_entering_any_fields() {
		pom.getSearchHotelPage().clickwithoutenter();
		
	   
	}

	@Then("User should verify without enter any fields search hotel error message contains {string}")
	public void user_should_verify_without_enter_any_fields_search_hotel_error_message_contains(String expectedErrorMesseage) {
//		WebElement searchHotelErrorMsg = pom.getSearchHotelPage().getSearchHotelErrorMsg();
//		String actualErrorMsg = gettext(searchHotelErrorMsg);
//		Assert.assertEquals("SearchHotelErrorMsg", expectedErrorMesseage, actualErrorMsg);
//

		}

		}














































//
//@Then("User should be verify after search hotel {string}")
//public void userShouldBeVerifyAfterSearchHotel(String expectedSerachSuccessMessage) {	
//	WebElement selecthotelMsg = pom.getSelectHotelPage().getSelecthotelMsg();
//	String actualselecthotelMsg = gettext(selecthotelMsg);
//	Assert.assertEquals("ExpectedSerachHotelSuccessMessage", expectedSerachSuccessMessage, actualselecthotelMsg);
//}
//
//@When("user should perform search hotel{string},{string},{string},{string}and{string}")
//public void userShouldPerformSearchHotelAnd(String location, String numberOfRooms, String checkInDate,
//		String checkOutDate, String adultsperRoom) {
//	pom.getSearchHotelPage().searchhotelMandatoryfields(location, numberOfRooms, checkInDate, checkOutDate, adultsperRoom);
//}
//
//@Then("User should be verify date checking after search hotel error message as {string},{string}")
//public void userShouldBeVerifyDateCheckingAfterSearchHotelErrorMessageAs(String expecteddateErrorMesseage,
//		String expectedOutdateErrorMesseage) {
//WebElement checkInErrorMsg = pom.getSearchHotelPage().getCheckInErrorMsg();
//String actualCheckInErrorMsg = gettext(checkInErrorMsg);
//Assert.assertEquals("CheckInErrorMsg", expecteddateErrorMesseage, actualCheckInErrorMsg);
//
//WebElement checkOutErrorMsg = pom.getSearchHotelPage().getCheckOutErrorMsg();
//String actualCheckOutErrorMsg = gettext(checkOutErrorMsg);
//Assert.assertEquals("CheckOutErrorMsg", expectedOutdateErrorMesseage, actualCheckOutErrorMsg);
//	
//}
//
//@When("User should perform search hotel without entering any  fields")
//public void userShouldPerformSearchHotelWithoutEnteringAnyFields() {
//	pom.getSearchHotelPage().clickwithoutenter();
//	
//}
//
//@Then("User should verify without enter any fields search hotel error message contains {string}")
//public void userShouldVerifyWithoutEnterAnyFieldsSearchHotelErrorMessageContains(String expectedErrorMesseage) {
//WebElement searchHotelErrorMsg = pom.getSearchHotelPage().getSearchHotelErrorMsg();
//String actualErrorMsg = gettext(searchHotelErrorMsg);
//Assert.assertEquals("SearchHotelErrorMsg", expectedErrorMesseage, actualErrorMsg);
//
//
//}
//
//}

