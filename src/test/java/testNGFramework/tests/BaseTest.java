package testNGFramework.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import GenericPackage.BaseClass;

public class BaseTest extends BaseClass {
	
	@BeforeClass
	public void setup() {
		setupBrowser();
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterClass
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
}
