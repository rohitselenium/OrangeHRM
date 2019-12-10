package com.OrangeHRM.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement login;
	
	
	public void login(String username,String password)
	{
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		login.click();
		
	}
	
	
	
	

}
