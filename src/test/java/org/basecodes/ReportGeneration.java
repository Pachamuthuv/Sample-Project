package org.basecodes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class ReportGeneration {
	public static void convertReport(String json) {
// get path
	File file =new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports");
	//configure  the report and details
	Configuration confi =new Configuration(file, "Adactin");
	confi.addClassifications("Platform", "Windows");
	confi.addClassifications("Version", "Windows10");
	confi.addClassifications("Sprint", "5.4.0");
	confi.addClassifications("Build Number", "PM2222");
	//Annousing the list 
	List<String> jsonFiles =new ArrayList<String>();
	jsonFiles.add(json);
	//generate reports
	ReportBuilder build = new ReportBuilder(jsonFiles, confi);
	build.generateReports();
	
	
	 

   }


  }