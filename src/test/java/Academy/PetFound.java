package Academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.FoundaPet;
import resources.base;

public class PetFound extends base{
	
	@Test

	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		driver.get("http://pawssolution.com/");
		
		FoundaPet fp = new FoundaPet(driver);
		fp.foundapetBtn().click();
		fp.createaFlyer().click();
		
	}
}
