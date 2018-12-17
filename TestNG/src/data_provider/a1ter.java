package data_provider;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class a1ter {
	WebDriver driver;



@Test
	@BeforeMethod

	void m1() throws InterruptedException
	{
		
		String path = "F:\\Selenium\\chrome\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		 WebDriver driver = new ChromeDriver() ;
		 	 driver.get("file:///F:/Selenium/template_7/alerts.html");
		 	 driver.findElement(By.xpath("//input[@value='Alert Box']")).click();
		 	
		 	Thread.sleep(3000);
		 	
		 	 Alert  a = driver.switchTo().alert();
		 	 a.accept();
		 	/* 
		 	Alert  a1 = driver.switchTo().alert();
		 	driver.findElement(By.xpath("//input[@value='Confirm Box']")).click();
		 	 
		 	Thread.sleep(3000);
		 	 a1.dismiss();
		 	 
		 	 */
		 	 
		 	 
		 	Alert  a2 = driver.switchTo().alert();
		 	driver.findElement(By.xpath("//input[@value='PromptBox']")).click();
		 	 
		 	Thread.sleep(3000);
		 	 a2.sendKeys("hello");
		 	 Thread.sleep(3000);
		 	 a2.accept();
		
	}
		

}
