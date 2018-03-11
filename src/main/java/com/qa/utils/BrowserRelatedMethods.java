//package com.qa.utils;
//
//import java.io.IOException;
//
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.qa.utils.BrowserFactory;
//
//public class BrowserRelatedMethods extends SelectElementByType implements BaseTest
//{
//	
//	private WebElement element=null;
//	private String old_win = null;
//	private String lastWinHandle;
//	private WebDriverWait wait;
//	
//	/**
//	 * Method to navigate to a particular URL. 
//	 * @param url
//	 */
//	
//	public void navigateTo(String url) 
//	{
//		BrowserFactory.driver.get(url);
//	}
//	
//	/**
//	 * Method to navigate using browser back button.
//	 * @param direction
//	 */
//	
//	public void navigate(String direction)
//	{
//		if (direction.equals("back"))
//			BrowserFactory.driver.navigate().back();
//		else
//			BrowserFactory.driver.navigate().forward();
//	}
//	
//	/**
//	 * Method to get key
//	 * @return
//	 */
//	public Keys getKey()
//	{
//		String os = System.getProperty("os.name").toLowerCase();
//		if(os.contains("win"))
//			return Keys.CONTROL;
//		else if (os.contains("nux") || os.contains("nix"))
//			return Keys.CONTROL;
//		else if (os.contains("mac"))
//			return Keys.COMMAND;
//		else
//			return null;
//	}
//	
//	
//	public void zoomInOut(String inOut)
//	{
//		WebElement Sel= BrowserFactory.driver.findElement(getelementbytype("tagName","html"));
//		if(inOut.equals("ADD"))
//			Sel.sendKeys(Keys.chord(getKey(), Keys.ADD));
//		else if(inOut.equals("SUBTRACT"))
//			Sel.sendKeys(Keys.chord(getKey(), Keys.SUBTRACT));
//		else if(inOut.equals("reset"))
//			Sel.sendKeys(Keys.chord(getKey(), Keys.NUMPAD0));
//	}
//	
//	
//	public void zoomInOutTillElementDisplay(String accessType,String inOut,String accessName)
//	{
//		Actions action = new Actions(BrowserFactory.driver);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
//		while(true)
//		{
//			if (element.isDisplayed())
//				break;
//			else
//				action.keyDown(getKey()).sendKeys(inOut).keyUp(getKey()).perform();
//		}
//	}
//	
//	
//	public void resizeBrowser(int width, int height)
//	{
//		BrowserFactory.driver.manage().window().setSize(new Dimension(width,height));
//	}
//	
//	
//	public void maximizeBrowser()
//	{
//		BrowserFactory.driver.manage().window().maximize();
//	}
//	
//	public void hoverOverElement(String accessType, String accessName)
//	{
//		Actions action = new Actions(BrowserFactory.driver);
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
//		action.moveToElement(element).perform();
//	}
//	
//	
//	public void scrollToElement(String accessType, String accessName)
//	{
//		element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
//		JavascriptExecutor executor = (JavascriptExecutor)BrowserFactory.driver;
//		executor.executeScript("arguments[0].scrollIntoView();", element);
//	}
//	
//	
//	public void scrollPage(String to) throws TestCaseFailed, IOException 
//	{
//		JavascriptExecutor executor = (JavascriptExecutor)BrowserFactory.driver;
//		if (to.equals("end"))
//			executor.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
//		else if (to.equals("top"))
//            executor.executeScript("window.scrollTo(Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight),0);");
//		else
//			throw new TestCaseFailed("Exception : Invalid Direction (only scroll \"top\" or \"end\")");
//	}
//	
//	
//    public void switchToNewWindow()
//    {
//    	old_win = BrowserFactory.driver.getWindowHandle();
//    	for(String winHandle : BrowserFactory.driver.getWindowHandles())
//    		lastWinHandle = winHandle;
//    	BrowserFactory.driver.switchTo().window(lastWinHandle);
//    }
//    
//   
//    public void switchToOldWindow()
//    {
//    	BrowserFactory.driver.switchTo().window(old_win);
//    }
//    
//   
//    public void switchToWindowByTitle(String windowTitle) throws TestCaseFailed, IOException
//    {
//    	//System.out.println("++"+windowTitle+"++");
//    	old_win = BrowserFactory.driver.getWindowHandle();
//    	boolean winFound = false;
//    	for(String winHandle : BrowserFactory.driver.getWindowHandles())
//    	{
//    		String str = BrowserFactory.driver.switchTo().window(winHandle).getTitle();
//    		//System.out.println("**"+str+"**");
//    		if (str.equals(windowTitle))
//    		{
//    			winFound = true;
//    			break;
//    		}
//    	}
//    	if (!winFound)
//    		throw new TestCaseFailed("Window having title "+windowTitle+" not found");
//    }
//
//    
//    public void closeNewWindow()
//    {
//    	BrowserFactory.driver.close();
//    }
//    
//    
//    public void switchFrame(String accessType, String accessName)
//    {
//    	if(accessType.equalsIgnoreCase("index"))
//    		BrowserFactory.driver.switchTo().frame(accessName);
//    	else
//    	{
//    		element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
//    		BrowserFactory.driver.switchTo().frame(element);
//    	}
//    }
//    
//   
//    public void switchToDefaultContent()
//    {
//    	BrowserFactory.driver.switchTo().defaultContent();
//    }
//}
//
