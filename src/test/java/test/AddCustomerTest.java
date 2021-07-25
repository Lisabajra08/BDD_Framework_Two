package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BroswerFactory;


public class AddCustomerTest {
	WebDriver driver;
	
	@Test
	@Parameters({"username", "password", "fullName", "companyName", "emailAddress", "phoneNumber", "address", "cityAddress", "country", "state", "zipCode"})
	public void validUserShoulbBeToAddCustomer(String userName, String passWord, String fullName, String companyName, String emailAddress, String phoneNumber, String address, String cityAddress, String country, String state, String zipCode) {
		driver = BroswerFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUsername(userName);
		loginPage.enterPassword(passWord);
		loginPage.clickOnSigninButton();

		DashBoardPage dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashBoardPage.validateDashBoardPage();
		dashBoardPage.clickCustomerButton();
		dashBoardPage.clickAddCustomerButton();

		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.enterFullName(fullName);
		addCustomerPage.chooseCompanyOption(companyName);
		addCustomerPage.enterEmail(emailAddress);
		addCustomerPage.enterPhoneNumber(phoneNumber);
		addCustomerPage.enterAddress(address);
		addCustomerPage.enterAddress(cityAddress);
		addCustomerPage.enterCity(country);
		addCustomerPage.enterState(state);
		addCustomerPage.enterZipCode(zipCode);
		addCustomerPage.clickOnSubmit();	

		BroswerFactory.tearDown();
	}
}
