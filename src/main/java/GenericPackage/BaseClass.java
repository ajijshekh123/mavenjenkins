package GenericPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {

	public WebDriver driver;
	public String URL = "https://www.saucedemo.com/";
	
	@BeforeClass
	public void setupBrowser() {
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	
	@Test
	public void navigateURL() {
		driver.get(URL);
	}
	
	@Test
	public void verifyTitle() {
		Assert.assertTrue(driver.getTitle().contains("Swag Labs"), "Title does not match");
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentPageURL() {
		return driver.getCurrentUrl();
	}
	
	public void entertextInputfield(WebElement element, String inputText) {
		element.sendKeys(inputText);
	}
	
	public void click (WebElement element) {
		element.click();
	}
	

	
}
