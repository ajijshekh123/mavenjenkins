package testNGFramework.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class VerifyUserLogins extends BaseTest {
	
	@Test
	public void verifySuccessfulUserLogin() {
		LoginToHome loginpage = new LoginToHome();
		String pageTitle = loginpage.getCurrentPageTitle();
		assertEquals(pageTitle, "Swag Labs");
	}
	
}
