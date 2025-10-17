package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandling {
	public WebDriver driver;

	public void multiWindowHandling()
	{
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		
		WebElement contactus = driver.findElement(By.xpath("//h1[text() = 'CONTACT US']"));
		contactus.click();
				
		WebElement login = driver.findElement(By.xpath("//h1[text() = 'LOGIN PORTAL']"));
		login.click();
		
		String parent = driver.getWindowHandle();
	   // System.out.println(parent); // to check/confirm that parent window is handling with an ID
	
	    Set<String> multiWindow = driver.getWindowHandles();
     	//System.out.println(multiWindow); // to check that what all windows are handling -- with IDs
	
	String title = ""; // declaring 'title' as null
	
	for (String allWindows : multiWindow )
	{
		if (!allWindows.equals(parent)) // excluding parent window from 'multiWindow'
		{
			System.out.println(allWindows);
			driver.switchTo().window(allWindows);
			//System.out.println(driver.getTitle()); // to identify web title
			title = driver.getTitle();
		}
		
		if (title.equals("WebDriver | Contact Us"))
		{
			WebElement firstname = driver.findElement(By.xpath("//input[@name = 'first_name']"));
			firstname.sendKeys("Aswathy");
			
		}
		
		if (title.equals("WebDriver | Login Portal"))
		{
			WebElement username = driver.findElement(By.id("text"));
			username.sendKeys("Ash");
		}
		
	}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiWindowHandling multiwindow = new MultiWindowHandling();
		multiwindow.multiWindowHandling();

	}

}
