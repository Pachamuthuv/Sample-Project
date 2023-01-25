package org.pageobjectmodelclass;

import org.basecodes.BaseInput;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class SelectHotelPage3 extends BaseInput {
	public SelectHotelPage3() {
		PageFactory.initElements(driver, this);

}
@FindBy(xpath = "//*[@id=\"select_form\"]/table/tbody/tr[1]/td")
private WebElement selectHotelOne;
@FindBy(xpath = "//input[@id='radiobutton_0']")
private WebElement radioButton;
@FindBy(xpath = "//input[@id='continue']")
private WebElement Continue;


public WebElement getSelectHotelOne() {
	return selectHotelOne;
}
public WebElement getRadioButton() {
	return radioButton;
}
public WebElement getContinue() {
	return Continue;
}

public void thirdPageVerify() {
	String text= getTextMethod(getSelectHotelOne());
	System.out.println(text);
	Assert.assertEquals("SearchHotelData", "Select Hotel", text);
}
public void thirdPageData() {
	clickElement(getRadioButton());
	clickElement(getContinue());
	
}



}



