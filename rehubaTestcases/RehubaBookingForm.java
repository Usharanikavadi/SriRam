package rehubaTestcases;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class RehubaBookingForm {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {

		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforeMethoddet() {
		System.out.println("Fill the Rehuba Airlines Booking form");
		//drv.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Wait w=new FluentWait(drv).withTimeout(40,TimeUnit.SECONDS);
		driver.get("file:///C:/Mini%20project-Rehuba%20Itc%20Airlines/bookingusha.html");
		Select dp1=new Select(driver.findElement(By.id("input-group")));
		dp1.selectByIndex(2);
		Select dp2=new Select(driver.findElement(By.id("input-group1")));
		dp2.selectByIndex(3);
		Select dp3=new Select(driver.findElement(By.id("input-group2")));
		dp3.selectByIndex(2);
		Select dp4=new Select(driver.findElement(By.id("input-group3")));
		dp4.selectByIndex(3);
		Select dp5=new Select(driver.findElement(By.id("adult")));
		dp5.selectByIndex(10);
		//String cellval=driver.findElement(By.id("Arrival")).getText();
		WebElement arrival=driver.findElement(By.xpath("//input[@id=\"Arrival\"]"));
		arrival.sendKeys("12022022");
		WebElement departure=driver.findElement(By.xpath("//input[@id=\"Departure\"]"));
		departure.sendKeys("27022022");
		WebElement dob1=driver.findElement(By.xpath("//input[@id=\"dob\"]"));
		dob1.sendKeys("19091999");

		WebElement radioBoxSelect=driver.findElement(By.id("radio1"));
		Boolean isSelect=radioBoxSelect.isSelected();
		if (isSelect==false)
		{
			radioBoxSelect.click();
		}
	}
	@Test
	public void booking1() throws InterruptedException
	{



		driver.findElement(By.id("fname")).sendKeys("234567788");
		driver.findElement(By.id("lname")).sendKeys("46788899544");

		driver.findElement(By.className("phone")).sendKeys("9160201736");
		driver.findElement(By.className("email")).sendKeys("usha@gmail.com");

		driver.findElement(By.id("sub")).click();
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		//drv.findElement(By.id("check")).click();
	}
	@Test
	public void booking2()
	{


		driver.findElement(By.id("fname")).sendKeys("Usharani");
		driver.findElement(By.id("lname")).sendKeys("Kavadi");
		driver.findElement(By.className("phone")).sendKeys("916020");
		driver.findElement(By.className("email")).sendKeys("usha@gmail");
		driver.findElement(By.id("sub")).click();

		//drv.findElement(By.id("check")).click();
	}
	@Test
	public void booking3()
	{


		driver.findElement(By.id("fname")).sendKeys("Usharani");
		driver.findElement(By.id("lname")).sendKeys("Kavadi");
		driver.findElement(By.className("phone")).sendKeys("9160201736");
		driver.findElement(By.className("email")).sendKeys("usha@gmail.com");
		driver.findElement(By.id("sub")).click();

		//drv.findElement(By.id("check")).click();
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
