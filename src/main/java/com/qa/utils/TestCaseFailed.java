package com.qa.utils;

import java.io.IOException;


public class TestCaseFailed extends Exception implements BaseTest
{
	
	private static final long serialVersionUID = 1L;
	String message=null;
	
	/**
	 * Method to throw an exception if test case failed.
	 * @throws IOException 
	 */		
	 
	public TestCaseFailed(String message) throws IOException 
	{
	    super(message);
	    
			screenshotObj.takeScreenShot();
		} 
	    
	}
	 
