package com.OrangeHRM.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigFileReader {

	String path="C:\\Users\\rohranja\\eclipse-workspace\\OrangeHRM\\Config.properties\\configfile.properties";
	FileInputStream fis;
	Properties prop;
	File file;
	WebDriver driver;
	public ConfigFileReader()
	{
		file=new File(path);
		
		try 
		{
			fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public WebDriver getBrowserName()
	{
		if(prop.getProperty("Browser").equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", prop.getProperty("Chromepath"));
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript("window.location='https://opensource-demo.orangehrmlive.com/'");
		}
		return driver;
		
		
		
		
	}
	
	
}
