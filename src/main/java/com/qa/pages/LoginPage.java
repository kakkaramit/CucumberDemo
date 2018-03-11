package com.qa.pages;

import java.io.IOException;

import com.qa.utils.BaseTest;
import com.qa.utils.TestCaseFailed;

public class LoginPage implements BaseTest{

	//public static WebDriver driver;

	public static void enterUnamePass(String username, String password)
	{
		datainputObj.enterText("id", username, "user");
		datainputObj.enterText("id", password, "pass");
	}

	public static void clickLogin()
	{
		clickelementObj.click("xpath", "//button[@name='login2']");
	}

	public static void getErrorText() throws TestCaseFailed, IOException
	{
		validationObj.validateElementText("xpath", "Invalid Username/Password", "//div[@id='error']/p", true);
	}

	public static void verifyPageTitle() throws TestCaseFailed, IOException
	{
		validationObj.validateTitle("TK20 | Home", true);
	}


}
