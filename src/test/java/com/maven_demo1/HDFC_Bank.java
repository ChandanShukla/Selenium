package com.maven_demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class HDFC_Bank {
	WebDriver driver;
  @Test
  public void f() {
	  //int frames=driver.findElement(By.tagName("frame")).size();
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input")).sendKeys("74586321");
	  driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame(1);
	  driver.findElement(By.xpath("/html/body/form/p/a[2]")).click();
	  Set<String> windIds = driver.getWindowHandles();
	  Iterator<String> it = windIds.iterator();
	  String parentWindow = it.next();
	  String childWindows = it.next();
	  System.out.println(parentWindow);
	  System.out.println(childWindows);
	  driver.switchTo().window(childWindows);
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.xpath("//*[@id=\"main\"]/div/header/div/div/div/div/div[2]/div/div[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[1]/a")).click();
	  driver.findElement(By.id("popupBoxClose")).click();
	  driver.switchTo().window(parentWindow);
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[4]/td[2]/span")).sendKeys("45454512");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Driver99999\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://netbanking.hdfcbank.com/netbanking/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
