package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table extends Base{
	
	public void readFullData()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement fullData = driver.findElement(By.xpath("//table[@id= 'dtBasicExample']"));
		
		//to see wheather data fetch from table --> getText() method to be used
		System.out.println(fullData.getText());
		
	}

	public void readRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement OneRow = driver.findElement(By.xpath("//table[@id= 'dtBasicExample']/tbody/tr[3]"));
		
		//to see row --> getText() method to be used
		System.out.println(OneRow.getText());
		
	}
	
	public void readData()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement PaticularData = driver.findElement(By.xpath("//table[@id= 'dtBasicExample']/tbody/tr[3]/td[1]"));
		
		//to see particular data from a row --> getText() method to be used
		System.out.println(PaticularData.getText());
		
	}
	
	public void readCoulmn()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> PaticularColumn = driver.findElements(By.xpath("//table[@id= 'dtBasicExample']/tbody/tr/td[3]"));
		
		//to see particular column list
		for (WebElement webelement : PaticularColumn)
		{
			System.out.println(webelement.getText());
		}
				
	}
	
	public void searchParticularElement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input = "Tokyo";
		
		List<WebElement> colSearch = driver.findElements(By.xpath("//table[@id= 'dtBasicExample']/tbody/tr/td[3]"));
		
		for (WebElement webelement :colSearch )
		{
			if (webelement.getText().equals(input))
			{
				System.out.println(webelement.getText());
			}
		}
						
	}
	
		public static void main(String[] args) {
		Table table = new Table();
		table.browserInitialisation();
		
		table.readFullData();
		
		System.out.println("*****");
		table.readRow();
		
		System.out.println("*****");
		table.readData();
		
		System.out.println("*****");
		table.readCoulmn();
		
		System.out.println("*****");
		table.searchParticularElement();
		

	}

}
