package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	public HomePage homepage;
	@FindBy(xpath="//input[@name='email']") WebElement username;
	@FindBy(name="password") WebElement password;
    @FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement login;
    @FindBy(xpath="//a[contains(text(),'Sign Up']") WebElement signup;
    public LoginPage()
    {
    	PageFactory.initElements(driver, this);
    }
    public String validateLoginTitle()
    {
    	return driver.getTitle();
    }
    public HomePage login(String uname,String pwd)
    {
    	username.sendKeys(uname);
    	password.sendKeys(pwd);
    	login.click();
    	return new HomePage();
    }
}
