package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {
	
	WebDriver  driver;
	
	@FindBy(xpath = "//div[@class='category-cards']/child::div[1]")
	WebElement elementsButton;
	
	@FindBy(xpath = "//li[@id='item-2']")
	WebElement radioButton;

	@FindBy(xpath = "//label[@for='yesRadio'] ")
	WebElement yesButton;
	
	public RadioButtonPage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements (driver,this);
	}
	
	//Page Operation Method
	
			//Operation#1- Launching the Text Box page
			
			public void launchRadioButtonPage() throws InterruptedException
			{
				Thread.sleep(5000);
				elementsButton.click();
				radioButton.click();
			}
			
			public void clickYesButton() throws InterruptedException
			{
				yesButton.click();
				Thread.sleep(2000);
			}
	
}
