package com.qa.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.qa.utilities.AppConfigurations;

public class BaseClass {
	
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException, InterruptedException
	{
		String browser= AppConfigurations.getValue("Browser");
		
		if(browser.equalsIgnoreCase("Chrome for Testing"))
		{
			System.setProperty("webdriver.chrome.driver", AppConfigurations.getValue("ChromeDriverpath"));
			
			//ChromeOptions co=new ChromeOptions();
		       
		  //  co.setBinary("D:\\DOWNLOAD\\chrome-win64\\chrome.exe");
			
		    driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.get(AppConfigurations.getValue("AppUrl"));
			Thread.sleep(3000);
			driver.manage().window().maximize();
		}
		return driver;
	}
		
		public void closeAllDriver()
		{
			driver.quit();
		}
}
