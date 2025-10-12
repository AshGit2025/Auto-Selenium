package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base {
	
	public void dragAndDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(drag).click();
				
		actions.doubleClick(drag).perform(); // if we have to double-click the element and drag doubleClick() method to be used
	   WebElement target = driver.findElement(By.id("mydropzone"));
	   actions.dragAndDrop(drag, target).build().perform(); //buid & perform method used to do sequence of actions
	
	}
	


	public static void main(String[] args) {
		
		DragAndDrop dragdrop = new DragAndDrop();
		dragdrop.browserInitialisation();
		dragdrop.dragAndDrop();

	}

}
