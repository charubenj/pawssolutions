package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class base {
	
	public WebDriver driver;
	
public WebDriver initializeDriver() throws IOException
{
	Properties prop= new Properties();
	FileInputStream fis= new FileInputStream("//Users//charubanjwal//Desktop//pawsSolutions//src//main//java//resources//data.properties");
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","//Users//charubanjwal//Desktop//chromedriver");
 		driver = new ChromeDriver();
		
	}
	
	else if(browserName.equals("firfox")) {
		System.setProperty("webdriver.gecko.driver", "//Users//charubanjwal//Desktop//geckodriver");
 		driver = new FirefoxDriver();
		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;

}

public void getScreenshot(String result) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileHandler.copy(src,new File("//Users//charubanjwal//Desktop//test//"+result+"screenshot.png"));

}
}