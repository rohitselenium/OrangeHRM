package com.OrangeHRM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.OrangeHRM.Utility.ConfigFileReader;

public class BaseTest {
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		ConfigFileReader config=new ConfigFileReader();
	
		driver=config.getBrowserName();
		
	}
	
	@AfterClass
	public void tearOff()
	{
		driver.close();
		
	}
	
	
}
