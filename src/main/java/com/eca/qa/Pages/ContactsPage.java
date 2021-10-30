package com.eca.qa.Pages;

import com.eca.qa.BaseClass.TestBase;
import com.eca.qa.Utilities.TestUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ContactsPage extends TestBase
{
	TestUtility testUtility;

	@FindBy(xpath = "//*[@id=\"contact-link\"]/a")
	WebElement contactusButton;

	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement emailAddress;

	@FindBy(xpath = "//*[@id=\"id_order\"]")
	WebElement orderReference;

	@FindBy(xpath = "//*[@id=\"message\"]")
	WebElement message;

	@FindBy(xpath = "//*[@id=\"submitMessage\"]/span")
	WebElement sendButton;

	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void createNewContact(String email, String reference, String msg)
	{
		contactusButton.click();
		Log.info("Contact Us Button Clicked");

		testUtility.selectValueFromDropDownByIndex(driver.findElement(By.id("id_contact")) , 1);
		Log.info("Selected subject Heading : Customer service");

		testUtility.sendKeys(driver, emailAddress ,3 , email);
		Log.info("Email address is filled");

		testUtility.sendKeys(driver, orderReference ,3 , reference);
		Log.info("Order Reference is filled");

		testUtility.sendKeys(driver, message ,3 , msg);
		Log.info("Message area is filled");

		sendButton.click();
		Log.info("Message send button is clicked");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
