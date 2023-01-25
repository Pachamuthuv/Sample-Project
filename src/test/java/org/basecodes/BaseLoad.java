package org.basecodes;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class BaseLoad {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseInput base=new BaseInput();
		base.driverLaunch("https://adactinhotelapp.com/");
		base.maximize();
		base.implicitwait(20);
		String currentUrl = base.currentUrl();
		System.out.println(currentUrl);
		String tit = base.getTit();
		System.out.println(tit);




		WebElement username = base.findElementById("username");
		String data = base.getData("Amazon", 1, 0);
		base.sendText(username, data);
		WebElement pass = base.findElementById("password");
		String data2 = base.getData("Amazon", 1, 1);
		base.sendText(pass, data2);
		WebElement btn = base.findElementById("login");
		base.clickElement(btn);

		WebElement loc = base.findElementByName("location");
		String data5 = base.getData("Amazon", 1, 2);
		base.selectValue(loc, data5);

		WebElement hotel = base.findElementByXpath("//*[@id=\"hotels\"]");
		String data3 = base.getData("Amazon", 1, 3);
		base.selectValue(hotel,data3);

		WebElement room = base.findElementByXpath("//*[@id=\"room_type\"]");
		String data4 = base.getData("Amazon", 1, 4);
		base.selectVisbleText(room, data4);


		WebElement numOfRoom = base.findElementById("room_nos");
		String data6 = base.getData("Amazon", 1, 5);
		base.selectVisbleText(numOfRoom, data6);


		WebElement dateIn = base.findElementById("datepick_in");
		base.clearElement(dateIn);
//		base.sendText(dateIn, "14/02/2023");
		String data77 = base.getData("Amazon", 1, 6);
		
			
			base.sendText(dateIn, data77);

		WebElement DateOut = base.findElementById("datepick_out");
		base.clearElement(DateOut);
	//	base.sendText(DateOut, "15/02/2023");
		String data88 = base.getData("Amazon", 1, 7);
			
			base.sendText(DateOut, data88);

		WebElement adultRoom = base.findElementById("adult_room");
		String adult = base.getData("Amazon", 1, 8);
		
		base.sendText(adultRoom, adult);

		WebElement childRoom = base.findElementByXpath("//*[@id=\"child_room\"]");
		
	//	base.sendText(childRoom, "4 - Four");
		String child = base.getData("Amazon", 1, 9);
		base.sendText(childRoom, child);
		

		WebElement schBtn = base.findElementByXpath("//*[@id=\"Submit\"]");
		base.clickElement(schBtn);

		WebElement radioBtn = base.findElementById("radiobutton_0");
		base.clickElement(radioBtn);

		WebElement cont = base.findElementById("continue");
		base.clickElement(cont);

		WebElement fstName = base.findElementByName("first_name");
		String data7 = base.getData("Amazon", 1, 10);
		base.sendText(fstName, data7);

		WebElement lastName1 = base.findElementById("last_name");
		String data10 = base.getData("Amazon", 1, 11);
		base.sendText(lastName1, data10);

		WebElement address = base.findElementById("address");
		String data11 = base.getData("Amazon", 1, 12);
		base.sendText(address, data11);

		WebElement cardNum = base.findElementByName("cc_num");
		String data9 = base.getNumericData("Amazon", 1, 13);
		base.sendText(cardNum, data9);
		//another method to using directly send sentext
		//	base.sendText(cardNum, "12345678990123456");

		WebElement cardType = base.findElementById("cc_type");
		String data8 = base.getData("Amazon", 1, 14);
		base.sendText(cardType, data8);

		WebElement month = base.findElementById("cc_exp_month");
		String data99 = base.getData("Amazon", 1, 15);
		base.sendText(month, data99);

		WebElement year = base.findElementById("cc_exp_year");
		String data12 = base.getNumericData("Amazon", 1, 16);
		base.sendText(year, data12);
		//	base.sendText(year, "2022");

		WebElement cvvNum = base.findElementById("cc_cvv");
		//	String data13 = base.getData("Amazon", 1, 17);
		//	base.sendText(cvvNum, data13);
	//	base.sendText(cvvNum, "789");
		String cn = base.getNumericData("Amazon", 1, 17);
		base.sendText(cvvNum, cn);

		WebElement bookNow = base.findElementById("book_now");
		base.clickElement(bookNow);
		base.threadSleep(5000);


		WebElement ord = base.findElementById("order_no");
	
		String attri = base.getAttri(ord,"value");
	//	String attri = ord.getAttribute("value" );
		System.out.println(attri);
	
		base.setData("Amazon", 1, 18, attri);

		
		

		WebElement myItinerary = base.findElementByXpath("//*[@id=\"my_itinerary\"]");

		base.clickElement(myItinerary);

		WebElement orderAll= base.findElementByXpath("//*[@id=\"check_all\"]");
		base.clickElement(orderAll);

		WebElement cansel = base.findElementByXpath("//*[@id=\"booked_form\"]/table/tbody/tr[3]/td/input[1]");
		base.clickElement(cansel);
		base.threadSleep(5000);

		String textAlertMethod = base.getTextAlertMethod();
		System.out.println(textAlertMethod);
		base.dismissAlertMethod();

		//	base.navigateBack();
		//	base.navigateForward();
		//	base.navigateRefresh();
		//	base.tabClose();
		//	base.tabQuit();

	}

}
