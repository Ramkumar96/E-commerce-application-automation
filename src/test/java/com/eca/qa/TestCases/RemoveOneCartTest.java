package com.eca.qa.TestCases;

import com.eca.qa.BaseClass.TestBase;
import com.eca.qa.Pages.AddToCartPage;
import com.eca.qa.Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveOneCartTest extends TestBase
{
	LoginPage loginPage;
	AddToCartPage addToCartPage;

	public RemoveOneCartTest()
	{
		super();
	}

	@BeforeMethod(alwaysRun=true)
	public void setUp()
	{
		initialization();
		Log.info("Application Launched Successfully");
		
		loginPage = new LoginPage();
		addToCartPage = new AddToCartPage();
	}

	@Test(priority=1, enabled=true, invocationCount=1)
	public void removeOneItemTest()
	{
		loginPage.login(property.getProperty("Username"),property.getProperty("Password"));
		Log.info("Successfully Logged into E-Commerce Application");
		addToCartPage.VerifyAddManyItemToCart();
		Log.info("Successfully added many items to the cart");
		addToCartPage.VerifyRemoveOneItemFromCart();
		Log.info("Successfully one item removed from the cart");
		Log.info("End of removeOneItemTest");
	}
}
