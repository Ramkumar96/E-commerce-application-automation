package com.eca.qa.TestCases;

import com.eca.qa.BaseClass.TestBase;
import com.eca.qa.Pages.ContactsPage;
import com.eca.qa.Pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactPageTest extends TestBase
{
	ContactsPage contactsPage;
	HomePage homePage;

	public ContactPageTest()
	{
		super();
	}

	@BeforeMethod(alwaysRun=true)
	public void setUp()
	{
		initialization();
		Log.info("Application Launched Successfully");

		contactsPage = new ContactsPage();
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
	public void ContactUsTest()
	{

		contactsPage.createNewContact(property.getProperty("email"),property.getProperty("reference"),property.getProperty("msg"));
		Log.info("Your message has been successfully sent to our team.");
		Log.info("Successfully Contacted to E-Commerce Application");
	}

//	@Test(priority=2, enabled=true)
//	public void ContactPageTitleTest()
//	{
//		String title = contactsPage.validateSucessMessage();
//		Assert.assertEquals(title, Constants.CONTACTUS_SUCCESS_MESSAGE, "Login Page Title is not Matched");
//		Log.info("Contact Us Page Success Message Verified");
//	}
}
