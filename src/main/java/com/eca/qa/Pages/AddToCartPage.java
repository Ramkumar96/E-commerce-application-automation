package com.eca.qa.Pages;

import com.eca.qa.BaseClass.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AddToCartPage extends TestBase {

	@FindBy(xpath = "//*[@id=\"columns\"]/div[1]/a/i")
	WebElement HomeButton;

	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
	WebElement shoppingCardImg1;

	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[1]/img")
	WebElement shoppingCardImg2;

	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[7]/div/div[1]/div/a[1]/img")
	WebElement shoppingCardImg3;

	@FindBy(xpath = "//*[@id=\"product_2_7_0_588254\"]/td[1]/a/img")
	WebElement cartProductImg;

	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]")
	WebElement addToCartBtn1;

	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[1]")
	WebElement addToCartBtn2;

	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[1]")
	WebElement addToCartBtn3;

	@FindBy(xpath = "//*[@id=\"2_7_0_588254\"]")
	WebElement productCartDeleteIcon;

	@FindBy(xpath = "//*[@id=\"cart_title\"]")
	WebElement Element;

	@FindBy(xpath = "//*[@id=\"cart_summary\"]/tfoot/tr[7]/td[1]")
	WebElement totalElement;

	@FindBy(xpath = "//*[@id=\"columns\"]/div[1]")
	WebElement orderConfirmElement;

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	WebElement cartDropDownBtn;

	//Payment
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement SummaryProceedCheckoutBtn;

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	WebElement addressProceedCheckoutBtn;

	@FindBy(xpath = "//*[@id=\"cgv\"]")
	WebElement TermsCheckbox;

	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	WebElement shippingProceedCheckoutBtn;

	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement BankWirePaymentOptionBtn;

	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
	WebElement checkPaymentOptionBtn;

	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	WebElement confirmOrderBtn;

	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}

	public void VerifyAddOneItemToCart() {

		HomeButton.click();
		Log.info("Home Button clicked and navigated to Home page");

		Actions builder = new Actions(driver);
		builder.moveToElement(shoppingCardImg1).build().perform();
		Log.info("Hovered a card displayed");

		addToCartBtn1.click();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("add to cart button clicked");

		cartDropDownBtn.click();
		Log.info("Clicked on Cart Dropdown Button");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}

	public void VerifyAddManyItemToCart() {

		HomeButton.click();
		Log.info("Home Button clicked and navigated to Home page");

//		Add first item to cart
		Actions builder = new Actions(driver);
		builder.moveToElement(shoppingCardImg1).build().perform();
		Log.info("Hovered a card displayed in Home page");

		addToCartBtn1.click();
		Log.info("add to cart button clicked first item added to cart");
		driver.navigate().refresh();


//		Add second item to cart
		Actions builder2 = new Actions(driver);
		builder2.moveToElement(shoppingCardImg2).build().perform();
		Log.info("Hovered a card displayed in Home page");
		addToCartBtn2.click();
		Log.info("add to cart button clicked second item added to cart");
		driver.navigate().refresh();

//		Add third item to cart
		Actions builder3 = new Actions(driver);
		builder3.moveToElement(shoppingCardImg3).build().perform();
		Log.info("Hovered a card displayed in Home page");
		addToCartBtn3.click();
		Log.info("add to cart button clicked third item added to cart");
		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cartDropDownBtn.click();
		Log.info("Clicked on Cart Dropdown Button");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}

	public void VerifyRemoveOneItemFromCart() {

		Actions builder = new Actions(driver);
		builder.moveToElement(cartProductImg).build().perform();
		Log.info("Hovered a card displayed in Cart list");
		productCartDeleteIcon.click();
		Log.info("Clicked on Delete item Button");

	}

	public void VerifyBankWirePaymentOption() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", totalElement);

		SummaryProceedCheckoutBtn.click();
		Log.info("Clicked on Summary proceed Button");
		addressProceedCheckoutBtn.click();
		Log.info("Clicked on Address proceed Button");
		TermsCheckbox.click();
		Log.info("Clicked on Terms check Box");
		shippingProceedCheckoutBtn.click();
		Log.info("Clicked on Shipping proceed Button");
		BankWirePaymentOptionBtn.click();
		Log.info("Selected Bank wire payment option");
		confirmOrderBtn.click();
		Log.info("Clicked on confirm order Button");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", orderConfirmElement);
	}

	public void VerifyCheckPaymentOption() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", totalElement);

		SummaryProceedCheckoutBtn.click();
		Log.info("Clicked on Summary proceed Button");
		addressProceedCheckoutBtn.click();
		Log.info("Clicked on Address proceed Button");
		TermsCheckbox.click();
		Log.info("Clicked on Terms check Box");
		shippingProceedCheckoutBtn.click();
		Log.info("Clicked on Shipping proceed Button");
		checkPaymentOptionBtn.click();
		Log.info("Selected Check payment option");
		confirmOrderBtn.click();
		Log.info("Clicked on confirm order Button");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", orderConfirmElement);
	}
}
