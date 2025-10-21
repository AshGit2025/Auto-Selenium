package demoproject;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends Base {
  @Test
  public void verifyLogout() 
  {
	  LoginPage loginpage = new LoginPage(driver);
	  loginpage.enterUsernameAndPassword("carol", "1q2w3e4r");
	  loginpage.clickOnLoginButton();
	  
	  HomePage homepage = new HomePage(driver);
	  homepage.clickOnUser();
	  homepage.clickOnLogout();
	  
	  
  }
}
