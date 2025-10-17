package basics;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public WebDriver driver;
	
	public void upload()
	{
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement fileUpload = driver.findElement(By.id("file-upload"));
		fileUpload.sendKeys("C:\\Users\\User\\OneDrive\\Pictures\\Appu.jpeg");
		
		WebElement uploadbutton = driver.findElement(By.id("file-submit"));
		uploadbutton.click();
	}
	
	
	public void robot() throws AWTException
	{
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		
		WebElement selectPDF = driver.findElement(By.xpath("//span[text()= 'Select PDF file']"));
		selectPDF.click();
		
		StringSelection selection = new StringSelection("C:\\ash\\Jenkins Integration.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		
		Robot robot = new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
	
	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		FileUpload fileUpload = new FileUpload();
		//fileUpload.upload();
		fileUpload.robot();

	}

}
