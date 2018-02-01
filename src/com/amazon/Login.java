package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public void loginTest() {
		System.setProperty("webdriver.gecko.driver", "/Users/pal/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");

	}

}
