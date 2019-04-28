package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class PetSearch extends base{
	
	public WebDriver driver;
	
	//By petSearch = By.xpath("/html/body/div[1]/div/div[1]/nav/div/ul/li[2]/a");
	By petSearch = By.xpath("//*[text()='PET SEARCH'][1]");
	By filterSelection= By.xpath("//*[text()='Found Pets']");
	By city= By.xpath("//input[@id='city']");
	By zipCode= By.xpath("//input[@id='zipCode']");
	By animalType= By.xpath("//select[@name='animalType']");
	By animalSize= By.xpath("//select[@id='size']");
	//By search= By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/form/button");
	By search = By.xpath("//*[text()='SEARCH']");
	By searchpopup = By.xpath("//div[@id='content']//p[1][1]");
	By petdetails = By.xpath("//div[@class='details']");
	By petcity = By.xpath("//div[@class='details']//tr[2]");
	
	public PetSearch(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement petsearch() {
		
	return this.driver.findElement(petSearch);
	}
	
	public WebElement filterSelection() {
		return this.driver.findElement(filterSelection);
	}
	
       public WebElement citySearch() {
		
		return this.driver.findElement(city);
	}
	
       public WebElement zipCodeSearch() {
   		
   		return this.driver.findElement(zipCode);
   	}
       
       public WebElement animalType() {
      		
      		return this.driver.findElement(animalType);
      	}
	
       public WebElement animalSize() {
     		
     		return this.driver.findElement(animalType);
     	}
	
       public WebElement searchBtn() {
    		
    		return this.driver.findElement(search);
    	}
       
       public WebElement searchpopup() {
    	   return this.driver.findElement(searchpopup);
       }
       
       public WebElement petdetails() {
    	   
    	   return this.driver.findElement(petdetails);
       }
       
       public WebElement petCity() {
    	   return this.driver.findElement(petcity);
       }
       
       
       
       
	

}
