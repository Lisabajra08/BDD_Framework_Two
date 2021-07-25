package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BroswerFactory;


public class LoginTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"username", "password"})
	public void validUserShouldBeAbleToLogin(String userName, String passWord ) {
	
	driver= BroswerFactory.init();
	
	LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
	loginPage.enterUsername(userName);
	loginPage.enterPassword(passWord);
	loginPage.clickOnSigninButton();
		
	DashBoardPage dashBoardPage= PageFactory.initElements(driver, DashBoardPage.class);
	dashBoardPage.validateDashBoardPage();
	
	BroswerFactory.tearDown();
	}
}
