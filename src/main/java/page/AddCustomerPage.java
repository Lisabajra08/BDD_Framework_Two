package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage{
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using= "//input[@id='phone']")
	WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using= "//input[@id='address']")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using= "//input[@id='city']")
	WebElement CITY_ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\'select2-country-container\']")
	WebElement COUNTRY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using= "//input[@id='state']")
	WebElement STATE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using= "//input[@id='zip']")
	WebElement ZIPCODE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using ="//button[@id='submit']")
	WebElement SUBMIT_LOCATOR;

//Interactive Methods
	public void enterFullName(String fullName) {
		waitForElement(driver, 5, USERNAME_FIELD_LOCATOR);
		int generateNumber= randomGenerator(999);
		USERNAME_FIELD_LOCATOR.sendKeys(fullName + generateNumber);
	}

	public void chooseCompanyOption(String companyName) {
		selectDropDown(COMPANY_FIELD_LOCATOR, companyName);

	}
	public void enterEmail(String emailAddress) {
		int generateNumber = randomGenerator(999);
		EMAIL_FIELD_LOCATOR.sendKeys(generateNumber + emailAddress);
	}
	public void enterPhoneNumber(String phoneNumber) {
		int generateNumber = randomGenerator(999);
		PHONE_FIELD_LOCATOR.sendKeys(generateNumber + phoneNumber);
	}

	public void enterAddress(String address) {
		ADDRESS_FIELD_LOCATOR.sendKeys(address);
	}
	
	public void enterCity(String cityAddress) {
		CITY_ADDRESS_FIELD_LOCATOR.sendKeys(cityAddress);
	}
	public void chooseCountryOption(String country) {
		selectDropDown(COUNTRY_FIELD_LOCATOR, country);
	}
	public void enterState(String state) {
		STATE_FIELD_LOCATOR.sendKeys(state);	
	}
	public void enterZipCode(String zipCode) {
		ZIPCODE_FIELD_LOCATOR.sendKeys(zipCode);
	}
	public void clickOnSubmit() {
		SUBMIT_LOCATOR.click();

	}
}
