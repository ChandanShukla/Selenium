package com.maven_demo1;

import org.testng.annotations.Test;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class TestMeAPP_Windows {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement about = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
	  WebElement office = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
	  WebElement bang = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a/span"));
	  Actions act= new Actions(driver);
	  act.moveToElement(about).build().perform();
	  act.moveToElement(office).build().perform();
	  act.click(bang).build().perform();
	  Set<String> winIds= driver.getWindowHandles();
	  Iterator<String> it = winIds.iterator();
	  String parentWindow = it.next();
	  String childWindows = it.next();
	  driver.switchTo().window(childWindows);
	  Thread.sleep(3000);
	  driver.switchTo().frame(1);
	  WebElement Text= driver.findElement(By.xpath("//*[@id=\"demo3\"]"));
	  String Text1 = Text.getText();
	  Assert.assertEquals(Text1, "Testme Inc.\n12, EPIP Zone, Bangalore\nBangalore, India\nMobile: +91 9898954321\nFax: 84554323\nEmail: info@testmeapp.com");
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Driver99999\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
