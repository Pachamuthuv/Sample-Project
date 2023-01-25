package org.testrun;

import org.basecodes.ReportGeneration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\adactin.feature",
                             glue = "org.stefdef" ,
       //                      dryRun = true,                //true is a only for snippet generate
                             dryRun = false ,                // false is a program genarate
                     //    tags     = "@One-DWithoutHeader")  //normal tag
                     //    tags     = "@Two-DWithoutHeader")
                   //       tags    = "@ONE-DWithHeader")
                     //      tags     = "@TWO-DWithHeader")
                      //    tags    = "@Sanity,@SmokeOne")   //or tag
                    		  //   tags    = {"@Sanity", "@SmokeOne" })//And tag both Available compulsary
                          tags      = "@Sanity1",
                        		        plugin = {
                        				 "rerun:src\\test\\resources\\Reports\\failed.txt",
                        				 "junit:src\\test\\resources\\Reports\\Adactin.xml",
                        				 "html:src\\test\\resources\\Reports",
                        				 "json:src\\test\\resources\\Reports\\Adactin.json"}
                        				  
                        		  ) 
                      
                          
public class TestRunner {
	@AfterClass   
	//only one time running before class start program running in one time, after class progam
	//endind after run in one time (Static compulsary)
	
	public static void afterExcution() {
	ReportGeneration.convertReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Adactin.json");
	
	}

}

