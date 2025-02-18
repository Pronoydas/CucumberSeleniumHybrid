package com.learn.automation.TestRunner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features = "src\\test\\java\\com\\learn\\automation\\featureFiles",
glue = "com.learn.automation.StepDefinition",
monochrome = true,
dryRun = false,
plugin = {"pretty","html:Resource\\TestReport\\Cucumber-Report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target\\Failed-TestCase.txt"},
snippets = SnippetType.CAMELCASE 

)
public class TestRunner extends AbstractTestNGCucumberTests{
	
	public static Logger log = LogManager.getLogger(TestRunner.class);
	
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
	@BeforeSuite
	public void setUpLoggert() {
	 DOMConfigurator.configure(System.getProperty("user.dir")+"\\Resource\\Runner\\log4j.xml");	
	 log.debug("Log4j Configuration Completed!!");
	 
	}

}







