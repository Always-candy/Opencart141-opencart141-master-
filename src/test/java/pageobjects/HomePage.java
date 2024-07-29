package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//span[normalize-space()='My Account']") WebElement linkaccountclick;
	@FindBy(xpath = "//a[normalize-space()='Register']") WebElement linkregisterclick;
	
	@FindBy(xpath = "//a[normalize-space()='Login']") WebElement loginclick;
	
	
	public void clickmyaccount()
	{
		linkaccountclick.click();
	}
	
	public void registerclick()
	{
		linkregisterclick.click();
	}
	
	public void loginbutton()
	{
		loginclick.click();
	}

}
