package com.simplilearn.seleniumtestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class testNg {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("amazon");
		WebElement username=driver.findElement(By.id("user_email_Login"));
		WebElement password=driver.findElement(By.id("user_password"));
		WebElement login=driver.findElement(By.name("commit"));
		username.sendKeys("abc@gmail.com");
		password.sendKeys("your_password");
		login.click();
		String actualUrl="https://live.browserstack.com/dashboard";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
	}
	
	}
	

