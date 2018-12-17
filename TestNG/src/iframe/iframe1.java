package iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframe1 {
	WebDriver driver = new ChromeDriver() ;
	@Test
	@BeforeMethod

	void m1() throws InterruptedException
	{
		
		String path = "F:\\Selenium\\chrome\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		 WebDriver driver = new ChromeDriver() ;
		 	 driver.get("file:///F:/Selenium/template_7/iframes.html");
	
	driver.manage().window().maximize();	
	}
	
	public void get() throws InterruptedException 
	{
		driver.switchTo().frame(driver.findElement(org.openqa.selenium.By.cssSelector("iframe#IF1")));
		
		driver.findElement(org.openqa.selenium.By.xpath("//input[@id='name']")).sendKeys("manpreet");
		Thread.sleep(3000);
		
		
		
		
	}
	
	
	
	
	

}
