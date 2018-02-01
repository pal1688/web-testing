package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	public void cartCount() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/pal/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
	    String value = driver.findElement(By.id("nav-cart-count")).getText();
	    
	    Util.myAssert("0",value);
	    
	    
	}
	
	
	public void login() {
		
		
			System.setProperty("webdriver.gecko.driver", "/Users/pal/Downloads/geckodriver");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.amazon.com/");
			
			WebElement element = driver.findElement(By.id("nav-link-accountList"));
			Actions actions = new Actions(driver);
			actions.moveToElement(element).perform();
			WebElement subelement = driver.findElement(By.id("nav-al-signin"));
			actions.moveToElement(subelement);
			WebElement SubEleLogin = driver.findElement(By.className("nav-action-inner"));
			actions.moveToElement(SubEleLogin);
			actions.click();
			actions.perform();
			
			
			WebElement loginEmail = driver.findElement(By.id("ap_email"));
			loginEmail.sendKeys("pal1688@gmail.com");
			
			WebElement Password = driver.findElement(By.id("ap_password"));
			Password.sendKeys("swap12qw");
			
			WebElement SignIn = driver.findElement(By.id("signInSubmit"));
			SignIn.click();
			
			
			
			
			
	}
	
	
	
}
