package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class SecreenshotCapture {
	public void captureScreenshortOnFailure(WebDriver driver,String name) throws Exception {
		//Interface and method for capture of Screenshot
		TakesScreenshot scrShot=(TakesScreenshot) driver;
		File screenShort=scrShot.getScreenshotAs(OutputType.FILE);
		String timeStamp =new SimpleDateFormat(("dd_MM_yyyy_hh_mm_ss")).format(new Date());
		File finalDestination=new File(System.getProperty("user.dir")+"\\OutputScreenshots\\"+"_"+ timeStamp +".png");
		FileHandler.copy(screenShort, finalDestination);
	}

}
