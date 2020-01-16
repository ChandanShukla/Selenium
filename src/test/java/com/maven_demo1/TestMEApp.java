package com.maven_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMEApp {
WebDriver driver;
  @BeforeClass
  public void launch() {
	  System.setProperty("webdriver.chrome.driver","C:\\Driver99999\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.manage().window().maximize();
	  
  }
  
  @Test
  public void login() {
	 
	 driver.findElement(By.xpath("//div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("ChandanShukla1");
	 driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Chandan");
	 driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Shukla");
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1245886532");
	 driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys("1245886532");
	 driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("fkjdfbjd@gmail.com");
	 driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("4512369857");
	 driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
	 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a")).click();
	 driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("inderlok-market");
	 driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")).click();
	 Select drop = new Select(driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")));
	 drop.selectByVisibleText("What is your Pet Name?");
	 driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys("Dog");
	 driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	
  }
  
  @AfterTest
  public void close() {
	  driver.quit();
  }
  
}
