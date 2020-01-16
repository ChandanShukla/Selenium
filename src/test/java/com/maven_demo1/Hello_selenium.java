package com.maven_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Hello_selenium {

	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void rediff_login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Driver99999\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //chromedriver class
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/"); // driver.get() and driver.navigateto-->if you want to use backward and forward but not usable in get() method
		Thread.sleep(3000); //to give a pause for 3 secs
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input")).sendKeys("Chandan"); // sendkeys to send the value to the text box
		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]")).sendKeys("chandanrocks24");
		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//tbody/tr[9]/td[3]/input")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//tbody/tr[11]/td[3]/input")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]/input")).sendKeys("selenium@gmail.com");
		driver.findElement(By.id("mobno")).sendKeys("4561515611");
		driver.findElement(By.xpath("//tbody/tr[24]/td[3]/input[1]")).click();
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select drop = new Select(driver.findElement(By.xpath("//*[@id=\"country\"]"))); 
		//driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
		drop.selectByVisibleText("Australia");
		
	}
	

}
