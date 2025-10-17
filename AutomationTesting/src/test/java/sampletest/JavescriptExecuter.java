package sampletest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class JavescriptExecuter {
	
	public WebDriver driver;
	
  @Test
  public void javascriptExample() 
  {
	  JavascriptExecutor executer = (JavascriptExecutor) driver;
	  executer.executeScript("window.scrollBy(0,2000)");
	  executer.executeScript("window.scrollBy(0,-500)");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
