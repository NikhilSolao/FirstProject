package test;
/*
 * @author - Nikhil Solao
 */
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import main.actions.LoginPageEvents;
import main.actions.ReviewPageEvents;

public class Assignment2 extends BaseTest {

	@Test
	@Parameters(value = {"email","pass","reviewURL","profileName"})
	public void WalletHubAssignment2(String email, String pass, String reviewURL, String profileName) throws InterruptedException {
		
		LoginPageEvents lpe = new LoginPageEvents();
		ReviewPageEvents rpe = new ReviewPageEvents();
		
		lpe.verifyLoginPageOpenedOrNot();
		lpe.enterEmailID(email);
		lpe.enterPassword(pass);
		lpe.selectCheckBox();
		lpe.clickOnLoginBtn();
		BaseTest.driver.navigate().to(reviewURL);
		rpe.verifyReviewPageProfileName(profileName);
		rpe.giveRatingStars();
		rpe.selectOptionFromDropdown("Health Insurance");
		//rpe.writeReview();
		//rpe.clickOnSubmitBtn();
		rpe.confirmationOfReview();
		BaseTest.driver.navigate().to(reviewURL);
		rpe.verifyReviewPageProfileName(profileName);
		
	}
	
}
