package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewAcctPage {

	WebDriver driver;
	
	public AddNewAcctPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]")
	WebElement Bank_and_Cash;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Account')]")
	WebElement New_Account;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement Account_Title_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement Description_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement Initial_Balance_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement Account_Number_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement Contact_Person_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement Phone_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement Internet_Banking_URL_Field;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement Submit_Button;

	public void clickBankandCash() {
		Bank_and_Cash.click();
	}
	
	public void clickNewAccount() {
		New_Account.click();
	}
	
	public void enterInformation(String AccountTitle, String Description, String InitialBalance, String AccountNumber, String ContactPerson, String Phone, String InternetBankingURL) {
		Account_Title_Field.sendKeys(AccountTitle);
		Description_Field.sendKeys(Description);
		Initial_Balance_Field.sendKeys(InitialBalance);
		Account_Number_Field.sendKeys(AccountNumber);
		Contact_Person_Field.sendKeys(ContactPerson);
		Phone_Field.sendKeys(Phone);
		Internet_Banking_URL_Field.sendKeys(InternetBankingURL);
	}

	public void clickSubmitButton() {
		Submit_Button.click();
	}

	public int random() {
		
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(999);
		return randomNumber;
		
	}

}
