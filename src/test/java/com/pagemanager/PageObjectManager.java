package com.pagemanager;

import com.pages.BookingConformationPage;
import com.pages.BookingHotel;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotel;

public class PageObjectManager {
	
private LoginPage loginPage;
private SearchHotelPage searchHotelPage;
private SelectHotel selectHotel;
private BookingHotel bookingHotel;
private BookingConformationPage bookingConformationPage;
private CancelBookingPage cancelBookingPage;

public LoginPage getLoginPage() {
	return (loginPage == null)? loginPage = new LoginPage(): loginPage;
}
public SearchHotelPage getSearchHotelPage() {
	return (searchHotelPage ==null)? searchHotelPage = new SearchHotelPage(): searchHotelPage;
}
public SelectHotel getSelectHotel() {
	return(selectHotel == null)? selectHotel = new SelectHotel(): selectHotel;
}
public BookingHotel getBookingHotel() {
	return(bookingHotel == null)? bookingHotel = new BookingHotel(): bookingHotel;
}
public BookingConformationPage getBookingConformationPage() {
	return (bookingConformationPage == null)? bookingConformationPage = new BookingConformationPage(): bookingConformationPage;
	
}
public CancelBookingPage getCancelBookingPage() {
	return (cancelBookingPage == null)? cancelBookingPage = new CancelBookingPage(): cancelBookingPage;
}

}
	
	
	
		

	
//		return (loginpage==null)? loginpage=new Loginpage(): loginpage;
//	}
//	public SearchHotelPage getSearchHotelPage() {
//		return (searchHotelPage==null)? searchHotelPage=new SearchHotelPage(): searchHotelPage ;
//	}
//	public SelectHotelpage getSelectHotelpage() {
//		return (selectHotelpage==null)? selectHotelpage=new SelectHotelpage(): selectHotelpage;
//	}
//	public BookHotelPage getBookHotelPage() {
//		return (bookHotelPage==null)? bookHotelPage=new BookHotelPage(): bookHotelPage;
//	}
//	public BookingConfirmationPage getBookingConfirmationPage() {
//		return (bookingConfirmationPage==null)? bookingConfirmationPage=new BookingConfirmationPage(): bookingConfirmationPage;
//	}
//	public CancelBooking getCancelBooking() {
//		return (cancelBooking==null)?cancelBooking=new CancelBooking(): cancelBooking;
//	}
//	
//	
//}



