package testcases;


import org.testng.Assert;

import org.testng.annotations.Test;

import pageobjects.AccountRegistrationPage;
import pageobjects.HomePage;
import testBaseClass.BaseClass;

public class TC_001_AccountRegistration extends BaseClass
{
	
	
	@Test(groups = {"Regression", "Master"})
	public void verify_account_registration()
	{
		logger.info(" ***** Starting the TC_001_AccountRegistration ***** ");
		
		try
		{
		HomePage hp = new HomePage(driver);
		
		hp.clickmyaccount();
		
		logger.info("***** clicked on my account *****");
		
		hp.registerclick();
		
		logger.info(" ***** clicked on register button *******");
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		
		logger.info("***** providing customer details *******");
		
		regpage.setFirstname(randomeString().toUpperCase());
		regpage.setLastname(randomeString().toUpperCase());
		regpage.setemail(randomeString()+"@gmail.com");
		regpage.setmobilenumber(randomeNumbers());
		
		String password  = randomeAlphaNumeric();
		
		logger.info("**** entering password *****");
		
		regpage.setpassword(password);
		regpage.setconfirmpassword(password);
				
		regpage.checkbox();
		
		logger.info("**** clicked on privacy box *****");
		
		regpage.btncontinue();
		
		logger.info("**** clicked on continue button *****");
		
		logger.info("**** validating expected value *****");
		
		String confmsg = regpage.getConfirmationmsg();
		
		if (confmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("******** Test Failed ************ ");
			logger.debug("Debug logs........");
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			//logger.error("******** Test Failed ************ ");
			//logger.debug("Debug logs........");
			Assert.fail();
		}

		logger.info("****** Finished TC_001_AccountRegistration ********* ");
	}
	
	
	
	

}
