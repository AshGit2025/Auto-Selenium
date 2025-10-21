package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends Base {
  @Test
  public void verifyValidCredentials() 
  {
	  LoginPage login = new LoginPage(driver);
	  login.enterUsernameAndPassword("carol", "1q2w3e4r");
	  login.clickOnLoginButton();
  }
}
