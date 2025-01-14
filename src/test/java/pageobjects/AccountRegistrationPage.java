package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy (xpath = "//input[@id='input-firstname']") WebElement txtfirstname;
	@FindBy (xpath = "//input[@id='input-lastname']") WebElement txtlastname;
	@FindBy (xpath = "//input[@id='input-email']") WebElement txtemail;
	@FindBy (xpath = "//input[@id='input-telephone']") WebElement txtnumber;
	@FindBy (xpath = "//input[@id='input-password']") WebElement txtpassword;
	@FindBy (xpath = "//input[@id='input-confirm']") WebElement txtconfirmpassword;
	@FindBy (xpath = "//input[@name='agree']") WebElement checkpolicy;
	@FindBy (xpath = "//input[@value='Continue']") WebElement btncontinue;
	
	@FindBy (xpath = "//h1[normalize-space()='Your Account Has Been Created!']") WebElement msgconfirmation;
	
	public void setFirstname(String fname)
	{
		txtfirstname.sendKeys(fname);
	}
	public void setLastname(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	public void setemail(String email)
	{
		txtemail.sendKeys(email);
	}
	public void setmobilenumber(String tel)
	{
		txtnumber.sendKeys(tel);
	}
	public void setpassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	public void setconfirmpassword(String password)
	{
		txtconfirmpassword.sendKeys(password);
	}
	public void checkbox()
	{
		checkpolicy.click();
	}
	public void btncontinue()
	{
		btncontinue.click();
	}
	
	public String getConfirmationmsg()
	{
		try {
			return(msgconfirmation.getText());
			} catch (Exception e)
				{
				return (e.getMessage());
				}
	}
	
}
