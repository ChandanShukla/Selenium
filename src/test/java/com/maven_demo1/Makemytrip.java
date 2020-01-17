package com.maven_demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Makemytrip {
WebDriver driver;	
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"ow-domrt-jrny\"]/div[2]/div[1]/label/div[1]/span[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"rt-domrt-jrny\"]/div[2]/div[1]/label/div[1]/span[1]/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"bookbutton-RKEY:a389ec3b-390f-43de-96dd-dc4f700ef07c:0~~~RKEY:a389ec3b-390f-43de-96dd-dc4f700ef07c:94\"]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Driver99999\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.makemytrip.com/");
	 
  }

  @AfterTest
  public void afterTest() {
  }

}
