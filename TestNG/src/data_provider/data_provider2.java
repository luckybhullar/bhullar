package data_provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider2 {
	WebDriver driver = new ChromeDriver() ;
	@BeforeClass
	 public void in()
	 {
		String path = "F:\\Selenium\\chrome\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		 
		 
		 driver.get("http://www.facebook.com:");
		
	 }
	
	
	@Test(dataProvider="datademo")
	
	public void m(String user, String pass ) throws InterruptedException
	{
			
		driver.findElement(By.xpath("//input[@id='email']")). sendKeys(user); 
	    		
		driver.findElement(By.xpath("//input[@id='pass']")). sendKeys(pass);	
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='email']")).clear();; 
    		
			driver.findElement(By.xpath("//input[@id='pass']")).clear();;
			
	}
	
	@AfterClass
	public void m3()
	{
		driver.quit();
		
		
		
		
	}
	
	
	
	
	
	
	

		@DataProvider(name ="datademo")
		public Object[][] da() {
			
			Object[][]  arr=new Object[][] {{"user1","pass"},{"user2","pass"},{"user3","pass"}};
			
			
			return arr;
			
			
			
		}

}
