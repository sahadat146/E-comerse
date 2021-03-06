package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.ClickOnCharger;
import com.pages.HomePage;
import com.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod 
	void setUp() {
		initilazation();
		loginPage = new LoginPage();
		homePage=new HomePage();
		
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
}

	@Test
	public void ckeck() {
		String verifyhompge=homePage.verifyhompge();
		Assert.assertEquals(verifyhompge,"MY DASHBOARD");
		
	}
	
	@Test
	public void clickon() {
		homePage.clickonacess();
		
	}
	
	
	
}
