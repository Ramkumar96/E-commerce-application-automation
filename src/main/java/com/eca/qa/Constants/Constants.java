package com.eca.qa.Constants;

public class Constants 
{
	public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";

	public static final long PAGE_LOAD_TIMEOUT = 30;
	public static final long IMPLICIT_WAIT = 15;
	public static final long EXPLICIT_WAIT = 15;

	public static final int SHORT_WAIT = 3000;
	public static final int MEDIUM_WAIT = 6000;
	public static final int LONG_WAIT = 10000;
	
	public static final String LOGIN_PAGE_TITLE = "CRMPRO - CRM software for customer relationship management, sales, and support.";
	public static final String HOME_PAGE_TITLE = "CRMPRO";
	public static final String CONTACTUS_SUCCESS_MESSAGE = "Your message has been successfully sent to our team.";

	public static final String TEST_DATA_SHEET_PATH = System.getProperty("user.dir") + "/src/main/java/com/crm/qa/TestData/FreeCRMTestData.xlsx";
}
