package main.actions;
/*
 * @author - Nikhil Solao
 */
import main.pageobjects.FBHomePageElements;
import main.utils.ElementFetch;
import test.BaseTest;

public class FBHomePageEvents {

	public void clickOnPostAStatus() throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);		
		BaseTest.logger.info("Clicked on Post a status");
		elFetch.getWebElement("XPATH", FBHomePageElements.statusMsgTxtBox).click();
	}
	
	public void CreateAPost(String statusmsg) throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);		
		BaseTest.logger.info("Typed a status");
		elFetch.getWebElement("XPATH", FBHomePageElements.createPost).sendKeys(statusmsg);
	}
	
	public void clickOnPostBtn() throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);		
		BaseTest.logger.info("Clicked on Post button");
		elFetch.getWebElement("XPATH", FBHomePageElements.postBtn).click();
	}
	
}
