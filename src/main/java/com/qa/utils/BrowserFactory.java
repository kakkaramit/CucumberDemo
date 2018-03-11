package com.qa.utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BrowserFactory {
	public static WebDriver driver;
	public static Properties prop;
	public static DesiredCapabilities capabilities;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	/**
	 * Constructor to load properties file
	 */
	public BrowserFactory() {
		try {
			prop = new Properties();
			FileInputStream finput = new FileInputStream(".\\src\\main\\java\\com\\qa\\resources\\config.properties");
			prop.load(finput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * Method to open a browser.
	 * @param browser
	 * @throws Exception
	 */

	public static void startDriver() throws Exception{
		String browsername= prop.getProperty("browser");
		if(driver==null){
			//Check if parameter passed is 'firefox'
			if(browsername.equalsIgnoreCase("firefox")){
				Log.info("Opening FIREFOX driver.");
				System.setProperty("webdriver.gecko.driver", ".\\src\\main\\java\\com\\qa\\resources\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			//Check if parameter passed as 'chrome'
			else if(browsername.equalsIgnoreCase("chrome")){
				Log.info("Opening CHROME driver.");
				System.setProperty("webdriver.chrome.driver",".\\src\\main\\java\\com\\qa\\resources\\chromedriver.exe");
				driver = new ChromeDriver();
				e_driver = new EventFiringWebDriver(driver);
				// Now create object of EventListerHandler to register it with EventFiringWebDriver
				eventListener = new WebEventListener();
				e_driver.register(eventListener);
				driver = e_driver;
				
				
			}
			//Check if parameter passed as 'chromeheadless'
			else if(browsername.equalsIgnoreCase("chromeheadless")){
				Log.info("Opening CHROME headless driver.");
				System.setProperty("webdriver.chrome.driver",".\\src\\main\\java\\com\\qa\\resources\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions(); 
				options.addArguments("window-size=1400,800");
				options.addArguments("headless");

				//create headless chrome instance
				driver = new ChromeDriver(options);
			}

			//Check if parameter passed as 'Edge'
			else if(browsername.equalsIgnoreCase("Edge")){
				Log.info("Opening EDGE driver.");
				System.setProperty("webdriver.edge.driver",".\\Resource\\MicrosoftWebDriver.exe");
				//create Edge instance
				driver = new EdgeDriver();
			}
			else if(browsername.equalsIgnoreCase("HTML")){
				Log.info("Opening HTMLUNIT driver.");
				capabilities = DesiredCapabilities.htmlUnit();
                capabilities.setBrowserName("htmlunit");
                capabilities.setVersion("firefox");
                capabilities.setPlatform(Platform.ANY);
                //capabilities.setJavascriptEnabled(true);
				driver = new HtmlUnitDriver(capabilities);
			}
			else if(browsername.equalsIgnoreCase("phantomjs")){
				Log.info("Opening phantomjs driver.");
				System.setProperty("phantomjs.binary.path",".\\src\\main\\java\\com\\qa\\Resource\\phantomjs.exe");
				driver = new PhantomJSDriver(capabilities);
			}
			else{
				//If no browser passed throw exception
				throw new Exception("Browser is not correct");
			}
		}

		addAllBrowserSetup(driver);
	}

	/**
	 * Method to setup a browser
	 * @param driver
	 */

	private static void addAllBrowserSetup(WebDriver driver) {
		//Log.info("Maximising the browser.");
		//driver.manage().window().maximize();
		Log.info("Open testing1 server.");
		driver.get("https://testing1.tk20.com");
		Log.info("Implement pageload timeout.");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Log.info("Implement implicitly wait.");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/**
	 * Method to close a browser.
	 * @throws InterruptedException
	 */
	public static void closeDriver() throws InterruptedException {
		Thread.sleep(5000);

		if (driver != null) {
			try {
				driver.close();
				driver.quit(); 
			} catch (NoSuchMethodError nsme) { 
			} catch (NoSuchSessionException nsse) { 
			} catch (SessionNotCreatedException snce) {} 
			driver = null;
		}
	}


}

