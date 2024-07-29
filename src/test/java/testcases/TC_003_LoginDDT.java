package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.DataProviders;
import pageobjects.HomePage;
import pageobjects.LoginTest;
import pageobjects.MyAccountPage;
import testBaseClass.BaseClass;

public class TC_003_LoginDDT extends BaseClass
{
	
	@Test(dataProvider = "LoginData" , dataProviderClass = DataProviders.class)
	public void verify_login(String email, String pwd, String exp)
	{
		logger.info("***** Starting TC_003_LoginDDT ********");
	try
	{
	HomePage hp = new HomePage(driver);
	hp.clickmyaccount();
	logger.info("**** Clicked on account **********");
	
	hp.loginbutton();
	logger.info("**** clicking on login button *******");
	
	
	LoginTest lt = new LoginTest(driver);
	lt.setEmail(email);
	lt.setpassword(pwd);
	lt.loginclick();
	
	logger.info("********* clicking on login ********** ");
	
	MyAccountPage macc = new MyAccountPage(driver);
	boolean targetpage = macc.isMyAccountPageExist();
		
	//valid data conditions
	
	if (exp.equalsIgnoreCase("Valid"))
	{
		if (targetpage==true)
		{
			macc.clicklogout();
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	if (exp.equalsIgnoreCase("Invalid"))
	{
		if(targetpage==false)
		{
			macc.clicklogout();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
}
	catch (Exception e)
	{
		Assert.fail();
	}
		
	logger.info("****** Finished TC_003_DDTLogin **********");	
	
	}
	
}


