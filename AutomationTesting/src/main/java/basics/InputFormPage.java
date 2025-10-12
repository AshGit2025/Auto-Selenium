package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputFormPage extends Base {
	
	public void enterMessageField()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagefield = driver.findElement(By.id("single-input-field"));
		messagefield.sendKeys("Hello");
		WebElement showbutton = driver.findElement(By.id("button-one"));
		showbutton.click();
	}

	public void enterValueAandB() //ASSIGNMENT 1
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement entervalueA = driver.findElement(By.id("value-a"));
		entervalueA.sendKeys("10");
		
		WebElement entervalueB = driver.findElement(By.id("value-b"));
		entervalueB.sendKeys("20");
		
		WebElement getTotalButton = driver.findElement(By.id("button-two"));
		getTotalButton.click();
		
	}
	
	public void printHello () //ASSIGNMENT 2
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement messagefield = driver.findElement(By.id("single-input-field"));
		messagefield.sendKeys("Hello");
		
		WebElement entervalueA = driver.findElement(By.id("value-a"));
		entervalueA.sendKeys("Hello");
		
		WebElement entervalueB = driver.findElement(By.id("value-b"));
		entervalueB.sendKeys("Hello");
		
		
	}
	
	public static void main(String[] args) {
	
		InputFormPage inputform = new InputFormPage();
		inputform.browserInitialisation();
	//	inputform.enterMessageField();
	//	inputform.enterValueAandB(); // ASSIGNMENT 1
		
		inputform.printHello(); // ASSIGNMENT 2
		

	}

}
