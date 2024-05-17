package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1{

	public static void main(String[] args) throws InterruptedException {

	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rizwan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	       ChromeOptions co=new ChromeOptions();
	       
	       co.setBinary("C:\\Users\\Rizwan\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
			                                               
		   WebDriver driver=new ChromeDriver(co);
		   driver.get("https://www.selenium.dev/downloads/");
		   Thread.sleep(2000);
			
		   driver.close();
		
			

		}
}
