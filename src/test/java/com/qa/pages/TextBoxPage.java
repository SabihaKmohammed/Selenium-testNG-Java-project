package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
	
	WebDriver driver;
	//Page object Repository -Elements located using @FindBy annotation
	//page Factory Design pattern
	
	
	// Elements to navigate to the page
	
	@FindBy(xpath = "//div[@class='category-cards']/child::div[1]")
	WebElement elementsButton;

	@FindBy(xpath = "//span[text()='Text Box']")
	WebElement TextboxButton;
	
	// Elements to submit form

		@FindBy(xpath = "//input[@id='userName']")
		WebElement fullNameTextBox;

		@FindBy(xpath = "//input[@id='userEmail']")
		WebElement emailTextBox;

		@FindBy(xpath = "//textarea[@id='currentAddress']")
		WebElement currrentAddressTextBox;

		@FindBy(xpath = "//textarea[@id='permanentAddress']")
		WebElement permAdressTextBox;

		@FindBy(id = "submit")
		WebElement submitButton;
		
		// Elements to get submitted details to verify

		@FindBy(xpath = "//p[@id='name']")
		WebElement outputName;

		@FindBy(xpath = "//p[@id='email']")
		WebElement OutputEmail;

		@FindBy(xpath = "//p[@id='currentAddress']")
		WebElement OutputcurrAdddress;

		@FindBy(xpath = "//p[@id='permanentAddress']")
		WebElement OutputpermAdddress;
		
		//Page class constructor
		
		public TextBoxPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements (driver,this);
		}
		
	//Page Operation Method
		
		//Operation#1- Launching the Text Box page
		
		public void launchTextBoxPage() throws InterruptedException
		{
			Thread.sleep(5000);
			elementsButton.click();
			TextboxButton.click();
		}
		//Operation#2
		//Submitform -Void method with parameters or test Data
		
		public void submitForm(String FullName,String Email, String CurrentAddress, String PermaneentAddress) throws InterruptedException
        {
 	      Thread.sleep(5000);
 	      fullNameTextBox.sendKeys(FullName);
 	      emailTextBox.sendKeys(Email);
 	      currrentAddressTextBox.sendKeys(CurrentAddress);
 	      permAdressTextBox.sendKeys(PermaneentAddress);
 	      Thread.sleep(10000);
 	      submitButton.click();
 	      Thread.sleep(10000);
 	      
        }
		//Operation #3
		//GetSubmitted Details: Method with return type -E.g.String,int..
		
		public String getFullName()
		{
			return outputName.getText();
		}
		
		public String getEmailAddress()
		{
			return OutputEmail.getText();
		}
		public String getCurrentAddress()
		{
			return OutputcurrAdddress.getText();
		}
		public String getPermanentAddress()
		{
			return OutputpermAdddress.getText();
		}
}
