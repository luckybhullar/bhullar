package Alert;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class alert1 {
	WebDriver driver;
	



@BeforeMethod

void m1()
{
	
	String path = "F:\\Selenium\\chrome\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", path);
	 WebDriver driver = new ChromeDriver() ;
	 	 driver.get("file:///F:/Selenium/template_7/alerts.html");
	
	
}
	
	
	
	
}
