package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;

public class ForgottenStepDefinition extends BaseClass{

	@When("User should click the forgotten password link")
	public void user_should_click_the_forgotten_password_link() throws InterruptedException {
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
	}

	@When("User should input invalid mobile number in the text box")
	public void user_should_input_invalid_mobile_number_in_the_text_box() {
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("1234567890");
	}

	@When("User should click the search button")
	public void user_should_click_the_search_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

	}

	@Then("User should navigate to password reset page")
	public void user_should_navigate_to_password_reset_page() {
		
		String resetPage = driver.findElement(By.xpath("(//h2[text()='Reset Your Password'])[1]")).getText();
		Assert.assertTrue("Password reset", resetPage.contains("Reset"));
		System.out.println("Successfully reset");
		
		
	}
	
	@When("User should print the title of my password reset page")
	public void userShouldPrintTheTitleOfMyPasswordResetPage() {
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
	
	


}
