package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	

	public void browserInitialisation()
	{
		driver = new ChromeDriver();
		//driver = new EdgeDriver(); // Edge
		//	driver = new FirefoxDriver(); // Firefox
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
	
	}
	
	public void quitAndClose()
	{
		//driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.browserInitialisation();
		base.quitAndClose();

	}

}
