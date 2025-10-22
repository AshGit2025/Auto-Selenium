package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends Base {
  @Test
  @Parameters({"Username", "Password"})
  public void verifyValidCredentials(String Username, String Password) 
  {
	  LoginPage login = new LoginPage(driver);
	  login.enterUsernameAndPassword(Username, Password);
	  login.clickOnLoginButton();
  }
  
  @Test
  public void verifyInValidCredentials() 
  {
	  LoginPage login = new LoginPage(driver);
	  login.enterUsernameAndPassword("Ash", "123");
	  login.clickOnLoginButton();
  }
  
  @Test
  public void verifycredentialsWithCorrectPassword() 
  {
	  LoginPage login = new LoginPage(driver);
	  login.enterUsernameAndPassword("Ash", "1q2w3e4r");
	  login.clickOnLoginButton();
  }
  
  @Test (dataProvider = "dataProvider")
  public void verifycredentialsWithCorrectUsername(String Username, String Password) 
  {
	  LoginPage login = new LoginPage(driver);
	  login.enterUsernameAndPassword(Username, Password);
	  login.clickOnLoginButton();
  }
  
  @DataProvider(name="dataProvider")
  public Object testData()
  {
	  Object data[][] = {{"Ash","Jay"},{"123","345"}};
	  return data;
	  
  }
  
}
