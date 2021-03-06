package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class ClickOnCharger extends TestBase {
	@FindBy(xpath="//div[@class='ins-image-box']")
	WebElement clickonlink;
	
	
	public ClickOnCharger() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnElement() {
		clickonlink.click();
		//return new ClickOnCharger();
	}

}
