package net.kzn.functional;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.kzn.utility.Drivers;

public class TestHomePage {
	private WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = Drivers.getDrivers("chrome");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void testTitle() {
		driver.get("http://localhost:8080/spring-project/");
		String title = driver.getTitle();
		System.out.println("Title of the website is: " + title);
		Assert.assertTrue(title.contains("Jenkins"), "Does not contain Jenkins in the title!");
	}

}
