package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//h1[text()='My Dashboard']")
	WebElement verifyHomePage;
	
	@FindBy(linkText="Cell Phones & Accessories")
	WebElement clickOnAssesarybutton;
	


public HomePage() {
	PageFactory.initElements(driver,this);
}

public String verifyhompge() {
	return verifyHomePage.getText();
}
public ClickOnCharger clickonacess() {
	
	clickOnAssesarybutton.click();
	
	return new ClickOnCharger();
}

}