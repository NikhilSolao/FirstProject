package main.actions;
/*
 * @author - Nikhil Solao
 */
import org.testng.Assert;

import main.pageobjects.LoginPageElements;
import main.utils.ElementFetch;
import test.BaseTest;

public class LoginPageEvents {

	public void verifyLoginPageOpenedOrNot() throws InterruptedException {
		
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(5000);		
		BaseTest.logger.info("Verifying login Page Opened or Not");
		Assert.assertTrue(elFetch.getListOfWebElements("XPATH", LoginPageElements.loginText).size()>0,"Login Page did not Opened");
		
	}
	
	public void enterEmailID(String email) throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);
		BaseTest.logger.info("Entered email id");
		elFetch.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys(email);
	}
	
	public void enterPassword(String pass) throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);
		BaseTest.logger.info("Entered password");
		elFetch.getWebElement("XPATH", LoginPageElements.passWord).sendKeys(pass);
	}
	
	public void selectCheckBox() throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);
		BaseTest.logger.info("UnSelected checkbox");
		elFetch.getWebElement("XPATH", LoginPageElements.remeberEmailCheckBox).click();
	}
	
	public void clickOnLoginBtn() throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);
		BaseTest.logger.info("Clicked on Login Button");
		elFetch.getWebElement("XPATH", LoginPageElements.loginBtn).click();
		Thread.sleep(1000);
	}
}
