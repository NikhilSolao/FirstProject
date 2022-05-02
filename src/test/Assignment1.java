package test;
/*
 * @author - Nikhil Solao
 */
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import main.actions.FBHomePageEvents;
import main.actions.FBLoginPageEvents;

public class Assignment1 extends BaseTest {
	
	@Test
	@Parameters(value = {"fbURL","fbid","fbpass","statusMsg"})
	public void FaceBookAssignment1(String url, String id, String pass, String statusMsg) throws InterruptedException {
		
		FBLoginPageEvents fbLPE = new FBLoginPageEvents();
		FBHomePageEvents fbHPE = new FBHomePageEvents();
		
		BaseTest.driver.navigate().to(url);
		fbLPE.verifyFBPage();
		fbLPE.enterEmail(id);
		fbLPE.enterPassWord(pass);
		fbLPE.clickOnLoginBtn();
		fbHPE.clickOnPostAStatus();
		fbHPE.CreateAPost(statusMsg);
		fbHPE.clickOnPostBtn();
		
		
	}

}
