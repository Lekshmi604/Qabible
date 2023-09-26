package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constant.Constant;
import elementRepositry.HomePage;
import elementRepositry.LoginPage;

public class LoginTestCases extends BaseClass{
  @Test(retryAnalyzer = listener.Retry.class)
  public void login() {
	  LoginPage l = new LoginPage(driver);
		l.inputUserName("carol");
		l.inputPassword("1q2w3e4r");
		l.clickLoginButton();
		HomePage h = new HomePage(driver);
		String actual = h.getTextOfHomePage();
		String expected = "Welcome to Payroll Application";
		Assert.assertEquals(actual, expected, "login not successfull");
  }
  @Test
  public void invalidLoginId() {
	  LoginPage l = new LoginPage(driver);
		l.inputUserName("username");
		l.inputPassword("password");
		l.clickLoginButton();
		
		
		String actual=l.errorMessage();
		String expected = "Incorrect username or password.";
		Assert.assertEquals(actual, expected, Constant.ERRORMESSAGELOGINPAGE);

	 
  }
}
