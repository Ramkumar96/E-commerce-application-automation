package com.eca.qa.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eca.qa.BaseClass.TestBase;

public class LoginPage extends TestBase 
{
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement signInButton;

	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
	WebElement submitLoginButton;
	

	
//	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
//	WebElement crmLogo;LoginPage
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//	public String validateLoginPageTitle()
//	{
//		return driver.getTitle();
//	}
	
//	public boolean validateCRMImage()
//	{
//		return crmLogo.isDisplayed();
//	}
	
	public HomePage login(String uname, String pword)
	{
		signInButton.click();
		username.sendKeys(uname);
		password.sendKeys(pword);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submitLoginButton);
				
		return new HomePage();
	}
}

