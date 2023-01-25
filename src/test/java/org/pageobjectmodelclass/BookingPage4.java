package org.pageobjectmodelclass;

import java.io.IOException;

import org.basecodes.BaseInput;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;


public class BookingPage4 extends BaseInput {
	public BookingPage4() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"book_hotel_form\"]/table/tbody/tr[2]/td")
	private WebElement BookHotel;
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastName;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement billingAddress;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement ccNum;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement ccType;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement ccMonth;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement ccYear;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvvNum;
	@FindBy(xpath = "//*[@id=\"order_no\"]")
	private WebElement ordId;
	
	
	public WebElement getOrdId() {
		return ordId;
	}
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement bookNow;
	
	
	public WebElement getBookHotel() {
		return BookHotel;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcMonth() {
		return ccMonth;
	}
	public WebElement getCcYear() {
		return ccYear;
	}
	public WebElement getCvvNum() {
		return cvvNum;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	
	public void getBookingVerify() {
	String book = getTextMethod(getBookHotel());
	System.out.println(book);
	Assert.assertEquals("EnterBookingData", "Book A Hotel", book);

	}
	public void ForthBookPageData() throws IOException {
		String fstName = getData("Amazon", 1, 10);
		sendText(getFirstName(), fstName);
		String last = getData("Amazon", 1, 11);
		sendText(getLastName(), last);
		String address = getData("Amazon", 1, 12);
		sendText(getBillingAddress(), address);
		
	String ccNum = getNumericData("Amazon", 1, 13);
		sendText(getCcNum(), ccNum);
	//	sendText(getCcNum(), "1234567890123456");
		String ccType = getData("Amazon", 1, 14);
		sendText(getCcType(), ccType);
		String month = getData("Amazon", 1, 15);
		sendText(getCcMonth(), month);
		
		String year = getNumericData("Amazon", 1, 16);
		sendText(getCcYear(), year);
	//	sendText(getCcYear(), "2022");
		
		String cvv = getNumericData("Amazon", 1, 17);
		sendText(getCvvNum(), cvv);
	//	sendText(getCvvNum(), "789");
		clickElement(getBookNow());
		String attri = getAttri(getOrdId(), "value");
		System.out.println(attri);
		setData("Amazon", 1, 18, attri);
	}

	}

