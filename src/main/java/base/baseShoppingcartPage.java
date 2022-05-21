package base;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import data.AddonClass;

public class baseShoppingcartPage {
	//WebElement element;
	AddonClass addon=new AddonClass();
	public void waitForelementVisibilty()
	{
		Wait w=new WebDriverWait(null, 0);
		//w.until(ExpectedConditions.elementToBeSelected(WebElement element));
	}

}
