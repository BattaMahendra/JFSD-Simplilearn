package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG 
{
	WebDriver driver;
	
    @BeforeMethod
    public void setUp() {
    	driver = new ChromeDriver();
    	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.get("https://demoqa.com/login");    	
    }
    
    @Test(priority=1)
    public void verifyPageTitleTest() {
    	String title = driver.getTitle();
    	System.out.println("the page title is:"+ title);
    	Assert.assertEquals(title, "ToolsQA");
    }
    
    @Test(priority=2)
    public void verifyFreeCRMLogoTest() {
    	boolean flag = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img")).isDisplayed();
    	Assert.assertTrue(flag);
    }
    
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }
    
}
