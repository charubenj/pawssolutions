package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public LandingPage(WebDriver driver) {
this.driver=driver;
	}
	
	public WebDriver driver;
By logo= By.xpath("//*[text()='PAWS']");

public WebElement clickLogo() {
	
	return this.driver.findElement(logo);
}

}
