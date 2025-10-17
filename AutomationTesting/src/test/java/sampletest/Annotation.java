package sampletest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotation {
  @Test
  public void method() {
	  System.out.println("All page actions!");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Login");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Quit browser");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("launch chrome");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Exit browser");
  }

}
