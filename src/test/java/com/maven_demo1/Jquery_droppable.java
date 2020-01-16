package com.maven_demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Jquery_droppable {
WebDriver driver;
  @Test
  public void droppable() {
	  driver.switchTo().frame(0);
	  WebElement drag=driver.findElement(By.id("draggable"));
	  WebElement drop=driver.findElement(By.id("droppable"));
	  Actions act=new Actions(driver);
	  act.dragAndDrop(drag, drop).build().perform();
  }
  @BeforeTest
  public void launch() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Driver99999\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
