package org.pageobjectmodelclass;

import org.basecodes.BaseInput;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class BookingConfirmationPage5 extends BaseInput {
	public BookingConfirmationPage5() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//*[@id=\"booking_form\"]/table/tbody/tr[1]/td")
	private WebElement BookingConfirm;
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement myItinerary;
	
	
	public WebElement getBookingConfirm() {
		return BookingConfirm;
	}
	public WebElement getMyItinerary() {
		return myItinerary;
	}
	public void confirmPageVerify() {
		String confirm = getTextMethod(getBookingConfirm());
		System.out.println(confirm);
		Assert.assertEquals("Booking Confirm with date", "Booking Confirmation", confirm);
		
	}
	public void confirmPageData() {
		clickElement(getMyItinerary());
	}

}
