package com.qa.stepDefinition;


import java.io.IOException;

import com.qa.pages.LoginPage;
import com.qa.utils.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginApplication extends BrowserFactory{

	@Given("^Open browser Firefox and start browser$")
	public void open_browser_Firefox_and_start_browser() throws Exception {
		Log.info("Open browser and start executing login script");	    
		BrowserFactory.startDriver(); 
	    
	}

	@When("^I enter invalid \"([^\"]*)\" and invalid \"([^\"]*)\"$")
	public void i_enter_invalid_and_invalid(String username, String password) throws TestCaseFailed {
		Log.info("Enter Username and Password");
		LoginPage.enterUnamePass(username, password);
	    
	}

	@Then("^On clicking 'Login' button, an error message 'Invalid Username/Password' is displayed to the user\\.$")
	public void on_clicking_Login_button_an_error_message_Invalid_Username_Password_is_displayed_to_the_user() throws TestCaseFailed, IOException {
	    
		Log.info("Click Login button");
		LoginPage.clickLogin();
		LoginPage.getErrorText();
	}

	@When("^I enter valid \"([^\"]*)\" and invalid \"([^\"]*)\"$")
	public void i_enter_valid_and_invalid(String username, String password) throws TestCaseFailed {
	    
		Log.info("Enter Username and Password");
		LoginPage.enterUnamePass(username, password);
	}

	@Then("^on clicking login button, an error message invalid username/password is displayed\\.$")
	public void on_clicking_login_button_an_error_message_invalid_username_password_is_displayed() throws TestCaseFailed, IOException {
		Log.info("Click Login button");
		LoginPage.clickLogin();
		LoginPage.getErrorText();
	    
	}

	@When("^I enter invalid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_invalid_and_valid(String username, String password) throws TestCaseFailed {
	    
		Log.info("Enter Username and Password");
		LoginPage.enterUnamePass(username, password);
	}

	@Then("^on clicking login button(\\d+), an error message invalid username/password is displayed\\.$")
	public void on_clicking_login_button_an_error_message_invalid_username_password_is_displayed(int username) throws TestCaseFailed, IOException{
		Log.info("Click Login button");
		LoginPage.clickLogin();
		LoginPage.getErrorText();
	    
	}

	@When("^I enters valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enters_valid_and_valid(String username, String password) throws TestCaseFailed {
		Log.info("Enter Username and Password");
		LoginPage.enterUnamePass(username, password);
	    
	}

	@Then("^user should be able to login successfully and Home text is displayed as a header of the page\\.$")
	public void user_should_be_able_to_login_successfully_and_Home_text_is_displayed_as_a_header_of_the_page() throws TestCaseFailed {
	    
		Log.info("Click Login button");
		LoginPage.clickLogin();
	}

	@Then("^verify page title and url\\.$")
	public void verify_page_title_and_url() throws TestCaseFailed, IOException {
		Log.info("Verify page title after login");
		LoginPage.verifyPageTitle();
	    
	}

	@Then("^close driver\\.$")
	public void close_driver() throws TestCaseFailed {
	   // Thread.sleep(5000);
	  //  BrowserFactory.closeDriver();
	    
	}

	
}
