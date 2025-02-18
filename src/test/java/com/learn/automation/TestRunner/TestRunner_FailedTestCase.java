package com.learn.automation.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;



@CucumberOptions(features = "@target\\Failed-TestCase.txt",
glue = "com.learn.automation.StepDefinition",
monochrome = true,
dryRun = false,
plugin = {"pretty","html:Resource\\TestReport\\Cucumber-Report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",},
snippets = SnippetType.CAMELCASE 
		)
public class TestRunner_FailedTestCase extends AbstractTestNGCucumberTests {

}
