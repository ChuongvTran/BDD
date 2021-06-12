package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='username']") 
	WebElement UserName_Field; 
	@FindBy(how = How.XPATH, using = "//input[@id='password']") 
	WebElement Password_Field;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']") 
	WebElement SignIn_Field;
	
	public void enterCredentials(String userName , String password) {
		UserName_Field.sendKeys(userName);
		Password_Field.sendKeys(password);
	}
	
	public void clickSignInButton() {
		SignIn_Field.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		String currentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot/" + label + ".png"));
		
	}

}
