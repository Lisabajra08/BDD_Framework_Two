package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage extends BasePage{
	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Dashboard')]")
	WebElement DASHBOARD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]")
	WebElement CUSTOMER_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]")
	WebElement ADD_CUSTOMER_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'List Customers')]")
	WebElement CLICK_LIST_CUSTOMER_BUTTON_ELEMENT;

	
	
	public void validateDashBoardPage() {
		waitForElement(driver, 5, DASHBOARD_ELEMENT);
		Assert.assertEquals(DASHBOARD_ELEMENT.getText(), "Dashboard", "Dashboard page not found");	
	}
	public void clickCustomerButton() {
		waitForElement(driver, 5, CUSTOMER_BUTTON_ELEMENT);
		CUSTOMER_BUTTON_ELEMENT.click();
	}
	public void clickAddCustomerButton() {
		waitForElement(driver, 5,ADD_CUSTOMER_BUTTON_ELEMENT);
		ADD_CUSTOMER_BUTTON_ELEMENT.click();
	}
	
	public void clickListCustomerButton() {
		waitForElement(driver, 5, CLICK_LIST_CUSTOMER_BUTTON_ELEMENT);
		 CLICK_LIST_CUSTOMER_BUTTON_ELEMENT.click();
		
			
	}
	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement element) {
	
	}

}
