package com.selenium.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class login {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();	
	    driver.get("https://login.oracle.com/mysso/signon.jsp");   
	    
	    WebElement email = driver.findElement(By.xpath("//*[@id=\"sso_username\"]"));
	    WebElement pass = driver.findElement(By.xpath("//*[@id=\"ssopassword\"]"));
	   
	    email.sendKeys("sivakumarmj23@psnacet.edu.in");
	    pass.sendKeys("Jansirani26#");
	       
	    WebElement p=driver.findElement(By.id("signin_button"));
	    p.submit();   
	}
}
