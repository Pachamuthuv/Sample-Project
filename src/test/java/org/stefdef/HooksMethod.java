package org.stefdef;

import org.basecodes.BaseInput;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;   //using only io cucumber not use api,not in use j unit

import io.cucumber.java.Before;     //using only io cucumber not use api,not in use j unit


public class HooksMethod extends BaseInput {
	@Before      //(     normal method    ) before , after ovvru scnario munadium run agum 
	public void beforeScenario() {
		
		driverLaunch("https://adactinhotelapp.com/");
		maximize();
		implicitwait(30);
	 

	}
//	@After
//	public void afterScenario() {
//		tabQuit();
		@After
		public void afterScenario(Scenario s) {
			TakesScreenshot ts= (TakesScreenshot)driver;
			 byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			 s.embed(screenshotAs, "img/png");
			 tabQuit();
			

	}

}
