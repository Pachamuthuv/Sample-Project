package org.pageobjectmodelclass;

import java.io.IOException;

import org.basecodes.BaseInput;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LogInPage extends BaseInput {

	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//p[text()='Adactin Launches The Adactin Hotel App! ']")
	private WebElement verify;
	@FindBy(id = "username")
	private WebElement user;
	@FindBy(id = "password")
	private WebElement pass;
	@FindBy(id = "login")
	private WebElement log;

	public WebElement getVerify() {
		return verify;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLog() {
		return log;
	}


	public void logPageVerification() {
		String text = getTextMethod(getVerify());
		System.out.println(text);
		Assert.assertEquals("LogInPage", "Adactin Launches The Adactin Hotel App!", text);

	}
//	public void logAdactinPage() throws IOException {    // use to directly value take in excel

		
//		String user = getData("Amazon", 1, 0);  //method one
//		sendText(getUser(), user);
//		//	sendText(getUser(), "Andrew07");    // method 2
//		String pass = getData("Amazon", 1, 1);
//		sendText(getPass(), pass);
		//	sendText(getPass(),"UN45LL");
//		clickElement(getLog());
//	}	
	public void logPageExamleWithHooks(String name,String pass) {     //with using multi value from features file
		sendText(getUser(), name);
		sendText(getPass(), pass);
		clickElement(getLog());

}
}
