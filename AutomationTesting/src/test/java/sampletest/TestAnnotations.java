package sampletest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestAnnotations {
  @Test
  public void method1() {
	  System.out.println("Print");
  }
  @Test
  public void method()
  {
	  System.out.println("Method2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

}
