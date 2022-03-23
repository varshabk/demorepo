package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NewLogin extends TestBase {
	
		public HomePage homepage;
		@FindBy(xpath="//input[@name='email']") WebElement username;
		@FindBy(id="ap_password") WebElement password;
	    @FindBy(id="continue") WebElement login;
	    @FindBy(id="signInSubmit") WebElement signin;
	    public NewLogin()
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
	    
	    	login.click();
	    	password.sendKeys(pwd);
	    	signin.click();
	    	return new HomePage();
	    }
	}


