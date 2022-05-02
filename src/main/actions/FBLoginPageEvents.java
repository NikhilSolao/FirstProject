package main.actions;
/*
 * @author - Nikhil Solao
 */
import org.testng.Assert;

import main.pageobjects.FBLoginPageElements;
import main.utils.ElementFetch;
import test.BaseTest;

public class FBLoginPageEvents {

	public void verifyFBPage() throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(5000);		
		BaseTest.logger.info("Veryfing FB login page");
		Assert.assertEquals(elFetch.getWebElement("XPATH", FBLoginPageElements.verifyFBloginPage).getText(), 
				"Facebook helps you connect and share with the people in your life.", "Wrong Page");
	}
	
	public void enterEmail(String email) throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);
		BaseTest.logger.info("Entered email id");
		elFetch.getWebElement("ID", FBLoginPageElements.emailTxtBox).sendKeys(email);
	}
	
	public void enterPassWord(String pass) throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);
		BaseTest.logger.info("Entered password");
		elFetch.getWebElement("ID", FBLoginPageElements.passTxtBox).sendKeys(pass);
	}
	
	public void clickOnLoginBtn() throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);
		BaseTest.logger.info("Clicked on Login Button");
		elFetch.getWebElement("XPATH", FBLoginPageElements.logInBtn).click();
		Thread.sleep(1000);
	}
	
}
