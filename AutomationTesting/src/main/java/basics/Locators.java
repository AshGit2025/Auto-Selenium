package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void IdLocators()
	{
		WebElement messageField = driver.findElement(By.id("single-input-field"));
	}
	
	public void ClassLocators()
	{
		WebElement messageField = driver.findElement(By.className("form-control"));
	}
	
	public void NameLocators()
	{
		WebElement messageField = driver.findElement(By.name("viewport"));
	}
	
	public void LinkTextLocators()
	{
		WebElement messageField = driver.findElement(By.linkText("Checkbox Demo"));
	}
	public void PartialLinkTextLocators()
	{
		WebElement messageField = driver.findElement(By.partialLinkText("Checkbox"));
	}
	
	public void cssSelectorLocators()
	{
		WebElement messageField = driver.findElement(By.cssSelector("input#single-input-field"));
	}
	
	public void CssLocators() // tag and class -->	tag.class
	{
		WebElement messageField = driver.findElement(By.cssSelector("input.	form-control"));
	}
	
	public void cssLocators1() // tag and attribute ---> tag[attributetype=attributevalue]
	{
		WebElement messageField = driver.findElement(By.cssSelector("input[type=text]"));
	}
	
	public void cssLocators2() // tag ,class and attribute --> tag.class[attributetype=attributevalue]
	{
		WebElement messageField = driver.findElement(By.cssSelector("input.form-control[type=text]"));
	}
	
	public void XpathLocators() //By Xpath --> Absolute
	{
		WebElement messageField = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	}
	
	public void XpathLocators2() //By Xpath --> Relative. Syntax: //tagname[@attributetype='value']
	{
		WebElement messageField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	}
	
	public void DynamicXpathLocaor() //By Xpath --> Dynamic1-- using contains method. Syntax: //tagname[contains(@attributetype,'partial attribute value')]
	{
		WebElement messageField = driver.findElement(By.xpath("//input[contains(@id,'single-input')]"));
	}
	
	public void TextXpathLocaor() //By Xpath --> Dynamic2 -- using text. Syntax: //button[text()='textmessage']
	{
		WebElement messageField = driver.findElement(By.xpath("//button[text()='Show Message']"));
	}
	
	public void StartWithXpathLocaor() //By Xpath --> Dynamic3 -- using Starts with method. Syntax: //tagname[starts-with(@attribute,'starting of attributevalue')]
	{
		WebElement messageField = driver.findElement(By.xpath("//input[starts-with(@id,'single')]"));
	}
	
	public void AndOrXpathLocaor() //By Xpath --> Dynamic4 -- using And Or method. Syntax: //tagname[@attribute1='attribute value1' and @attribute2='attribute value2' ]
	{
		WebElement messageField = driver.findElement(By.xpath("//input[@id='single-input-field' and @placeholder ='Message']"));
	}
	
	public void OrXpathLocaor() //By Xpath --> Dynamic4 -- using Or method. Syntax: //tagname[@attribute1='attribute value1' or @attribute2='attribute value2' ]
	{
		WebElement messageField = driver.findElement(By.xpath("//input[@id='single-input-field' or @placeholder ='Message']"));
	}
	
	
	
	//Axes Method
	public void ChildXpathLocaor() //By Axes Method --> using child. Syntax: //tagname[@attributetype='attribute value1'] //child::tagname [@attribute='attribute value']
	{
		WebElement messageField = driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@alt='logo']"));
	}
	
	public void ParentXpathLocaor() //By Axes Method --> using Parent. Syntax: //tagname[@attributetype='attribute value1'] //parent::tagname]
	{
		WebElement messageField = driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	}
	
	
	
	//Index Locator
	public void IndexXpathLocaor() //By Index  -->  Syntax: (//tagname[@attributetype='attribute value1'])[inxexvalue] 
	{
		WebElement messageField = driver.findElement(By.xpath("(//input[@type= 'text'])[2]"));
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
