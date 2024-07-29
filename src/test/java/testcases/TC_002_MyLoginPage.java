package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginTest;
import pageobjects.MyAccountPage;
import testBaseClass.BaseClass;

public class TC_002_MyLoginPage extends BaseClass
{
	@Test(groups = {"Sanity", "Master"})
	public void verify_Login()
	{
		logger.info("*** Starting TC_002_MyLoginPage ******** ");
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickmyaccount();
		logger.info("**** Clicked on account **********");
		
		hp.loginbutton();
		logger.info("**** clicking on login button *******");
		
		
		LoginTest lt = new LoginTest(driver);
		lt.setEmail(p.getProperty("email"));
		lt.setpassword(p.getProperty("password"));
		lt.loginclick();
		
		logger.info("********* clicking on login ********** ");
		
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetpage = macc.isMyAccountPageExist();
		
		Assert.assertTrue(targetpage);
		//Assert.assertEquals(targetpage, true, "login failed");
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("******* Finished TC_002_MyLoginPage *********** ");
		
	}
	
	
	
}
