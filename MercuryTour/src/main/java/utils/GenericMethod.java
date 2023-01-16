package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethod {
	
	WebDriver driver;
	
	public GenericMethod(WebDriver driver) {
		this.driver = driver;
			
	}
	public By getBy(String locatorType, String value) {
		By locator = null;
		
		switch(locatorType.toLowerCase()) {
		// 8 locators
		
		case "id": locator = By.id(value);
		case "name": locator = By.name(value);
		case "classname": locator = By.className(value);
		case "cssSelector": locator = By.cssSelector(value);
		case "xpath": locator = By.xpath(value);
		case "tagname": locator = By.tagName(value);
		case "linktext": locator = By.linkText(value);
		case "partiallinktext": locator = By.partialLinkText(value);
		
		}
		return locator;
												
	}
public WebElement getElement(By locator ) {
	
	return driver.findElement(locator);
	
	}
public void doclick(By locator) {
	
	driver.findElement(locator).click();
	
	}
public void getText(By locator) {
	driver.findElement(locator).getText();
	
	}
public void dosendKeys(By locator, String value) {
	
	driver.findElement(locator).clear();
	driver.findElement(locator).sendKeys(value);
}


}
