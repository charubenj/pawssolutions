package Academy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.PetSearch;
import resources.base;

public class HomePage extends base{
	public static Logger Log = LogManager.getLogger(base.class.getName());
	
	@Test(dataProvider="getdata")
	
	public void basePageNavigation( String city,String zipCode, String type  ) throws IOException {
		driver = initializeDriver();
		driver.get("http://pawssolution.com/");
		
		LandingPage logoclick= new LandingPage(driver);
	System.out.println("successfully clicked on logo");
		logoclick.clickLogo().click();
		PetSearch ps= new PetSearch(driver);
		ps.petsearch().click();
		ps.filterSelection().click();
		ps.citySearch().sendKeys(city);
		ps.zipCodeSearch().sendKeys(zipCode);
		 //ps.animalType().findElement(By.xp)
		//ps.animalSize()
		ps.searchBtn().click();
		//ps.petdetails().click();
		System.out.println(ps.searchpopup().getText());
		AssertJUnit.assertEquals(ps.searchpopup().getText(), "Found in los angeles, CA");
		 Log.info("image uploaded");
		
//		for flyer page
//		Assert.assertEquals(ps.petCity().getText(), "location_on los angeles CA 90020");
//		System.out.println(ps.petCity().getText());
		
}
	

	
	@DataProvider
	public Object[][] getdata() {
		
		
		Object[][] data= new Object[1][3];
		data[0][0] = "los angeles";
		data[0][1] = "90020";
		data[0][2]= "Dog";
		
//	data[1][0] = "Lake Forest";
//	data[1][1] = "92606";
//	data[0][2]= "cat";
		
		return data;
	}
	
	@AfterTest
	public void browserClose() {
		driver.close();
		driver=null;
	}
	
	

}
