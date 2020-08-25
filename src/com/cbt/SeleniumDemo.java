package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo
{
	public static void main(String[] args)
	{
		//set system properties
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software\\SeleniumDependencies\\drivers\\chromedriver.exe"); 
		//create driver object
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("http://www.google.com");
		
		
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Software\\SeleniumDependencies\\drivers\\geckodriver.exe"); 
		//create driver object
		WebDriver geckodriver = new FirefoxDriver();
		geckodriver.get("http://www.yahoo.com");
		
		System.setProperty("webdriver.edge.driver", 
				"D:\\Software\\SeleniumDependencies\\drivers\\msedgedriver.exe"); 
		//create driver object
		WebDriver edgedriver = new FirefoxDriver();
		edgedriver.get("http://www.bing.com");
		
	}//end main
}
