package rehubaTestcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class RehubaRegForm {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {

		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();
		driver.get("file:///C:/Mini%20project-Rehuba%20Itc%20Airlines/Register.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void reg1()
	{
		driver.findElement(By.id("fname")).sendKeys("1234567");
		driver.findElement(By.id("lname")).sendKeys("344656768");
		Select dropDown=new Select(driver.findElement(By.id("country")));
		dropDown.selectByIndex(2);
		WebElement radio=driver.findElement(By.id("female"));
		radio.click();
		driver.findElement(By.id("mob")).sendKeys("1736");
		driver.findElement(By.id("email")).sendKeys("usha@gmail");
		driver.findElement(By.id("aadhar")).sendKeys("915272");
		driver.findElement(By.id("username")).sendKeys("Usha");
		driver.findElement(By.id("password")).sendKeys("r2345");
		driver.findElement(By.id("confirm-password")).sendKeys("U345");
		WebElement checkBoxSelect=driver.findElement(By.id("checkbox"));
		Boolean isSelect=checkBoxSelect.isSelected();
		//		if (isSelect==false)
		//		{
		//			checkBoxSelect.click();
		//		}
		driver.findElement(By.id("register")).click();

		//		Alert alert=driver.switchTo().alert();
		//		alert.accept();

	}
	@Test
	public void reg2()
	{
		//	  driver.findElement(By.id("fname")).sendKeys("");
		//		driver.findElement(By.id("lname")).sendKeys("Kavadi");
		//		Select dropDown=new Select(driver.findElement(By.id("country")));
		//		dropDown.selectByIndex(2);
		//		WebElement radio=driver.findElement(By.id("female"));
		//		radio.click();
		//		driver.findElement(By.id("mob")).sendKeys("9160201736");
		//		driver.findElement(By.id("email")).sendKeys("usha@gmail.com");
		//		driver.findElement(By.id("aadhar")).sendKeys("911203655272");
		//		driver.findElement(By.id("username")).sendKeys("Usharani12");
		//		driver.findElement(By.id("password")).sendKeys("Usha12345");
		//		driver.findElement(By.id("confirm-password")).sendKeys("Usha12345");
		//		WebElement checkBoxSelect=driver.findElement(By.id("checkbox"));
		//		Boolean isSelect=checkBoxSelect.isSelected();
		//		if (isSelect==false)
		//		{
		//			checkBoxSelect.click();
		//		}
		driver.findElement(By.id("register")).click();
		//Alert alert=driver.switchTo().alert();
		//alert.accept();

	}
	@Test
	public void reg3() throws InterruptedException
	{
		
		driver.findElement(By.id("fname")).sendKeys("");
		driver.findElement(By.id("register")).click();
		driver.findElement(By.id("fname")).sendKeys("Usharani");
		driver.findElement(By.id("lname")).sendKeys("");
		driver.findElement(By.id("register")).click();

		driver.findElement(By.id("lname")).sendKeys("Kavadi");
		Select dropDown=new Select(driver.findElement(By.id("country")));
		//dropDown.selectByIndex(2);
		driver.findElement(By.id("register")).click();
		dropDown.selectByIndex(2);
		WebElement radio=driver.findElement(By.id("female"));
		//radio.click();
		driver.findElement(By.id("register")).click();
		radio.click();
		driver.findElement(By.id("mob")).sendKeys("");
		driver.findElement(By.id("register")).click();
		driver.findElement(By.id("mob")).sendKeys("9160201736");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("register")).click();
		driver.findElement(By.id("email")).sendKeys("usha@gmail.com");
		driver.findElement(By.id("aadhar")).sendKeys("");
		driver.findElement(By.id("register")).click();
		driver.findElement(By.id("aadhar")).sendKeys("911203655272");
		driver.findElement(By.id("username")).sendKeys("");
		driver.findElement(By.id("register")).click();
		driver.findElement(By.id("username")).sendKeys("Usharani12");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.id("register")).click();
		driver.findElement(By.id("password")).sendKeys("Usha12345");
		driver.findElement(By.id("confirm-password")).sendKeys("");
		driver.findElement(By.id("register")).click();
		driver.findElement(By.id("confirm-password")).sendKeys("Usha12345");
		driver.findElement(By.id("register")).click();
		WebElement checkBoxSelect=driver.findElement(By.id("checkbox"));
		Boolean isSelect=checkBoxSelect.isSelected();
		//		if (isSelect==false)
		//		{
		//			checkBoxSelect.click();
		//		}
		driver.findElement(By.id("register")).click();
		if (isSelect==false)
		{
			checkBoxSelect.click();
		}
		driver.findElement(By.id("register")).click();

		Alert alert=driver.switchTo().alert();
		alert.accept();
        Thread.sleep(3000);
	}
	@Test
	public void reg4() throws InterruptedException
	{
		driver.findElement(By.id("fname")).sendKeys("Usharani");
		driver.findElement(By.id("lname")).sendKeys("Kavadi");
		Select dropDown=new Select(driver.findElement(By.id("country")));
		dropDown.selectByIndex(2);
		WebElement radio=driver.findElement(By.id("female"));
		radio.click();
		driver.findElement(By.id("mob")).sendKeys("9160201736");
		driver.findElement(By.id("email")).sendKeys("usha@gmail.com");
		driver.findElement(By.id("aadhar")).sendKeys("911203655272");
		driver.findElement(By.id("username")).sendKeys("Usharani12");
		driver.findElement(By.id("password")).sendKeys("Usha12345");
		driver.findElement(By.id("confirm-password")).sendKeys("Usha12345");
		WebElement checkBoxSelect=driver.findElement(By.id("checkbox"));
		Boolean isSelect=checkBoxSelect.isSelected();
		if (isSelect==false)
		{
			checkBoxSelect.click();
		}
		driver.findElement(By.id("register")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
        Thread.sleep(3000);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
