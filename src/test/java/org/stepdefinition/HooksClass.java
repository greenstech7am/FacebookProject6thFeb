package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	
	@Before(order=1)
	public void beforeScenario() {
		System.out.println("B.Order No 1");
		// Browser launch
		launchChrome();		
	}
	
	@Before(order=3)
	public void beforeCheck() {
		System.out.println("B.Order No 3");
		winMax();
	}
	
	@Before(order=2)
	public void beforeCh() {
		System.out.println("B.Order No 2");
		loadUrl("https://www.facebook.com");
	}
	
	@After(order=1)
	public void afterScenario() {
		System.out.println("A.Order No 1");
		closeChrome();	
	}
	
	
	@After(order=2)
	public void afterCheck() {
		System.out.println("A.Order No 2");
		System.out.println("Sceenshot Taken");

	}
	
	@After(order=3)
	public void afterCh(Scenario s) throws IOException {
		System.out.println("A.Order No 3");
		
		if(s.isFailed()) {
			
			
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] sc = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(sc, "image/png");
			
		}		
	}
	
	
	
	
	
	
	
	
	
	

}
