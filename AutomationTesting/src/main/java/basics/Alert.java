package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert extends Base {
	
	public void alertHandling()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement alert = driver.findElement(By.xpath("//button[@class= 'btn btn-success']"));
		alert.click();
		
		driver.switchTo().alert().accept();
		
	}
	public void alertHandling2()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement alert = driver.findElement(By.xpath("//button[@class= 'btn btn-warning']"));
		alert.click();
		
		driver.switchTo().alert().dismiss();
		
	}
	
	public void alertHandling3()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement alert = driver.findElement(By.xpath("//button[@class= 'btn btn-danger']"));
		alert.click();
		
		driver.switchTo().alert().sendKeys("Sample message");
		driver.switchTo().alert().accept();

		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alert alert = new Alert();
		alert.browserInitialisation();
		
		alert.alertHandling();
	
		alert.alertHandling2();

		alert.alertHandling3();
	}

}
