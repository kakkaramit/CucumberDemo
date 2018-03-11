package com.qa.utils;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.utils.BrowserFactory;

public class DataInputMethods extends SelectElementByType implements BaseTest
{
	private WebElement dropdown =null;
	private Select selectList=null;
	private WebDriverWait wait;
	
	/**
	 * Method to enter text within element
	 * @param accessType
	 * @param text
	 * @param accessName
	 */
	
	public void enterText(String accessType,String text,String accessName)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		BrowserFactory.driver.findElement(getelementbytype(accessType, accessName)).sendKeys(text);
		
		
		
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);

		// WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(>someid>)));
	}
	
	/**
	 * Method to clear text from an element.
	 * @param accessType
	 * @param accessName
	 */
	
	public void clearText(String accessType, String accessName)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		BrowserFactory.driver.findElement(getelementbytype(accessType, accessName)).clear();
	}
	
	/**
	 * Method to select element from drop down by type
	 * @param select_list
	 * @param bytype
	 * @param option
	 */
	
/*	public void selectelementfromdropdownbytype (Select select_list, String bytype, String option)
	{
		if(bytype.equals("Index"))
		{
			int index = Integer.parseInt(option);
			select_list.selectByIndex(index-1);
		}
		else if (bytype.equals("value"))
			select_list.selectByValue(option);
		else if (bytype.equals("text"))
			select_list.selectByVisibleText(option);
	}*/
	
	/**
	 * Method to select option from drop down
	 * @param accessType
	 * @param optionBy
	 * @param option
	 * @param accessName
	 */
	public void selectOptionFromDropdown(String accessType, String optionBy, String option, String accessName)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		selectList = new Select(dropdown);
		
		if(optionBy.equals("Index"))
			selectList.selectByIndex(Integer.parseInt(option)-1);
		else if (optionBy.equals("value"))
			selectList.selectByValue(option);
		else if (optionBy.equals("text"))
			selectList.selectByVisibleText(option);
	}
	
	/**
	 * Method to de-select all options from multi-select drop down.
	 * @param accessType
	 * @param accessName
	 */
	
	public void unselectAllOptionFromMultiselectDropdown(String accessType, String accessName)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		selectList = new Select(dropdown);
		selectList.deselectAll();
	}
	
	/**
	 * Method to de-select option from drop down
	 * @param accessType
	 * @param optionBy
	 * @param option
	 * @param accessName
	 */
	
	public void deselectOptionFromDropdown(String accessType, String optionBy, String option, String accessName) 
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		selectList = new Select(dropdown);
		
		if(optionBy.equals("Index"))
			selectList.deselectByIndex(Integer.parseInt(option)-1);
		else if (optionBy.equals("value"))
			selectList.deselectByValue(option);
		else if (optionBy.equals("text"))
			selectList.deselectByVisibleText(option);
	}
	
	/**
	 * Method to select a check box.
	 * @param accessType
	 * @param accessName
	 */
	
	public void checkCheckbox(String accessType, String accessName)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		WebElement checkbox= wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		if (!checkbox.isSelected())
			checkbox.click();
	}
	
	/**
	 * Method to de-select a check box.
	 * @param accessType
	 * @param accessName
	 */
	
	public void uncheckCheckbox(String accessType, String accessName)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		WebElement checkbox= wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		if (checkbox.isSelected())
			checkbox.click();
	}
	
	/**
	 * Method to select a toggle check box.
	 * @param accessType
	 * @param accessName
	 */
	public void toggleCheckbox(String accessType, String accessName)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName))).click();
	}
	
	/**
	 * Method to select a radio button
	 * @param accessType
	 * @param accessName
	 */
	
	public void selectRadioButton(String accessType, String accessName)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		WebElement radioButton = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		if(!radioButton.isSelected())
			radioButton.click();
	}
	
	/* /**
	 * Method to select option from radio button group.
	 * @param accessType
	 * @param option
	 * @param by
	 * @param accessName
	 
	
	public void selectOptionFromRadioButtonGroup(String accessType, String option, String by, String accessName)
	{
		List<WebElement> radioButtonGroup = BrowserFactory.driver.findElements(getelementbytype(accessType, accessName));
		for(WebElement rb : radioButtonGroup)
		{
			if(by.equals("value"))
			{
				if(rb.getAttribute("value").equals(option) && !rb.isSelected())
					rb.click();
			}
			else if(by.equals("text"))
			{
				if(rb.getText().equals(option) && !rb.isSelected())
					rb.click();
			}
		}
	}*/
}

