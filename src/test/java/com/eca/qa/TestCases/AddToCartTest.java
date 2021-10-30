package com.eca.qa.TestCases;

import com.eca.qa.BaseClass.TestBase;
import com.eca.qa.Pages.AddToCartPage;
import com.eca.qa.Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase
{
	LoginPage loginPage;
	AddToCartPage addToCartPage;

	public AddToCartTest()
	{
		super();
	}

	@BeforeMethod(alwaysRun=true)
	public void setUp()
	{
		initialization();
		Log.info("-----------------------------------------------");
		Log.info("Application Launched Successfully");
		loginPage = new LoginPage();
		addToCartPage = new AddToCartPage();
	}

	@Test(priority=1, enabled=true, invocationCount=1)
	public void addOneItemToCartTest()
	{
		loginPage.login(property.getProperty("Username"),property.getProperty("Password"));
		Log.info("Successfully Logged into E-Commerce Application");
		addToCartPage.VerifyAddOneItemToCart();
		Log.info("Successfully verified add one item to cart");
	}

	@Test(priority=2, enabled=true, invocationCount=1)
	public void addManyItemToCartTest()
	{
		loginPage.login(property.getProperty("Username"),property.getProperty("Password"));
		Log.info("Successfully Logged into E-Commerce Application");
		addToCartPage.VerifyAddManyItemToCart();
		Log.info("Successfully verified add many item to cart");
	}
}
