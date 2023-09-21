package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constant.Constant;
import elementRepositry.ClientPage;

import elementRepositry.LoginPage;

public class ClientTestCasesOld extends BaseClass {
	
  @Test
  public void verifyTextOfSearch() {
	  LoginPage l = new LoginPage(driver);
		l.inputUserName("carol");
		l.inputPassword("1q2w3e4r");
		l.clickLoginButton();
		
		

		ClientPage c=new ClientPage(driver);
		c.navigateToClientTab();
		String actual=c.getSearchButtonText();
		String expected="Searc";
		Assert.assertEquals(actual, expected,Constant.ERRORMESSAGEWRONGSEARCHBUTTON);
		
  }
  
}
