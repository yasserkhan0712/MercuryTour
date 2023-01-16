package pagesTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.RegisterPage;


// every page must be a child of the base test
public class RegisterPageTest extends BaseTest  {

	
	@Test 
	public void verifyRegisterTab() {
		registerPage.setverifyRegisterTab();
		
		
	}
	
	
}
