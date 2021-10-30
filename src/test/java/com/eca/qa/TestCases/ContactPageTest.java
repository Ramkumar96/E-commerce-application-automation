package com.eca.qa.TestCases;

import com.eca.qa.BaseClass.TestBase;
import com.eca.qa.Pages.ContactsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactPageTest extends TestBase
{
	ContactsPage contactsPage;

	public ContactPageTest()
	{
		super();
	}

	@BeforeMethod(alwaysRun=true)
	public void setUp()
	{
		initialization();
		Log.info("-----------------------------------------------");
		Log.info("Application Launched Successfully");
		contactsPage = new ContactsPage();
	}

	@Test(priority=1, enabled=true, invocationCount=1)
	public void ContactUsTest()
	{
		contactsPage.createNewContact(property.getProperty("email"),property.getProperty("reference"),property.getProperty("msg"));
		Log.info("Your message has been successfully sent to our team.");
		Log.info("Successfully Contacted to E-Commerce Application");
		Log.info("Test Passed");
	}
}
