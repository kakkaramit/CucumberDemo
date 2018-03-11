package com.qa.utils;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidationMethods extends SelectElementByType implements BaseTest
{
	private WebElement element=null;
	private WebDriverWait wait;

	/**
	 * Method to get title of a page.
	 * @return
	 */
	public String getPageTitle()
	{
		return BrowserFactory.driver.getTitle();
	}

	/**
	 * Method to verify title of a page.
	 * @param title
	 * @param testCase
	 * @throws TestCaseFailed
	 * @throws IOException 
	 */

	public void validateTitle(String title,boolean testCase) throws TestCaseFailed, IOException
	{
		String pageTitle = getPageTitle();

			if(testCase)
			{
				if(pageTitle.equals(title))
				{System.out.println("Page Title Matched, Actual Page Title : "+pageTitle);}	

				else
				{			
					throw new TestCaseFailed("Page Title Not Matched, Actual Page Title : "+pageTitle);	
				}
			} 
	}

	/**
	 * Method to verify partial title of a page.
	 * @param partialTitle
	 * @param testCase
	 * @throws TestCaseFailed
	 * @throws IOException 
	 */
	public void validatePartialTitle(String partialTitle,boolean testCase) throws TestCaseFailed, IOException
	{
		String pageTitle = getPageTitle();
		
			if(testCase)
			{
				if(pageTitle.contains(partialTitle))
					{System.out.println("Partial page Title Matched, Actual Page Title : "+pageTitle);	}
			else
			{			
				throw new TestCaseFailed("Partial page Not Matched, Actual Page Title : "+pageTitle);	
			}
		}
	}

	/**
	 * Method to get text of an element.
	 * @param accessType
	 * @param accessName
	 * @return
	 */
	public String getElementText( String accessType, String accessName)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		element =  wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		return element.getText();

	}

	/**
	 * Method to verify text of an element
	 * @param accessType
	 * @param actualValue
	 * @param accessName
	 * @param testCase
	 * @throws TestCaseFailed
	 * @throws IOException 
	 */
	public void validateElementText(String accessType,String actualValue,String accessName,boolean testCase) throws TestCaseFailed, IOException
	{
		String elementText = getElementText( accessType, accessName);

		
			if (testCase)
			{
				if (elementText.equals(actualValue))
					{System.out.println("Text Matched, Actual text is: " +elementText);}
			
			else
			{
				throw new TestCaseFailed("Text Not Matched, Actual text is:" +elementText);
			}
		} 
	}

	/**
	 * Method to verify partial text of an element.
	 * @param accessType
	 * @param actualValue
	 * @param accessName
	 * @param testCase
	 * @throws TestCaseFailed
	 * @throws IOException 
	 */

	public void validateElementPartialText(String accessType,String actualValue,String accessName,boolean testCase) throws TestCaseFailed, IOException
	{
		String elementText = getElementText(accessType, accessName);
		
			if (testCase)
			{
				if (elementText.contains(actualValue))
					{System.out.println("Text Matched");}
			
			else
			{
				throw new TestCaseFailed("Text Not Matched");
			}
		}
	}

	/**
	 * Method to validate if element is enabled.
	 * @param accessType
	 * @param accessName
	 * @return
	 */

	public boolean isElementEnabled( String accessType, String accessName)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		return element.isEnabled();
	}

	/**
	 * Method to verify if element is enabled.
	 * @param accessType
	 * @param accessName
	 * @param testCase
	 * @throws TestCaseFailed
	 * @throws IOException 
	 */
	public void validateElementEnable(String accessType, String accessName, boolean testCase) throws TestCaseFailed, IOException
	{
		boolean result=isElementEnabled(accessType,accessName);
		
			if(testCase)
			{
				if (result)
					{System.out.println("Element Enabled");}

			
			else 
			{ 
				throw new TestCaseFailed("Element Not Enabled");
			}
		} 
	}	  
	/**
	 * Method to get attribute of an element.
	 * @param accessType
	 * @param accessName
	 * @param attributeName
	 * @return
	 */

	public String getElementAttribute( String accessType,String accessName,String attributeName)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		return element.getAttribute(attributeName);
	}
	/**
	 * Method to verify attribute of an element.
	 * @param accessType
	 * @param attributeName
	 * @param attributeValue
	 * @param accessName
	 * @param testCase
	 * @throws TestCaseFailed
	 * @throws IOException 
	 */

	public void validateElementAttribute(String accessType, String attributeName, String attributeValue, String accessName, boolean testCase) throws TestCaseFailed, IOException
	{
		String attrVal = getElementAttribute(accessType, accessName, attributeName);
		
			if(testCase)
			{
				if(attrVal.equals(attributeValue))
				{	System.out.println("Attribute Value Matched");}
			
			else 
			{
				throw new TestCaseFailed("Attribute Value Not Matched");
			}
		} 
	}

	/**
	 * Method to validate is element is displayed.
	 * @param accessType
	 * @param accessName
	 * @return
	 */

	public boolean isElementDisplayed( String accessType,String accessName)
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		return element.isDisplayed();
	}

	/**
	 * Method to verify if element is present on the screen.
	 * @param accessType
	 * @param accessName
	 * @param testCase
	 * @throws TestCaseFailed
	 * @throws IOException 
	 */
	public void validateElementPresence(String accessType,String accessName,boolean testCase) throws TestCaseFailed, IOException
	{
		
			if (testCase)
			{
				if (isElementDisplayed(accessType, accessName))
					{System.out.println("Element Present");}
			
			else
			{
				throw new TestCaseFailed("Element Not Present"); 
			}
		} 
		/*catch(Exception e)
			{
				if(e.getMessage().equals("Present")) //only raise if it present
					throw new TestCaseFailed("Element Present");
			}*/

	}

	/**
	 * Method to validate if check box is validated.
	 * @param accessType
	 * @param accessName
	 * @param shouldBevalidated
	 * @throws TestCaseFailed
	 * @throws IOException 
	 */


	public void ischeckboxvalidated( String accessType,String accessName,boolean shouldBevalidated) throws TestCaseFailed, IOException
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		WebElement checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		
			if((checkbox.isSelected()) && shouldBevalidated)
			{System.out.println("checkbox is validated");}
			else 
			{throw new TestCaseFailed("checkbox is not validated");}
		} 
	


	/**
	 * Method to validate if radio button is selected. 
	 * @param accessType
	 * @param accessName
	 * @param shouldBeSelected
	 * @throws TestCaseFailed
	 * @throws IOException 
	 */

	public void isRadioButtonSelected( String accessType,String accessName,boolean shouldBeSelected) throws TestCaseFailed, IOException
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		WebElement radioButton = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		
			if((radioButton.isSelected()) && shouldBeSelected)
			{System.out.println("Radio Button is selected");}
			else {
				throw new TestCaseFailed("Radio Button not selected");}
		} 
	

	/**
	 * Method to assert if radio button is selected or not.
	 * @param accessType
	 * @param by
	 * @param option
	 * @param accessName
	 * @param shouldBeSelected
	 * @throws TestCaseFailed
	 * @throws IOException 
	 */
	public void isOptionFromRadioButtonGroupSelected( String accessType,String by,String option,String accessName,boolean shouldBeSelected) throws TestCaseFailed, IOException
	{
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		List<WebElement> radioButtonGroup = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getelementbytype(accessType, accessName)));

		for (WebElement rb : radioButtonGroup) {
			if(by.equals("value"))
			{
				if(rb.getAttribute("value").equals(option))
				{
					
						if((rb.isSelected()) && shouldBeSelected)
						{System.out.println("Radio Button is selected");}

						else 
						{throw new TestCaseFailed("Radio Button not selected");}
					
				}
			}
			else if(rb.getText().equals(option))
			{
				
					if((!rb.isSelected()) && shouldBeSelected)
					{System.out.println("Radio Button is selected");}

					else
					{throw new TestCaseFailed("Radio Button not selected");}
				} 
			}
		}
	

	/**
	 * Method to get alert text
	 * @return
	 */

	public String getAlertText()
	{
		return BrowserFactory.driver.switchTo().alert().getText();
	}

	/**
	 * Method to verify alert text.
	 * @param text
	 * @throws TestCaseFailed
	 * @throws IOException 
	 */

	public void validateAlertText(String text) throws TestCaseFailed, IOException
	{
		if(!getAlertText().equals(text))
			throw new TestCaseFailed("Text on alert pop up not matched");
	}

	/**
	 * method to select option from drop down
	 * @param accessType
	 * @param by
	 * @param option
	 * @param accessName
	 * @param shouldBeSelected
	 * @throws TestCaseFailed
	 * @throws IOException 
	 */


	public void isOptionFromDropdownSelected( String accessType,String by,String option,String accessName,boolean shouldBeSelected) throws TestCaseFailed, IOException
	{
		Select selectList=null;
		wait = new WebDriverWait(BrowserFactory.driver, 10);
		WebElement dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		selectList = new Select(dropdown);

		String actualValue="";
		if(by.equals("text"))
			actualValue = selectList.getFirstSelectedOption().getText();
		else
			actualValue = selectList.getFirstSelectedOption().getAttribute("value");

		
			if((!actualValue.equals(option))&&(shouldBeSelected))
			{System.out.println("Option Selected From Dropwdown");}
			else if ((actualValue.equals(option))&&(!shouldBeSelected))
			{throw new TestCaseFailed("Option Not Selected From Dropwdown");}
		} 
	}

