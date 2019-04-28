package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class NewListing extends base {
	
	public WebDriver driver;
	
	By petSearch= By.xpath("//*[text()='CREATE NEW LISTING'][1]");
	By pageTitle= By.xpath("//*[text()='Pet Details']");
	By uploadImage = By.xpath("//div[@class='upload-container']");
	//By caseType= By.xpath("//input[@value='lost']");
	By caseType = By.xpath("//*[@id='uploadform']/div[2]/div/label[1]/span");
	By animalType= By.xpath("//*[text()='Dog']");
	By animalSize= By.xpath("//*[text()='Large']");
	By streetName = By.xpath("//input[@name='street']");
	By cityName = By.xpath("//input[@name='city']");
	By email = By.xpath("//input[@name='email']");
	By name = By.xpath("//input[@name='name']");
	By phone = By.xpath("//input[@name='phone']");
	By notes = By.xpath("//textarea[@name='description']");
	By checkBox = By.xpath("//div[@class='formCheckBox']");
	By submitBtn = By.xpath("//button[@type='submit']");
	By uploadConfirmation = By.xpath("/html/body/div[1]/div/div[2]/div[1]/h5");
	
	
	public NewListing(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement petSearch() {
		return this.driver.findElement(petSearch);
	}

	public WebElement pageTitle() {
		return this.driver.findElement(pageTitle);
	}
	
	public WebElement uploadImage() {
		return this.driver.findElement(uploadImage);
	}
	public WebElement caseType() {
		return this.driver.findElement(caseType);
	}
	public WebElement animalType() {
		return this.driver.findElement(animalType);
	}
	public WebElement animalSize() {
		return this.driver.findElement(animalSize);
	}
	public WebElement streetName() {
		return this.driver.findElement(streetName);
	}
	public WebElement cityName() {
		return this.driver.findElement(cityName);
	}
	public WebElement email() {
		return this.driver.findElement(email);
	}
	public WebElement name() {
		return this.driver.findElement(name);
	}
	public WebElement phone() {
		return this.driver.findElement(phone);
	}
	public WebElement notes() {
		return this.driver.findElement(notes);
	}
	public WebElement checkBox() {
		return this.driver.findElement(checkBox);
	}
	public WebElement submitBtn() {
		return this.driver.findElement(submitBtn);
		
	}
	public WebElement uploadConfirmation() {
		return this.driver.findElement(uploadConfirmation);
	}
}

