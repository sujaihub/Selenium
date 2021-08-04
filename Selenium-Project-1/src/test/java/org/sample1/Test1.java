package org.sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\MyFolder\\Ecllipse\\WORKSPACE\\Selenium-Project-1\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	}

}
