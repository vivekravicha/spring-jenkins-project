package net.kzn.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Drivers {
	public static WebDriver getDrivers(String browser) {
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("firefox2")) {
			// add your code here to load firefox2 driver
		}else if(browser.equalsIgnoreCase("firefox3")) {
			// add your code here to load firefox3 driver
		}else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			// Add options to Google Chrome. 
			//The window-size is important for responsive sites
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("window-size=1400,600");
	        options.addArguments("headless");
			driver = new ChromeDriver(options);
		}				
		return driver;
	}
}
