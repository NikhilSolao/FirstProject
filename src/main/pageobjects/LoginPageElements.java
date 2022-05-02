package main.pageobjects;
/*
 * @author - Nikhil Solao
 */
public interface LoginPageElements {

	String loginText = "//h1[@class='h1-heading' and text() ='Login']";
	String emailAddress = "//input[@name='em' and @placeholder='Email Address']";
	String passWord = "//input[@id='password' and @name='pw']";
	String remeberEmailCheckBox = "//label[@class='toggle inline-block small' and @role='checkbox']";
	String loginBtn = "//button[@class='btn blue center reg-tabs-bt touch-element-cl']";
	
}
