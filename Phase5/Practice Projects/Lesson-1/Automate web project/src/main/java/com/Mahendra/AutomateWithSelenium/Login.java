package com.Mahendra.AutomateWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
    public static void main( String[] args )
    {
      
    	WebDriver d = new ChromeDriver();
    	d.manage().window().maximize();
    	d.get("https://demoqa.com/login");
    	d.findElement(By.id("userName")).sendKeys("BattaMahendra");
    	d.findElement(By.id("password")).sendKeys("BattaMahendra@1");
    	d.findElement(By.xpath("//*[@id=\"login\"]")).click();
 	
	
    }
}
