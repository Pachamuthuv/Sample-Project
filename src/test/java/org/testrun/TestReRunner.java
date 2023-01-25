package org.testrun;

import org.basecodes.ReportGeneration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "@src\\test\\resources\\Reports\\failed.txt",
                             glue ="org.stefdef" )
public class TestReRunner {

	}
	

