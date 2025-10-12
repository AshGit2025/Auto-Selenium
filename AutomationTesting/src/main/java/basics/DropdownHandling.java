package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling extends Base {
	
	public void dropdown ()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectColour = driver.findElement(By.xpath("//select[@id= 'single-input-field']"));
		
		Select select = new Select(selectColour); // Select class used to select data
		//select.selectByIndex(1); // selecting by Index
		//select.selectByVisibleText("Yellow"); // selecting by text
		select.selectByValue("Green"); // selecting by text value
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropdownHandling dropdown = new DropdownHandling();
		dropdown.browserInitialisation();
		dropdown.dropdown();
		

	}

}
