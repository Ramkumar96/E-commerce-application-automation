package com.eca.qa.TestCases;

import com.eca.qa.BaseClass.TestBase;
import com.eca.qa.Pages.AddToCartPage;
import com.eca.qa.Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PaymentMethodTest extends TestBase
{
	LoginPage loginPage;
	AddToCartPage addToCartPage;

	public PaymentMethodTest()
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
	public void BankWirePaymentOptionTest()
	{
		loginPage.login(property.getProperty("Username"),property.getProperty("Password"));
		Log.info("Successfully Logged into E-Commerce Application");
		addToCartPage.VerifyAddOneItemToCart();
		Log.info("Successfully verified add one item to cart");
		addToCartPage.VerifyBankWirePaymentOption();
		Log.info("Successfully verified Bank wire payment option");
	}

	@Test(priority=2, enabled=true, invocationCount=1)
	public void CheckPaymentOptionTest()
	{
		loginPage.login(property.getProperty("Username"),property.getProperty("Password"));
		Log.info("Successfully Logged into E-Commerce Application");
		addToCartPage.VerifyAddOneItemToCart();
		Log.info("Successfully verified add many item to cart");
		addToCartPage.VerifyCheckPaymentOption();
		Log.info("Successfully verified check payment option");
	}
}
