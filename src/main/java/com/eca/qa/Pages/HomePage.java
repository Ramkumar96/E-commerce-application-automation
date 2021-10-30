package com.eca.qa.Pages;

import com.eca.qa.BaseClass.TestBase;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase
{
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
}
