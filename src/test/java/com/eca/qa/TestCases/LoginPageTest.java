package com.eca.qa.TestCases;

import com.eca.qa.BaseClass.TestBase;
import com.eca.qa.Pages.HomePage;
import com.eca.qa.Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase
{	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}

	@BeforeMethod(alwaysRun=true)
	public void setUp()
	{
		initialization();
		Log.info("-----------------------------------------------");
		Log.info("E-Commerce Application Launched Successfully");
		loginPage = new LoginPage();
	}
	
	@Test(priority=1, enabled=true, invocationCount=1)
	public void loginTest()
	{
		homePage = loginPage.login(property.getProperty("Username"),property.getProperty("Password"));
		Log.info("Successfully Logged into E-Commerce Application");
	}
}
