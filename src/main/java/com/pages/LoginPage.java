package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(name="login[username]")
	WebElement username1;
	
	@FindBy(name="login[password]")
	WebElement password1;
	
	@FindBy(xpath="//button[@id='send2']")
	WebElement clickonlogin;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public HomePage login(String un,String pwd) {
		 username1.sendKeys(un);
		
		 password1.sendKeys(pwd);
		 
		 clickonlogin.click();
		 return new HomePage();
		
	}
}
