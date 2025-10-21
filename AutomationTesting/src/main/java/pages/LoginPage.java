package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='loginform-username']") WebElement username;
	@FindBy(xpath="//input[@id='loginform-password']") WebElement password;
	
	@FindBy(xpath="//button[text()='Login']") WebElement loginButton;
	
	public void enterUsernameAndPassword(String usernameField, String passwordField)
	{
		username.sendKeys(usernameField);
		password.sendKeys(passwordField);
	}

	public void clickOnLoginButton()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //Explicit wait WebDriverWait class object creation
		wait.until(ExpectedConditions.elementToBeClickable(loginButton)); //Explicit wait
		
		loginButton.click();
	}
}
