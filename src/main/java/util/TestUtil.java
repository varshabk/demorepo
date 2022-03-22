package util;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.TakesScreenshot;

public class TestUtil {
	public static long  PAGE_LOAD_TIMEOUT=40;
	public static long implict_wait=20;
	public void TakeScreenshot(WebDriver driver)
	{
		//File src=((TakeScreenShot)driver).getScreenshotAs(OutputType.FILE);
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file,new File(""));
}
}