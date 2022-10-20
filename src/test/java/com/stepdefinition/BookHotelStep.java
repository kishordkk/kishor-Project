package com.stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookHotelStep {
	@Then("User Should book hotel {string},{string}and{string}")
	public void user_Should_book_hotel_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new cucumber.api.PendingException();
	}

	@Then("User should verify after Book Hotel{string}")
	public void user_should_verify_after_Book_Hotel(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("User should book hotel without select any fields")
	public void user_should_book_hotel_without_select_any_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User should verify after book hotel error message {string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_after_book_hotel_error_message_and(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
