package base;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SecreenshotCapture;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {

	public WebDriver driver;
	public static Properties properties;

	public static void testBase() throws Exception {
		properties = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
		properties.load(ip);
	}

	
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String browserName) throws Exception {
		testBase();
		if(browserName.equals("Chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();

		driver.get(properties.getProperty("baseUrl"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

	@AfterMethod
	public void afterMethod(ITestResult iTestResult) throws Exception {// ITestResult=listener
		if (iTestResult.getStatus() == iTestResult.FAILURE) {
			SecreenshotCapture sc = new SecreenshotCapture();
			sc.captureScreenshortOnFailure(driver, iTestResult.getName());
		}
		driver.close();
	}
}
