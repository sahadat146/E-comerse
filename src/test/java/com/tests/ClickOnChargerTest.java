package com.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.ClickOnCharger;
import com.pages.HomePage;
import com.pages.LoginPage;

public class ClickOnChargerTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ClickOnCharger clickOnCharger;
	
	public ClickOnChargerTest() {
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initilazation();
		
		loginPage=new LoginPage();
		homePage=new HomePage();
		
		clickOnCharger=homePage.clickonacess();
		clickOnCharger=new ClickOnCharger();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void clickonBettry() {
		clickOnCharger.clickOnElement();
		
	}
	
	
	

}
