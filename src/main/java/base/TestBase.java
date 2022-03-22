package base;

import java.io.FileInputStream;
import util.TestUtil;
import util.WebDriverEvent;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public WebDriverEvent eventlistener;
	public EventFiringWebDriver e_driver;
	public TestBase() 
	{
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("D:\\workspace\\hybrid\\src\\main\\java\\config\\config.properties");
		prop.load(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void initialization()
	{
		String browsername=prop.getProperty("browser");
		System.out.println(browsername);
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();		}
		else if(browsername.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "");
			driver=new FirefoxDriver();
		}
	//	e_driver=new EventFiringWebDriver(driver);
	//	eventlistner=new WebDriveEvent();
	//	e_driver.re
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
