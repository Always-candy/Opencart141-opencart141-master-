package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginTest extends BasePage
{
	public LoginTest (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-email']") WebElement txtemail;
	@FindBy (xpath = "//input[@id='input-password']") WebElement txtpassword;
	@FindBy (xpath = "//input[@value='Login']") WebElement loginbtn;
	
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void setpassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	
	public void loginclick()
	{
		loginbtn.click();
	}
	
	
	
	
}
