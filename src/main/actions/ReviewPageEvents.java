package main.actions;
/*
 * @author - Nikhil Solao
 */
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import main.pageobjects.ReviewPageElements;
import main.utils.ElementFetch;
import test.BaseTest;

public class ReviewPageEvents {

	public void verifyReviewPageProfileName(String profileName) throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(5000);		
		BaseTest.logger.info("Veryfing review page profile name");
		Assert.assertEquals(elFetch.getWebElement("XPATH", ReviewPageElements.reviewPageProfileName).getText(), profileName, "Profile mismatched");
	}
	
	public void scrollDownPage() {
		JavascriptExecutor js = (JavascriptExecutor) BaseTest.driver;
		js.executeScript("window.scrollBy(0,400)", "");
	}
	
	public void giveRatingStars() throws InterruptedException {
		scrollDownPage();
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);	
		BaseTest.logger.info("Giving ratings as 4 stars");
		Actions actions = new Actions(BaseTest.driver);
		actions.moveToElement(elFetch.getWebElement("XPATH", ReviewPageElements.firstStar));
		Thread.sleep(2000);
		actions.moveToElement(elFetch.getWebElement("XPATH", ReviewPageElements.fourthStar));
		actions.click().build().perform();
		Thread.sleep(5000);	
	}
	
	public void selectOptionFromDropdown(String searchText) throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		BaseTest.logger.info("Selecting dropdown value");
		elFetch.getWebElement("XPATH", ReviewPageElements.dropDown).click();
		List<WebElement> options = elFetch.getListOfWebElements("XPATH", ReviewPageElements.dropDownValues);
		Thread.sleep(2000);
		for (WebElement option : options)
		{
		    if (option.getText().equals(searchText))
		    {
		        option.click(); // click the desired option
		        break;
		    }
		}
	}
	
	public void writeReview() throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);
		BaseTest.logger.info("Writting review");
        String msg = "";
        for (int i = 0; i < 5; i++) {
            msg += " The quick brown fox jumps over the lazy dog.";
        }
		elFetch.getWebElement("XPATH", ReviewPageElements.reviewTextBox).sendKeys(msg);	
		
	}
	
	public void clickOnSubmitBtn() throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);
		BaseTest.logger.info("Clicked on  Submit button");
		elFetch.getWebElement("XPATH", ReviewPageElements.submitBtn).click();	
		
	}
	
	public void confirmationOfReview() throws InterruptedException {
		ElementFetch elFetch = new ElementFetch();
		Thread.sleep(2000);
		BaseTest.logger.info("Confirming the review message");
		Assert.assertEquals(elFetch.getWebElement("XPATH", ReviewPageElements.confirmationMsg).getText(), "Your review has been posted.", "Failed reviewing confirmation message");
	}
	
	public void verifyTheComment() throws InterruptedException {
		scrollDownPage();
		ElementFetch elFetch = new ElementFetch();
		BaseTest.logger.info("Verifying the comment");
		Thread.sleep(2000);	
        String msg = "";
        for (int i = 0; i < 5; i++) {
            msg += " The quick brown fox jumps over the lazy dog.";
        }
        Assert.assertEquals(elFetch.getWebElement("XPATH", ReviewPageElements.commentVerify).getText(), msg, "Failed verifying the comment");
	}
	
}
