package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtility {
	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;
	}
public String getStyleProperty(WebElement element,String propertyType) {
	String getStyleValue = element.getCssValue(propertyType);
	return getStyleValue;
}
public String getValueOfAttrivbuteTitle(WebElement element) {
	String title=element.getAttribute("title");
	return title;
}
public String dropdownValueSelect(WebElement element,String valueToSelect) {
	Select s=new Select(element);
	s.selectByValue(valueToSelect);
	String selectedValueText=s.getFirstSelectedOption().getText();
	return selectedValueText;
}
}
