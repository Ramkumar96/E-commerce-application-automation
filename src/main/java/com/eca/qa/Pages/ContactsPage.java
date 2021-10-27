package com.eca.qa.Pages;

import com.eca.qa.BaseClass.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactsPage extends TestBase
{
	@FindBy(xpath = "//*[@id=\"contact-link\"]/a")
	WebElement contactusButton;

	@FindBy(xpath = "//*[@id=\"id_contact\"]")
	WebElement headingDropdown;
//	Select heading = new Select(headingDropdown);

	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement emailAddress;

	@FindBy(xpath = "//*[@id=\"id_order\"]")
	WebElement orderReference;

	@FindBy(xpath = "//*[@id=\"uniform-fileUpload\"]/span[2]")
	WebElement chooseFile ;

	@FindBy(xpath = "//*[@id=\"message\"]")
	WebElement message;

	@FindBy(xpath = "//*[@id=\"submitMessage\"]/span")
	WebElement sendButton;

//	@FindBy(xpath = "//*[@id=\"center_column\"]/p")
//	WebElement successMsg;

	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}

//	public boolean verifyContactsLabel()
//	{
//		return contactsLabel.isDisplayed();
//	}

//	public void selectContactByName(String name)
//	{
//		driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]//parent::td[@class='datalistrow']"
//				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
//	}



	public void createNewContact(String email, String reference, String msg)
	{
		contactusButton.click();

		Select select = new Select(driver.findElement(By.id("id_contact")));
		select.selectByIndex(1);

//		heading.selectByIndex(1);
		emailAddress.sendKeys(email);
		orderReference.sendKeys(reference);
//		chooseFile.sendKeys("G:\\Projects\\E-commerce-application-automation\\src\\main\\java\\com\\eca\\qa\\TestData\\Images\\capture.jpg");
		message.sendKeys(msg);
		sendButton.click();
	}

//	public String validateSucessMessage()
//	{
//		return successMsg.getText();
//	}
}
