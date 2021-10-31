package com.eca.qa.Pages;

import com.eca.qa.BaseClass.TestBase;
import com.eca.qa.Utilities.TestUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase 
{
	TestUtility testUtility;

	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement signInButton;

	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
	WebElement submitLoginButton;

	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	public HomePage login(String uname,String pword)
	{
		signInButton.click();
		Log.info("Sign In button Clicked");


		testUtility.sendKeys(driver, username ,3 , uname);
		Log.info("User Name filled");
		testUtility.sendKeys(driver, password ,3 , pword);
		Log.info("Password filled");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submitLoginButton);
		Log.info("Submit Button Clicked");
				
		return new HomePage();
	}
}

