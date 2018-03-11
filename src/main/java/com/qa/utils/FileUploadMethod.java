package com.qa.utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class FileUploadMethod {
	Robot robot;
	StringSelection stringSelection;
	
	public void setClipboardData(String string) {
		   stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	
	public void fileUpload(String fileLocation) throws TestCaseFailed, IOException 
	{
		try {
        	
            setClipboardData(fileLocation);
            
            robot = new Robot();
	
          //  robot.keyPress(KeyEvent.VK_ENTER);
          //  robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
        	throw new TestCaseFailed("File not present in provided location.");
        }
		
	}

}
