package org.stefdef;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.basecodes.BaseInput;
import org.pageobjectmodelclass.BookingCancelPage6;
import org.pageobjectmodelclass.BookingConfirmationPage5;
import org.pageobjectmodelclass.BookingPage4;
import org.pageobjectmodelclass.LogInPage;
import org.pageobjectmodelclass.SearchHotelPage2;
import org.pageobjectmodelclass.SelectHotelPage3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StefDefenition extends BaseInput {
	LogInPage login;
	SearchHotelPage2 search;
	SelectHotelPage3 selt;
	BookingPage4 book;
	BookingConfirmationPage5 confirm;
	BookingCancelPage6 cancel;


@Given("user wants to open the Adactin application in chrome browser")
public void user_wants_to_open_the_Adactin_application_in_chrome_browser() {
//	
//	driverLaunch("https://adactinhotelapp.com/");
//	maximize();
//	implicitwait(30);
// 
}
//@When("user wants to give location,hotelName,roomType,no Of Rooms,bookingDate,adult and click to submit")
//public void user_wants_to_give_location_hotelName_roomType_no_Of_Rooms_bookingDate_adult_and_click_to_submit() {
//   System.out.println("dryRun");      //using anywhere not ,only order
//}



@When("user wants to give valid {string} and {string} and click on the login button")
public void user_wants_to_give_valid_and_and_click_on_the_login_button(String name, String pass ) {
  login.logPageExamleWithHooks(name, pass);
  System.out.println("Scenario outline examle");
}



@Then("user wants to verify weather the login page apear or not")
public void user_wants_to_verify_weather_the_login_page_apear_or_not() {
	
	login=new LogInPage();
	login.logPageVerification();
  
}

//
//@When("user wants to give valid username and password and click on the login button")
//public void user_wants_to_give_valid_username_and_password_and_click_on_the_login_button()
//		throws IOException {
//	
//	login.logAdactinPage();
   
//}
//
//@Then("user wants to verify weather the search hotel page appear or not")
//public void user_wants_to_verify_weather_the_search_hotel_page_appear_or_not() {
//	  search=new SearchHotelPage2();
//	  search.secondPageVerify();
//   
//}



//@When("user wants to give location,hotelName,roomType,no Of Rooms,bookingDate,adult and click to submit")
//public void user_wants_to_give_location_hotelName_roomType_no_Of_Rooms_bookingDate_adult_and_click_to_submit() 
//		throws IOException {
//   search.SearchHotelPageData();
//}
//
//@Then("user  wants to verify the select the hotel page appear or not")
//public void user_wants_to_verify_the_select_the_hotel_page_appear_or_not() {
//	 selt = new SelectHotelPage3();
//	selt.thirdPageVerify();
//	 
//   
//}
//
//@When("user wants to click the select hotel")
//public void user_wants_to_click_the_select_hotel() {
//   selt.thirdPageData();
//}
//
//@Then("user wants to pay the booking  page appear or not")
//public void user_wants_to_pay_the_booking_page_appear_or_not() {
//  book=new BookingPage4 ();
//  book.getBookingVerify();
//}
//
//@When("user wants to give deatails and pay using creditcard and click to book")
//public void user_wants_to_give_deatails_and_pay_using_creditcard_and_click_to_book() 
//		  throws IOException {
//   book.ForthBookPageData();
//}
//
//@Then("user wants to verify booking page confirm appear or not")
//public void user_wants_to_verify_booking_page_confirm_appear_or_not() {
//   confirm= new BookingConfirmationPage5 ();
//   confirm.confirmPageVerify();
//}
//
//@When("user wants to check the booking confirmation id and click the Itinerary")
//public void user_wants_to_check_the_booking_confirmation_id_and_click_the_Itinerary() {
//	   confirm.confirmPageData();
//}
//
//@Then("user wants to verify the booking cancel page appear or not")
//public void user_wants_to_verify_the_booking_cancel_page_appear_or_not() {
//	cancel= new BookingCancelPage6 ();
//	cancel.getCancelVerify();
//}
//
//@When("user wants to select the all bookingHotel  click to cancel")
//public void user_wants_to_select_the_all_bookingHotel_click_to_cancel() {
//   cancel.cancelPageData();
//}

@When("user wants to give valid username and password using DataTable without header one-D ,and click on the login button")
public void user_wants_to_give_valid_username_and_password_using_DataTable_without_header_one_D_and_click_on_the_login_button(io.cucumber.datatable.DataTable dataTable) {
  
	
	System.out.println("one dimension without header");
   
   
   List<String> list = dataTable.asList();
   String name = list.get(0);
   String pass = list.get(1);
   login.logPageExamleWithHooks(name, pass);
}
@Then("user wants to verify weather the search hotel page appear or not")
public void user_wants_to_verify_weather_the_search_hotel_page_appear_or_not() {
	search=new SearchHotelPage2();
	  search.secondPageVerify();
  System.out.println("1235");
}

@When("user wants to give valid username and password using DataTable without header Two-D ,and click on the login button")
public void user_wants_to_give_valid_username_and_password_using_DataTable_without_header_Two_D_and_click_on_the_login_button(io.cucumber.datatable.DataTable dataTable) {
   List<List<String>> asLists = dataTable.asLists();
//   String name = asLists.get(0).get(1);    //fst user fst ass
//   String  pass = asLists.get(1).get(1);
//   login.logPageExamleWithHooks(name, pass);
   String name = asLists.get(0).get(0);    
 String  pass = asLists.get(1).get(0);          //2 user2 pass
 login.logPageExamleWithHooks(name, pass);
 
 
   System.out.println("Two dimension without header");
   
}

@When("user wants to give valid username and password using DataTable with header One-D ,and click on the login button")
public void user_wants_to_give_valid_username_and_password_using_DataTable_with_header_One_D_and_click_on_the_login_button(io.cucumber.datatable.DataTable dataTable) {
 // Map<Object, Object> asMap = dataTable.asMap(String.class, String.class);object suer class of java
  Map<String, String> asMap = dataTable.asMap(String.class, String.class);
	String user =  asMap.get("UserName");
	String pass = asMap.get("PassWord");
	login.logPageExamleWithHooks(user, pass);
	System.out.println("DataTable_with_header_One_Dimension");
	
	
}

@When("user wants to give valid username and password using DataTable with header Two-D ,and click on the login button")
public void user_wants_to_give_valid_username_and_password_using_DataTable_with_header_Two_D_and_click_on_the_login_button(io.cucumber.datatable.DataTable dataTable) {
//  List<Map<String, String>> asMaps = dataTable.asMaps();
	
//  String userName = asMaps.get(0).get("UserName");
//  String passWord = asMaps.get(0).get("PassWord");      //fst list
//  login.logPageExamleWithHooks(userName, passWord);
	
  List<Map<String, String>> asMaps1 = dataTable.asMaps();
  String user = asMaps1.get(1).get("UserName");                    //2nd list
  String pass = asMaps1.get(1).get("PassWord");
  login.logPageExamleWithHooks(user, pass);


System.out.println("two d with header");
  
}

}
