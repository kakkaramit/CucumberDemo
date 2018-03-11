package com.qa.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.utils.BrowserFactory;


public class ClickOnElementMethods extends SelectElementByType implements BaseTest
{
	private WebElement element=null;
	private WebDriverWait wait;
	
	/**
	 * Method to click on the element.
	 * @param accessType
	 * @param accessName
	 */
	public void click(String accessType, String accessName)
	{
		//if (BrowserFactory.driver != null) {
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		
		element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		element.click();
		//}
		
	}
	
	/**
	 * Method to forcefully click on element.
	 * @param accessType
	 * @param accessName
	 */
	public void clickForcefully(String accessType, String accessName)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		JavascriptExecutor executor = (JavascriptExecutor)BrowserFactory.driver;
		executor.executeScript("arguments[0].click();",element);
	}
	
	/**
	 * Method to double click on element.
	 * @param accessType
	 * @param accessValue
	 */
	public void doubleClick(String accessType, String accessValue)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessValue)));

		Actions action = new Actions(BrowserFactory.driver);
		action.moveToElement(element).doubleClick().perform();
	}
}
