package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {

WebDriver driver;
	
    @BeforeMethod
    public void setUp() {
    	driver = new ChromeDriver();
    	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	login();
    	
    }
//    
//    @Test(priority=1)
//    public void clickOnBookStore() {
//    	WebElement BookStore = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]/span/svg"));
//    	BookStore.click();
//    }
    
    @Test(priority=1)
    public void clickOnLogOutt() {
    	WebElement LogOut = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    	LogOut.click();
    }
    
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }
    
    
    public void login() {
    	driver.get("https://demoqa.com/login");
    	driver.findElement(By.id("userName")).sendKeys("BattaMahendra");
    	driver.findElement(By.id("password")).sendKeys("BattaMahendra@1");
    	driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
 	
    }
}
