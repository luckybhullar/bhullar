package testn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngparameter {
	
	
@Test
    @Parameters({"msg","bb"})
	public void m1(String   a, String b)
	{  
		//System.out.println("say "+ a);
		//System.out.println("say "+ b);
	
	if(a.equalsIgnoreCase("Chrome"))
	{
		String path = "F:\\Selenium\\chrome\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		 WebDriver driver = new ChromeDriver() ;
		 
		 driver.get("http://www.amazon.com:");
		
		}
	else if(a.equalsIgnoreCase("Firefox")) 
	{ 
		String path = "F:\\Selenium\\chrome\\geckodriver.exe";
		
                 System.setProperty("webdriver.gecko.driver", path);
		 WebDriver driver = new FirefoxDriver() ;
		 
		 driver.get("http://www.gmail.com");
		
		
	}
		
		
	
	
	
	}
	
	
	}

 
  



	
	
	
	
	


