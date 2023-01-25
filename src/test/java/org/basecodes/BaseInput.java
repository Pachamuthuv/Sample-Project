package org.basecodes;

import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseInput {
	public static WebDriver driver;

	public static void driverLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void implicitwait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public static WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	public static WebElement findElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	public WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void sendText(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static String getData(String sheetName, int rowNum, int getCell)throws IOException {
		String data = null;
		File file = new File("C:\\\\Users\\\\PC\\\\eclipse-workspace\\\\Jan_Batch_FrameWork\\\\DATA\\\\Amazon.Xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(input);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(getCell);
//		String name = cell.getStringCellValue();
		//to get cell type
		CellType cellType = cell.getCellType();
	//	return name;
		switch (cellType) {
		case STRING:
	     data = cell.getStringCellValue();
			
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateFormate =new SimpleDateFormat("dd/MM/yyyy");
				 data = dateFormate.format(date); 
				
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal desimal=new BigDecimal(numericCellValue);
				 data = desimal.toString();
			}

		default:
			break;
		}
		return data;
	}

	public String getNumericData(String sheetName, int rowNum, int getCell) throws IOException {
		File file = new File("C:\\Users\\PC\\eclipse-workspace\\Jan_Batch_FrameWork\\DATA\\Amazon.Xlsx");
		FileInputStream in = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(in);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(getCell);
		double numericCellValue = cell.getNumericCellValue();
		String string = Double.toString(numericCellValue);
		return string;

	}

	public void setData(String sheetName, int rowNum, int cellNum, String value) throws IOException {
		File file = new File("C:\\Users\\PC\\eclipse-workspace\\Jan_Batch_FrameWork\\DATA\\Amazon.Xlsx");
		FileInputStream in = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(in);
		Sheet sheet = book.getSheet(sheetName);
		// Row createRow = sheet.createRow(rowNum);
		Row row = sheet.getRow(rowNum);
		Cell createCell = row.createCell(cellNum);
		createCell.setCellValue(value);
		FileOutputStream out= new FileOutputStream(file);
		book.write(out);

		

	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public void clearElement(WebElement element) {
		element.clear();
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static void threadSleep(long time) throws InterruptedException {
		Thread.sleep(time);
	}

	public void selectIndex(WebElement element, int data6) {
		Select sct = new Select(element);
		sct.selectByIndex(data6);
	}

	public void selectValue(WebElement ele, String room) {
		Select slt = new Select(ele);
		slt.selectByValue(room);

	}

	public void selectVisbleText(WebElement ele, String value) {
		Select sct = new Select(ele);
		sct.selectByVisibleText(value);
	}

	public static void tabClose() {
		driver.close();
	}

	public static void tabQuit() {
		driver.quit();
	}

	public static String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

public static String getTextMethod(WebElement element) {
	String text = element.getText();
	return text;
}
	public static String getTit() {
		String title = driver.getTitle();
		return title;

	}

	public static String getAttri(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;

	}

	public static String getTextAlertMethod() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}

	public void acceptAlertMethod() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void dismissAlertMethod() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static  void screenShot(String fileName) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File output = ss.getScreenshotAs(OutputType.FILE);
		File in = new File("C:\\Users\\PC\\eclipse-workspace\\Jan_Batch_FrameWork\\Proof\\"
				+ "" + fileName + ".png");
		FileUtils.copyFile(output, in);
//		return output;

	}

}
