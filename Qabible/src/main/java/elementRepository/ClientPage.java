package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtility;

public class ClientPage {
	GeneralUtility gu = new GeneralUtility();

	WebDriver driver;

	public ClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Clients']")
	WebElement client;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement search;
	@FindBy(tagName = "span")
	WebElement titleView;

	public void navigateToClientTab() {
		client.click();
	}

	public String getSearchButtonText() {
		return gu.getElementText(search);

	}
	public String verifyTheTitleOfView() {
		return gu.getValueOfAttrivbuteTitle(titleView);		
	}

}
