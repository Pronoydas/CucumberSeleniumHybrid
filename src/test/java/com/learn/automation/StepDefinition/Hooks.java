package com.learn.automation.StepDefinition;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.learn.automation.Utilities.WebDriverManagerSetup;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

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

}
