package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public WebDriver driver;
	
	public void frameExmaple()
	{
		driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		WebElement JMeterImage = driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(JMeterImage);
		
		WebElement JMeter = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		JMeter.click();
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		frame.frameExmaple();
	}

}
