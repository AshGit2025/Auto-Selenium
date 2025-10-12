package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base{

	public void singleCheckBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox = driver.findElement(By.id("gridCheck"));
		checkbox.click();
		
//How to click multiple checkboxes at a time?
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement boxes : checkboxes)
		{
			boxes.click();
		}
		
	}
	
	public void radioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio = driver.findElement(By.id("inlineRadio1"));
		radio.click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox checkbox = new CheckBox();
		checkbox.browserInitialisation();
		checkbox.singleCheckBox();
		
		//checkbox.radioButton();
		//checkbox.quitAndClose();

	}

}
