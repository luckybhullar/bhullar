package iframe;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class windowhandling {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void m1() 
	{
		
		String path = "F:\\Selenium\\chrome\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		  driver = new ChromeDriver() ;
		 	 driver.get("file:///F:/Selenium/template_7/new_window.html");
	
	driver.manage().window().maximize();	
	}
	
	
	
	@Test
	public void iframehandle6() throws InterruptedException 

	{
		//driver.switchTo().frame(driver.findElement(org.openqa.selenium.By.cssSelector("iframe#IF1")));
		driver.findElement(By.xpath("//*[@id=\"col-left\"]/button[1]")).click();;
		
		Set<String> windoIdSet = driver.getWindowHandles();
		
		Iterator i = (Iterator) windoIdSet.iterator();
		
		
		
		String firstWindowID = (String) i.next();
		
		String secWindowID = (String) i.next();
		
		driver.switchTo().window(secWindowID);
		
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(firstWindowID);
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/button[1]"));
		Thread.sleep(3000);
		driver.switchTo().window(firstWindowID);
		driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
