package defaultpackage;

import java.sql.Driver;

import org.openqa.selenium.support.ui.Select;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String path = "F:\\Selenium\\chrome\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		 WebDriver driver = new ChromeDriver() ;
		 
		 driver.get("http://www.facebook.com:");
		driver.findElement(By.name("firstname")).sendKeys("Manpreet");
		driver.findElement(By.name("lastname")).sendKeys("Bhullar");
		driver.findElement(By.name("reg_email__")).sendKeys("9814099266");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Aadsdas@1232");
		
		Select d = new Select(driver.findElement(By.name("birthday_day")));
		d.selectByIndex(2);
        
		
		Select d2 = new Select(driver.findElement(By.name("birthday_month")));
		d2.selectByVisibleText("Mar");
		
		
		Select d3 = new Select(driver.findElement(By.name("birthday_year")));
		d3.selectByValue("1990");
		
		driver.findElement(By.id("u_0_a")).click();
		
		driver.findElement(By.name("websubmit")).click();
	}
}

		