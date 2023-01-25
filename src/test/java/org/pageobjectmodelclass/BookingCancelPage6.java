package org.pageobjectmodelclass;

import org.basecodes.BaseInput;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class BookingCancelPage6  extends BaseInput{
	public BookingCancelPage6() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"booked_form\"]/table/tbody/tr[1]/td/table/tbody/tr/td[1]")
	private WebElement bookCancel;
	@FindBy(xpath = "//*[@id=\"check_all\"]")
	private WebElement orderId;
	@FindBy(xpath   = "//*[@id=\"booked_form\"]/table/tbody/tr[3]/td/input[1]")
	private WebElement cancel;
	
	public WebElement getBookCancel() {
		return bookCancel;
	}
	public WebElement getOrderId() {
		return orderId;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public void getCancelVerify() {
		String cancel = getTextMethod(getBookCancel());
		System.out.println(cancel);
		Assert.assertEquals("Booking Date Hotel Cancel","Booked Itinerary", cancel);
		
	}
	public void cancelPageData() {
		clickElement(getOrderId());
		String attri = getAttri(getOrderId(), "value");
		System.out.println(attri);
		
		clickElement(getCancel());
		String textAlertMethod = getTextAlertMethod();
		System.out.println(textAlertMethod);
		dismissAlertMethod();

	}
	

}
