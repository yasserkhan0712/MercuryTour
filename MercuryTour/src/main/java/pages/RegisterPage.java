package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.GenericMethod;

public class RegisterPage {

	WebDriver driver;
	GenericMethod gm;
	// 1.  Object Repository
	
	private By registerTab = By.xpath("//a[normalize-space()='REGISTER']");
	
	
	
	// 2. Constructor 
	public RegisterPage(WebDriver driver) {
		this.driver= driver;
	gm = new GenericMethod(this.driver);
	}	
	
	
	
	
	//3. Actions 
	public void setverifyRegisterTab () {
		
		
		
		
	}
	
	
	
	
	
}



