package com.Mahendra.AutomateWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
    	d.manage().window().maximize();
    	d.get("https://demoqa.com/register");
    	d.findElement(By.id("firstname")).sendKeys("Mahendras");
    	d.findElement(By.id("lastname")).sendKeys("Battas");
    	d.findElement(By.id("userName")).sendKeys("BattaMahendras");
    	d.findElement(By.id("password")).sendKeys("BattaMahendra@1");
    	d.findElement(By.id("register")).click();

	}

}
