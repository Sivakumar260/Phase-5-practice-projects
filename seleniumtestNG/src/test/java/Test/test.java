package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	WebDriver driver=null;
	
	@Test(groups = "Chrome")
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(groups = "Chrome", dependsOnMethods = {"launchChrome"}, priority = 1)
	  public void register() {
		
	      driver.findElement(By.id("nav-link-accountList")).click();
	      driver.findElement(By.id("createAccountSubmit")).click();
	      driver.findElement(By.id("ap_customer_name")).sendKeys("sivakumar");
	      driver.findElement(By.id("ap_email")).sendKeys("siva23@gmail.com");
	      driver.findElement(By.id("ap_password")).sendKeys("12345678");
	      driver.findElement(By.name("passwordCheck")).sendKeys("12345678");
	      driver.findElement(By.id("continue")).click();
   
	  }
	  
	@Test(priority = 2)
	  public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
	      driver.findElement(By.id("nav-link-accountList")).click();
	      driver.findElement(By.id("ap_email")).sendKeys("siva23@gmail.com");
	      driver.findElement(By.id("continue")).click();
	      driver.findElement(By.id("ap_password")).sendKeys("12345678");
	      
	  }
	 @Test(priority = 3)
	  public void addToCart() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.amazon.in/");
		    System.out.println(driver.getTitle());
		    System.out.println(driver.getCurrentUrl());
		    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("airpods pro");
		    Thread.sleep(1000);
		    driver.findElement(By.id("nav-search-submit-button")).submit();
		    driver.findElement(By.linkText("Apple AirPods Pro")).click();
		    driver.findElement(By.name("submit.add-to-cart")).submit();
	  }

}