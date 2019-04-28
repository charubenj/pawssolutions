package Academy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.NewListing;
import resources.base;

public class ListingPage extends base {
	public static Logger Log = LogManager.getLogger(base.class.getName());
	
	@Test
	public void basePageNavigation() throws IOException, AWTException, InterruptedException{
		driver = initializeDriver();
		driver.get("http://pawssolution.com/");
		 NewListing nl= new NewListing(driver);
		 nl.petSearch().click();
		 AssertJUnit.assertEquals(nl.pageTitle().getText(), "Pet Details");
		 System.out.println("upload page is opened");
		Thread.sleep(5000l);
		 nl.uploadImage().click();
     	 //nl.uploadImage().sendKeys("//Users//charubanjwal//Desktop//puppynew.jpg");
		 File file = new File("//Users//charubanjwal//Desktop//puppynew.jpg");
		 //Thread.sleep(5000l);
		 String fileName= file.getAbsolutePath().replaceAll("//", "/");
		 Thread.sleep(5000l);
     	 StringSelection stringSelection = new StringSelection(fileName);
     	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
     	Thread.sleep(5000l);
     	
     	 Robot robot = new Robot();
     	 robot.keyPress(KeyEvent.VK_META);
     	robot.keyPress(KeyEvent.VK_TAB);
     	 
     	robot.keyRelease(KeyEvent.VK_META);
     	 
     	robot.keyRelease(KeyEvent.VK_TAB);
     	 
     	robot.delay(500);
     	 
     	//Open Goto window
     	 
     	robot.keyPress(KeyEvent.VK_META);
     	 
     	robot.keyPress(KeyEvent.VK_SHIFT);
     	 
     	robot.keyPress(KeyEvent.VK_G);
     	 
     	robot.keyRelease(KeyEvent.VK_META);
     	 
     	robot.keyRelease(KeyEvent.VK_SHIFT);
     	 
     	robot.keyRelease(KeyEvent.VK_G);
     	 
     	//Paste the clipboard value
     	 
     	robot.keyPress(KeyEvent.VK_META);
    	 
     	robot.keyPress(KeyEvent.VK_V);
     	 
     	robot.keyRelease(KeyEvent.VK_META);
     	 
     	robot.keyRelease(KeyEvent.VK_V);
     	 
     	//Press Enter key to close the Goto window and Upload window
     	 
     	robot.keyPress(KeyEvent.VK_ENTER);
     	 
     	robot.keyRelease(KeyEvent.VK_ENTER);
     	 
     	//robot.delay(500);
     	 
     	robot.keyPress(KeyEvent.VK_ENTER);
     
     	 robot.keyRelease(KeyEvent.VK_ENTER);
     	 Log.info("image uploaded");
     	 
	 nl.caseType().click();
	 nl.animalType().click();
 nl.animalSize().click();
	 nl.streetName().sendKeys("jamboree drive");
 nl.cityName().sendKeys("Irvine,CA,92624");
	 nl.email().sendKeys("ab@ab.com");
 nl.name().sendKeys("cherry");
	 nl.phone().sendKeys("9098089808");
	 nl.notes().sendKeys("My dog has been lost since monday");
	 Log.info("All fields are filled");
 nl.checkBox().click();
 nl.submitBtn().click();
 System.out.println(nl.uploadConfirmation().getText());
 AssertJUnit.assertEquals(nl.uploadConfirmation().getText(), "Your case has been uploaded.");
		 
		 }
	
@AfterTest
	public void browserClose(){
	driver.close();
	driver=null;
	System.out.println("browser closed successfully");
}

}
