package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.FlightsFinderPage;
import pages.RegisterPage;
import utils.GenericMethod;

public class BaseTest {

	WebDriver driver;
	protected GenericMethod gm;
	protected FlightsFinderPage flightsFinder;
	protected RegisterPage registerPage;
	
	// what do you do before testing
	// we setup the Environment
	@BeforeTest
	
	public void setup () {
		driver = new ChromeDriver();
		gm = new GenericMethod(driver);
		registerPage = new RegisterPage(driver);
		flightsFinder = new FlightsFinderPage(driver);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
}
