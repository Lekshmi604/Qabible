package elementRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.GeneralUtility;

public class WorkingOfWorkersTab {
	GeneralUtility gu = new GeneralUtility();
	WebDriver driver;

	public WorkingOfWorkersTab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Workers']")
	WebElement workers;
	@FindBy(xpath = "//button[text()='Search']")
	WebElement searchButton;
	@FindBy(xpath = "//a[text()='Create Worker']")
	WebElement createWorker;
	@FindBy(xpath = "//a[text()='Workers']")
	WebElement workersTab;
	@FindBy(xpath = "//a[@aria-label='Delete']")
	WebElement titleDelete;
	@FindBy(id = "worker-title")
	WebElement selectTitle;
	@FindBy(id="workersearch-first_name")
	WebElement enterFirstName;
	@FindBy(xpath = "//button[text()='Search']")
	WebElement srchButton;

	public void navigateToWorkersTab() {
		workers.click();

	}

	public String findBorderColour() {
		return gu.getStyleProperty(searchButton, "background-color");
	}

	public void navigateToCreateWorker() {
		createWorker.click();
	}

	public String selectDropDownValue() {

		return gu.dropdownValueSelect(selectTitle, "Mrs");
	}

	public void tabOfWorkers() {
		workersTab.click();

	}

	public String verifyTheTitleOfDelete() {
		return gu.getValueOfAttrivbuteTitle(titleDelete);

	}
	
	public String findBackgroundColour() {
		return gu.getStyleProperty(srchButton, "background-color");
		
		
	}
	
}
