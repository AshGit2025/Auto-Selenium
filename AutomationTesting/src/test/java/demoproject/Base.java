package demoproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;


public class Base {
	
	public WebDriver driver;

 
  @BeforeMethod
  public void browserInitialising() {
	  driver = new ChromeDriver();
	  driver.get("https://www.qabible.in/payrollapp/");
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // applying implicit wait
	  
  }

  @AfterMethod
  public void Quit() {
  }

}
