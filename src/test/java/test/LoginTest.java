package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.HomePage;
import page.LoginPage;

public class LoginTest  extends TestBase{
	public HomePage homepage;
	public LoginPage loginpage;
	public LoginTest()
	{
		super();
	}
@BeforeMethod
public void setup()
{
	initialization();
	loginpage=new LoginPage();
}
@Test(priority=1)
public void verifytest()
{
	String title=loginpage.validateLoginTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Cogmento CRM");
}
@Test(priority=2)
public void logintest()
{
	homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
}
@AfterMethod
public void teardown()
{
	driver.quit();
}

}
