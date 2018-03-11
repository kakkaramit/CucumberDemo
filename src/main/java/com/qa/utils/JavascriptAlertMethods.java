package com.qa.utils;


import com.qa.utils.BrowserFactory;

public class JavascriptAlertMethods implements BaseTest {
	
	/**
	 * Method to select javascript alert
	 * @param decision
	 */
	
	public void handleAlert(String decision)
	{
		if(decision.equals("accept"))
			BrowserFactory.driver.switchTo().alert().accept();
		else
			BrowserFactory.driver.switchTo().alert().dismiss();
	}
}
