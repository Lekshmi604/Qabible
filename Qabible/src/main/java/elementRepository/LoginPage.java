package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "loginform-username")
	WebElement userName;

	@FindBy(id = "loginform-password")
	WebElement password;

	@FindBy(name = "login-button")
	WebElement login;

	@FindBy(xpath = "//p[text()='Incorrect username or password.']")
	WebElement incorrectMsg;

	public void inputUserName(String user) {
		userName.sendKeys(user);
	}

	public void inputPassword(String passw) {
		password.sendKeys(passw);
	}

	public void clickLoginButton() {
		login.click();
	}

}



