package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoundaPet{
	
	public FoundaPet(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver driver;
	
	By foundapetBtn = By.xpath("//*[text()='Found a Pet ?']");
	By createaFlyer= By.xpath("//*[text()='Create a Flyer']");
	
	
	public WebElement foundapetBtn() {
		return this.driver.findElement(foundapetBtn);
	}
	
	public WebElement createaFlyer() {
		return this.driver.findElement(createaFlyer);
	}

}
