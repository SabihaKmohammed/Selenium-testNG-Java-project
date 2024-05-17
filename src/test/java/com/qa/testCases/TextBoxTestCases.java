package com.qa.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.TextBoxPage;
import com.qa.utilities.ReadExcel;

public class TextBoxTestCases extends BaseClass{
	
	TextBoxPage objTextBoxPage;
	//Start Application before all test cases from this class
	@BeforeTest
	public void startApplication() throws IOException, InterruptedException
	{
		driver = initializeDriver();
		objTextBoxPage=new TextBoxPage(driver);
	}	
	
  @Test
  public void verifysubmitformTestCases() throws InterruptedException, IOException
  {
	  objTextBoxPage.launchTextBoxPage();
	  objTextBoxPage.submitForm(ReadExcel.getCellValue(2,2), ReadExcel.getCellValue(2,3),ReadExcel.getCellValue(2,4), ReadExcel.getCellValue(2,5));
	  Assert.assertEquals(objTextBoxPage.getFullName(), "Name:"+ReadExcel.getCellValue(2,2));
	  Assert.assertEquals(objTextBoxPage.getEmailAddress(), "Email:"+ReadExcel.getCellValue(2,3));
	  Assert.assertEquals(objTextBoxPage.getCurrentAddress(), "Current Address :"+ReadExcel.getCellValue(2,4));
	  Assert.assertEquals(objTextBoxPage.getPermanentAddress(), "Permananet Address :"+ReadExcel.getCellValue(2,5));
	
  }
  
  @AfterTest
  public void closeApplication()
  {
	  closeAllDriver();
  }
}
