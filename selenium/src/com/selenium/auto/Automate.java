package com.selenium.auto;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();	
	    driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
	    
	    
	    WebElement email = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:email::content\"]"));
	    WebElement pass = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:password::content\"]"));
	    WebElement repass = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:retypePassword::content\"]"));
	    Select s = new Select(driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:country::content\"]")));
	    WebElement fname = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:firstName::content\"]"));
	    WebElement lname = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:lastName::content\"]"));
	    WebElement job = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:jobTitle::content\"]"));
	    WebElement work = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:workPhone::content\"]"));
	    WebElement companyname = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:companyName::content\"]"));
	    WebElement address = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:address1::content\"]"));
	    WebElement city = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:city::content\"]"));
	    Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:state::content\"]")));
	    WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:postalCode::content\"]"));

	    email.sendKeys("jansimuniyandi26@gmail.com");
	    pass.sendKeys("Jansirani26#");
	    repass.sendKeys("Jansirani26#");	    
	    s.selectByValue("IN");
	    fname.sendKeys("Sivakumar");
	    lname.sendKeys("Muniyandi");
	    job.sendKeys("Full stack developer");
	    work.sendKeys("9983428374");
	    companyname.sendKeys("ABC Ltd");
	    address.sendKeys("13 A,4 th street, chennai");
	    city.sendKeys("chennai");
	    s1.selectByValue("30");
	    zipcode.sendKeys("634232");
	    
	   
	    WebElement p=driver.findElement(By.linkText("Create Account"));
	    p.click();
	    
	    
	}
}
