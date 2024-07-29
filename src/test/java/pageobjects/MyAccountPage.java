package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{
	public MyAccountPage (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//h2[normalize-space()='My Account']") WebElement myaccountmsg;
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']") WebElement linklogout;
	
	public boolean isMyAccountPageExist()
	{
		try
		{
		return(myaccountmsg.isDisplayed());
		}
		catch (Exception e)
		{
			return false;
		}
	}
	
	public void clicklogout()
	{
		linklogout.click();
	}
}
