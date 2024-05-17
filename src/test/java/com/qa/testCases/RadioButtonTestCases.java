package com.qa.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.RadioButtonPage;


public class RadioButtonTestCases extends BaseClass{
 
	RadioButtonPage objRadioButtonPage;
	@BeforeTest
	public void startApplication() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		objRadioButtonPage=new RadioButtonPage(driver);
	}
	
	@Test
	public void clickingOnYesButton() throws InterruptedException
	{
		objRadioButtonPage.launchRadioButtonPage();
		objRadioButtonPage.clickYesButton();
	}
	

	 @AfterTest
	  public void closeApplication() 
	 {
		 
		  closeAllDriver();
	  }
}
