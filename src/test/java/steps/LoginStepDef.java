package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDef {
	WebDriver driver;
	LoginPage loginPage;

//	@Before
//	public void beforeRun() {
//		driver = BrowserFactory.startBrowser();
//		loginPage=PageFactory.initElements(driver, LoginPage.class);
//	}
//	
	@Given("^A user is on the Techfios login page$")
	public void a_user_is_on_the_techfios_login_page() {
		driver.get("http://www.techfios.com/billing/?ng=admin/");
	}

	@Given("^A user is on the \"([^\"]*)\" login page$")
	public void a_user_is_on_the_login_page(String page) {
		if (page.equalsIgnoreCase("techfios")) {
			driver.get("http://www.techfios.com/billing/?ng=admin/");
		} else if (page.equalsIgnoreCase("GoogleSearch")) {
			driver.get("https://www.google.com");
		}
	}

	@When("^A user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void a_user_enters_and_as(String username, String password) throws Throwable {
		loginPage.enterCredentials(username, password);
	}

	@When("^A user clicks on sign on button$")
	public void a_user_clicks_on_sign_on_button() throws Throwable {
		loginPage.clickSignInButton();
	}

	@When("^A user lands on the Dashboard page$")
	public void a_user_should_land_on_Dashboard_page() throws Throwable {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(2000);
	}

//	@After
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//	}
}
