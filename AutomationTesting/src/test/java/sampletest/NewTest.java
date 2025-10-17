package sampletest;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 1)
  public void test1() 
  {
	  System.out.println("Hello");
  }
  
  @Test(priority = 2)
  public void print()
  {
	  System.out.println("Print");
  }
}
