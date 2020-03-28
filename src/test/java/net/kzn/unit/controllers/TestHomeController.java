package net.kzn.unit.controllers;

import org.springframework.web.servlet.ModelAndView;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.kzn.controllers.HomeController;

public class TestHomeController {

	private static HomeController hc = null;

	@BeforeClass
	public void setUp() {
		hc = new HomeController();
	}

	@Test
	public void testHome() {
		hc = new HomeController();
		ModelAndView mv = hc.home();
		Assert.assertEquals("index", mv.getViewName(), "View name does not match!");
	}

	@Test
	public void testHomeTitle() {
		hc = new HomeController();
		ModelAndView mv = hc.home();
		Assert.assertEquals("Just Enough Jenkins Training!", mv.getModelMap().get("title"), "Title Missing!");
	}

	@Test
	public void testHomeGreeting() {
		hc = new HomeController();
		ModelAndView mv = hc.home();
		Assert.assertEquals("Welcome to Just Enough Jenkins Training!", mv.getModelMap().get("greeting"), "Greeting Missing!");
	}

	@AfterClass
	public void tearDown() {
		hc = null;
	}
}
