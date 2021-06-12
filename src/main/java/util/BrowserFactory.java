package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver; 
	 
	public static WebDriver startBrowser () {  
	  System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  driver.get("http://www.techfios.com/billing/?ng=admin/");
	  
	  return driver;  
	 } 
	
	public static void tearDown() {
		
		driver.close();
		driver.quit();
		
	}
	
 }