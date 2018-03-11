package com.qa.utils;

public interface BaseTest {
	//MiscMethods miscmethodObj = new MiscMethods();
	//BrowserRelatedMethods browserObj = new BrowserRelatedMethods();
	ValidationMethods validationObj = new ValidationMethods();
//	ValidationMethodsAssert validationObj = new ValidationMethodsAssert();
	ClickOnElementMethods clickelementObj = new ClickOnElementMethods();
	//ClickOnElementMethodsNew clickelementObj= new ClickOnElementMethodsNew();
	DataInputMethods datainputObj = new DataInputMethods();
	//DataInputMethodsNew datainputObj = new DataInputMethodsNew();
	JavascriptAlertMethods javascriptObj = new JavascriptAlertMethods();
	ScreenShotMethods screenshotObj = new ScreenShotMethods();
	SelectElementByType selectelement = new SelectElementByType();
	FileUploadMethod fileupload = new FileUploadMethod();
}
