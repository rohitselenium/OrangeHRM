package com.OrangeHRM.TestScript;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OrangeHRM.BaseTest;
import com.OrangeHRM.Page.LoginPage;
import com.OrangeHRM.Utility.ExcelReader;

public class TestLogin extends BaseTest{

	
	
	@Test(dataProvider="testData")
	public void login(String username,String password)
	{
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(username, password);
		
	}
	
	@DataProvider
	public Iterator<Object[]> testData()
	{
		
		ArrayList<Object[]> data=ExcelReader.getdata("LoginData");
		return data.iterator();
		
		
		/*
		return new Object[][]
				{
					{ "Admin","admin123"}
			
				};*/
		
	}
	
	
	
	
	
	
	
}
