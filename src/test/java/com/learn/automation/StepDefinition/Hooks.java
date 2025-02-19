package com.learn.automation.StepDefinition;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.learn.automation.TestRunner.TestRunner;
import com.learn.automation.Utilities.WebDriverManagerSetup;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.messages.types.StepDefinition;

public class Hooks {
	
	
//	@After
//	public void tearDown() {
//		
//	}
//	
//	
	

	@AfterAll
	public static void before_or_after_all() {
		WebDriverManagerSetup.driverManager.getWebDriver().quit();
	}
	
	
	@AfterStep
	public void screenshort(Scenario sce) {
		if(sce.isFailed()) {
			TakesScreenshot tss =((TakesScreenshot)WebDriverManagerSetup.driverManager.getWebDriver());
			byte[] screenshort=tss.getScreenshotAs(OutputType.BYTES);
			sce.attach(screenshort, "image/png", "image");
		}
	}
	@BeforeStep
	public void before_Step(Scenario sce) {
		
		
	}
	
	@Before
	public void before_Scenerio(Scenario sce) {
		TestRunner.log.info(String.format("Start Executing %s Scenario", sce.getName()));
		
	}
	
	@After
	public void after_Scenerio(Scenario sce) {
		if(sce.isFailed()) {
			TestRunner.log.info(String.format("Scenario Failed !! sratus %s ", sce.getStatus().name()));
		}
		
	}

}
