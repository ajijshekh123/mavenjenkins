package testNGFramework.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericPackage.BaseClass;

public class LoginToHome extends BaseClass {
		
	public LoginToHome() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@id='user-name']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@id='login-button']")
	private WebElement clickonLogin;
	
	
	public String getCurrentPageTitle() {
		return getPageTitle();
	}
	
	public String getPageURL() {
		return getCurrentPageURL();
	}
	
	public void enterUserName(String inputText) {
		entertextInputfield(userName, inputText);
	}
	
	public void enterPassword(String inputPassword) {
		entertextInputfield(password, inputPassword);
	}
	
	public void clickonLogin() {
		click(clickonLogin);
	}
}
