package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

import io.cucumber.java.en.*;

public class LoginStepDefinition extends BaseClass {

	@Given("User should launch chrome and load the url")
	public void user_should_launch_chrome_and_load_the_url() {

		//Note: Taking from HOOKS Class

	}

	@When("User should input username in the email text box")
	public void user_should_input_username_in_the_email_text_box() {
		LoginPojo l = new LoginPojo();
		WebElement txtUser = l.getTxtUser();
		fill(txtUser, "greens");
	}

	@When("User should input password in the password text box")
	public void user_should_input_password_in_the_password_text_box() throws IOException {
		LoginPojo l = new LoginPojo();
		fill(l.getTxtPass(), getData(0, 0));
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() throws InterruptedException {
		LoginPojo l = new LoginPojo();
		btnClick(l.getBtnLogin());
		Thread.sleep(3000);
	}

	@Then("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
		String title = driver.getTitle();

		Assert.assertTrue("Verify the title", title.startsWith("Log in"));
		System.out.println("Successfully Navigated to Incorrect Credentials");
		
	}

	@When("User should print the title of my page")
	public void user_should_print_the_title_of_my_page() {
			
		System.out.println(driver.getTitle());
	}
	
	@When("User should input valid username in the email text box")
	public void userShouldInputValidUsernameInTheEmailTextBox() {
		
		LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(), "Kevin");
	   
	}

	@When("User should input invalid password in the password text box")
	public void userShouldInputInvalidPasswordInThePasswordTextBox() {
		
		LoginPojo l = new LoginPojo();
		fill(l.getTxtPass(), "Tech1234");
	  
	}
	
	
	@When("User should input invalid username and valid password")
	public void userShouldInputInvalidUsernameAndValidPassword(io.cucumber.datatable.DataTable d) {
		LoginPojo l = new LoginPojo();
		//2D Map
		List<Map<String, String>> mp = d.asMaps();
		
		fill(l.getTxtUser(),mp.get(1).get("Sports"));
		fill(l.getTxtPass(),mp.get(0).get("Company"));
	}


	
	
	
	
	
	
	
	

}
