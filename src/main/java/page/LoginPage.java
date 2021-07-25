package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage extends BasePage {
	
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Library of elements
		@FindBy(how = How.XPATH, using= "//input[@id='username']") 
		WebElement USERNAME_FIELD;
		@FindBy(how = How.XPATH, using= "//input[@id='password']") 
		WebElement PASSWORD_FIELD;
		@FindBy(how = How.XPATH, using= "//button[@name='login']") 
		WebElement LOGIN_FIELD;
		
		//Methods to interact with the elements 
		
		public void mainPageTitle() {
			Assert.assertEquals(driver.getTitle(), "Login - iBilling", "Wrong page");
		}
		public void enterUsername(String userName) {
			USERNAME_FIELD.sendKeys(userName);
		}
		
		public void enterPassword(String passWord ) {
			PASSWORD_FIELD.sendKeys(passWord);
		}
		
		public void clickOnSigninButton() {
			 LOGIN_FIELD.click();
		}
		
		
		
	}

