package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.AddNewAcctPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddNewAccountStepDef {
	
	WebDriver driver;
	LoginPage loginPage;
	AddNewAcctPage acctPage;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage=PageFactory.initElements(driver, LoginPage.class);
		acctPage=PageFactory.initElements(driver, AddNewAcctPage.class);
	}
	
	@Given ("^The user is on the \"([^\"]*)\" login page$")
	public void the_user_is_on_the_login_page(String page) {	
		if(page.equalsIgnoreCase("techfios")) {
			 driver.get("http://www.techfios.com/billing/?ng=admin/");
		}
		else if(page.equalsIgnoreCase("GoogleSearch")) {
			 driver.get("https://www.google.com");
		}
	}
	
	@When("^The user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and_as(String username, String password) throws Throwable {
		loginPage.enterCredentials(username, password);
	}

	@When("^The user clicks on sign in button$")
	public void the_user_clicks_on_sign_in_button() throws Throwable {
		loginPage.clickSignInButton();
	}
	
	@When("^The user land on Dashboard page$")
	public void the_user_should_land_on_Dashboard_page() throws Throwable {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(2000);
	}
		
	@When("^The user clicks Bank and Cash$")
	public void the_user_clicks_Bank_and_Cash() throws Throwable {
		acctPage.clickBankandCash();

	}

	@When("^The user clicks New Account$")
	public void the_user_clicks_New_Account() throws Throwable {
		acctPage.clickNewAccount();
	}
	
	@When("^The user land on Account page$")
	public void the_user_land_on_Account_page() throws Throwable {
		String expectedTitle = "Accounts- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(2000);
	}

	@When("^The user will enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and_and_and_and_and_and(String Account_Title, String Description, String Initial_Balance, String Account_Number, String Contact_Person, String Phone, String Internet_Banking_URL) throws Throwable {
		acctPage.enterInformation(Account_Title + acctPage.random(), Description, Initial_Balance, Account_Number, Contact_Person, Phone, Internet_Banking_URL);
	}

	@When("^The user clicks submit$")
	public void the_user_clicks_submit() throws Throwable {
		acctPage.clickSubmitButton();
	}
	
	@Then("^The user should have made a new acct$")
	public void the_acct_was_made() throws InterruptedException, IOException {
		String expected = "//i[@class='fa-fw fa fa-check']";
		String actual = "//i[@class='fa-fw fa fa-check']";
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		loginPage.takeScreenshotAtEndOfTest(driver);
	}
	
	@After
	public void tearDown() {
		driver.close(); driver.quit();
	}
	
	

}
