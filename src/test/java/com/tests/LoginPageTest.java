package com.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.ClickOnCharger;
import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initilazation();
		 homePage=new HomePage();
		
	}
	
	@Test
	public void loginPageTest() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	}
	


