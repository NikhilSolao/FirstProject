package main.pageobjects;
/*
 * @author - Nikhil Solao
 */
public interface ReviewPageElements {
	
	String reviewPageProfileName = "//h1[@class='profile-name']";
	String firstStar = "//*[local-name()='svg'and @width ='38'][1]";
	String fourthStar = "//*[local-name()='svg'and @width ='38'][4]";
	String dropDown = "//div[@class='dropdown second']";
	String dropDownValues = "//div[@class='dropdown second']//ul//li";
	String reviewTextBox = "//div[@class='android textarea-user']/textarea";
	String submitBtn = "//div[@class='sbn-action semi-bold-font btn fixed-w-c tall' and text()=' Submit ']";
	String confirmationMsg = "//div[@class='rvc-header']/h4";
	String commentVerify = "//section[@class='rvtab-content']/article[1]/div[5]";

}
