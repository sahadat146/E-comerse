package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop=new Properties();
			
			FileInputStream fs=new FileInputStream("C:\\Users\\blr-frontdesk-ptt\\Automotion\\org.ubuy\\src\\main\\java\\config\\config.properties");
		prop.load(fs);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		}
		
	
	public static void initilazation() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\blr-frontdesk-ptt\\Automotion\\AutomotionTe\\driver\\chromedriver.exe");
			
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
			
			driver=new ChromeDriver(opt);
		}
		/*else if(driver.equals("firefox"))
		{
			System.setProperty("WebDriver.gecko.driver"," d");
			driver=new FirefoxDriver();
			
		} */
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
			
	}


