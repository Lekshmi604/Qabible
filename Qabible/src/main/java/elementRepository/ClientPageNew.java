package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtility;

public class ClientPageNew {
	GeneralUtility gu = new GeneralUtility();

	WebDriver driver;

	public ClientPageNew(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Clients']")
	WebElement client;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement search;
	@FindBy(tagName = "span")
	WebElement titleView;
	@FindBy(id="clientsearch-client_name")
	WebElement clientName;

	public void navigateToClientTab() {
		client.click();
	}

	public String getSearchButtonText() {
		return gu.getElementText(search);

	}
	public String verifyTheTitleOfView() {
		return gu.getValueOfAttrivbuteTitle(titleView);		
	}
	public void enterClientName(String name) {
		clientName.sendKeys(name);
		
	}

}
