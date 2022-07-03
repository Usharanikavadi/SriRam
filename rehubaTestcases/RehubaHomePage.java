package rehubaTestcases;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class RehubaHomePage {
	WebDriver driver;
   @BeforeMethod
  public void beforeMethod() {
	  String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();
		driver.get("file:///C:/Mini%20project-Rehuba%20Itc%20Airlines/loginpage.html");
  }
   
   @Test
  	public void loginpage1() throws InterruptedException
  	{ 
  		System.out.println("login to Rehuba Airlines");
  		driver.findElement(By.className("username")).sendKeys("Usha");
  		driver.findElement(By.id("password")).sendKeys("Usharanikavadi1");
  		driver.findElement(By.id("login")).click();
  		Thread.sleep(1000);
  		//Alert alert=driver.switchTo().alert();
  		//alert.accept();
  	}
   @Test
  	public void loginpage2() throws InterruptedException
  	{ 
  		System.out.println("login to Rehuba Airlines");
  		driver.findElement(By.className("username")).sendKeys("Usharani55");
  		driver.findElement(By.id("password")).sendKeys("Usha");
  		driver.findElement(By.id("login")).click();
  		Thread.sleep(1000);
  		//Alert alert=driver.switchTo().alert();
  		//alert.accept();
  	}
   @Test
	public void loginpage3() throws InterruptedException
	{ 
		System.out.println("login to Rehuba Airlines");
		driver.findElement(By.className("username")).sendKeys("Usharani55");
		driver.findElement(By.id("password")).sendKeys("Usharanikavadi1");
		driver.findElement(By.id("login")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
	}
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
}
