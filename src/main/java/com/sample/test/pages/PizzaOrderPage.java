package com.sample.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



public class PizzaOrderPage extends BasePage {

	public PizzaOrderPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "pizza1Pizza")
	private WebElement _selectPizza;

	@FindBy(xpath = "//div[@id='pizza1']//select[@class='toppings1']")
	private WebElement _selectToppings1;

	@FindBy(xpath = "//div[@id='pizza1']//select[@class='toppings2']")
	private WebElement _selectToppings2;

	@FindBy(id = "pizza1Qty")
	private WebElement _txtQuantity;

	@FindBy(id = "pizza1Cost")
	private WebElement _txtCost;

	@FindBy(id = "name")
	private WebElement _txtName;

	@FindBy(id = "email")
	private WebElement _txtEmail;

	@FindBy(id = "phone")
	private WebElement _txtPhone;

	@FindBy(id = "ccpayment")
	private WebElement _radioCredit;
	
	@FindBy(id="cashpayment")
	private WebElement _radioCashPickup;

	@FindBy(id = "placeOrder")
	private WebElement _btnOrder;

	@FindBy(xpath = "//div[@id='dialog']/p")
	private WebElement _txtOrderContent;

	public void selectPizza(String value) {
		_selectPizza.click();
		_selectPizza.sendKeys(value);
	}

	public void selectToppings1(String value) {
		_selectToppings1.click();
		_selectToppings1.sendKeys(value);
		_selectToppings1.click();
	}

	public void selectToppings2(String value) {
		_selectToppings2.click();
		_selectToppings2.sendKeys(value);
		_selectToppings2.click();
	}

	public void enterPizzaQuantity(String value) {
		_txtQuantity.sendKeys(value);
	}

	public void enterPizzaCost(String value) {
		_txtCost.sendKeys(value);
	}

	public void enterName(String value) {
		_txtName.sendKeys(value);
	}

	public void enterEmail(String value) {
		_txtEmail.sendKeys(value);
	}

	public void enterPhone(String value) {
		_txtPhone.sendKeys(value);
	}

	public void selectCreditCard() {
		_radioCredit.click();
	}

	public void clickOnCost() {
		_txtCost.click();
	}

	public void clickOnOrder() {
		_btnOrder.click();
	}

	public void verifyOrder(String expected) {
		String value = _txtOrderContent.getText();
		System.out.println(" content " + value);
		Assert.assertEquals(value, "Thank you for your order! " + expected);
	}

	public void verifyWarningMessage(String expected) {
		String value = _txtOrderContent.getText();
		System.out.println(" content " + value.replace("\n", " "));
		Assert.assertEquals(value.replace("\n", " "),expected);
	}

	public void selectCashPickup() {
		_radioCashPickup.click();
	}
}
