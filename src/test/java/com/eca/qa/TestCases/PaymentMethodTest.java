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
	
//	@Test(priority=1, enabled=true)
//	public void loginPageTitleTest()
//	{
//		String title = loginPage.validateLoginPageTitle();
//		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE, "Login Page Title is not Matched");
//		Log.info("Login Page Title Verified");
//	}
	
//	@Test(priority=2, enabled=true)
//	public void crmLogoImageTest()
//	{
//		boolean flag = loginPage.validateCRMImage();
//		Assert.assertTrue(flag);
//		Log.info("CRM Logo Verified");
//	}
	
	@Test(priority=1, enabled=true, invocationCount=1)
	public void BankWirePaymentOptionTest()
	{
		loginPage.login(property.getProperty("Username"),property.getProperty("Password"));
		Log.info("Successfully Logged into E-Commerce Application");
		addToCartPage.VerifyAddOneItemToCart();
		addToCartPage.VerifyBankWirePaymentOption();
	}

	@Test(priority=1, enabled=true, invocationCount=1)
	public void CheckPaymentOptionTest()
	{
		loginPage.login(property.getProperty("Username"),property.getProperty("Password"));
		Log.info("Successfully Logged into E-Commerce Application");
		addToCartPage.VerifyAddOneItemToCart();
		addToCartPage.VerifyCheckPaymentOption();
	}

}
