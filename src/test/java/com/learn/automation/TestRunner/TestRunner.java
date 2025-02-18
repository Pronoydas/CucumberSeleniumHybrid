package com.learn.automation.TestRunner;

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
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}







