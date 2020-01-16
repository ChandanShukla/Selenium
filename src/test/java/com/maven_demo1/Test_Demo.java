package com.maven_demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Test_Demo {

	@BeforeMethod
	public void beforeME() {
		System.out.println("Before ME");
	}
	
	
  @Test (priority=0)
  public void gmail() {
	  System.out.println("open gmail");
	  
  }
  @Test (priority=-1)
  public void faceboo() {
	  System.out.println("open facebook");
	  
  }
  
  @Test (priority=1,enabled=false)
  public void google() {
	  System.out.println("open google");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("open browser");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("close browser");
  }

}
