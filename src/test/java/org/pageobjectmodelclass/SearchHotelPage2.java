package org.pageobjectmodelclass;

import java.io.IOException;

import org.basecodes.BaseInput;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class SearchHotelPage2 extends BaseInput {
	public SearchHotelPage2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath  = "(//td[@class='welcome_menu'])[1]")
	private WebElement WelcomeText;
	@FindBy(name="location")
	private WebElement Location;
	@FindBy(xpath ="//*[@id=\"hotels\"]")
	private  WebElement Hotels;
	@FindBy(xpath  =" //select[@id='room_type']")
	private WebElement roomType;
	@FindBy(id = "room_nos")
	private WebElement roomNo;
	@FindBy(id = "datepick_in")
	private WebElement datePickIn;
	@FindBy(id = "datepick_out")
	private WebElement datePickOut;
	@FindBy(id = "adult_room")
	private WebElement adultRoom;
	@FindBy(xpath ="//select[@id='child_room']" )
	private WebElement childRoom;
	@FindBy(id = "Submit")
	private WebElement submit;
	public WebElement getWelcomeText() {
		return WelcomeText;
	}
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotels() {
		return Hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNo() {
		return roomNo;
	}
	public WebElement getDatePickIn() {
		return datePickIn;
	}
	public WebElement getDatePickOut() {
		return datePickOut;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	public void secondPageVerify() {
		String textMethod = getTextMethod(getWelcomeText());
		System.out.println(textMethod);
		Assert.assertEquals("SearchHotel", "Welcome to Adactin Group of Hotels", textMethod);
	}
	public void SearchHotelPageData() throws IOException {
		String loc = getData("Amazon", 1, 2);
		sendText(getLocation(), loc);
		String hot = getData("Amazon", 1, 3);
		sendText(getHotels(), hot);
		String rT = getData("Amazon", 1, 4);
		clickElement(getRoomType());
		sendText(getRoomType(), rT);
		String rNo = getData("Amazon", 1, 5);
		sendText(getRoomNo(), rNo);
		
		String in = getData("Amazon", 1, 6);
	//	clickElement(getDatePickIn());
		clearElement(datePickIn);
		
	//	sendText(getDatePickIn(), "14/02/2023");      //fst method to directly send value
		sendText(getDatePickIn(), in);                //2nd method pass the value from sheet
		
		 String out = getData("Amazon", 1, 7);
	//	 clickElement(getDatePickOut());
		 clearElement(datePickOut);
		 sendText(getDatePickOut(), out);
	
		 String adult = getData("Amazon", 1, 8);
	//	 selectIndex(getAdultRoom(), 2);
		 sendText(getAdultRoom(), adult);
		 String child = getData("Amazon", 1, 9);
	//	 selectVisbleText(getChildRoom(),"3 - Three" );
		 sendText(getChildRoom(), child);
		
		 clickElement(getSubmit());
	}
	

}
