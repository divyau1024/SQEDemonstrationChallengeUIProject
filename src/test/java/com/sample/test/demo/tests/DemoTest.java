package com.sample.test.demo.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sample.test.demo.TestBase;
import com.sample.test.pages.PizzaOrderPage;

public class DemoTest extends TestBase {

	PizzaOrderPage orderPage;
	
    @Test
    public void demoTest() {
        System.out.println("HELLO WORLD");
    }
    
    /**
     * Test to validate the successful order of pizza
     * @throws InterruptedException
     */
    
    @Test
    public void test_verifySuccessFulOrderingOfPizza() throws InterruptedException {
    	
    	orderPage.selectPizza("Small 6 Slices - no toppings $6.75");
    	orderPage.selectToppings1("Diced Mango");
    	orderPage.selectToppings2("Mushrooms");
    	orderPage.enterPizzaQuantity("1");
    	orderPage.clickOnCost();
    	orderPage.enterName("Divya UddaRaju");
    	orderPage.enterEmail("divyau1024@gmail.com");
    	orderPage.enterPhone("6822385019");
    	orderPage.selectCreditCard();
    	orderPage.clickOnOrder();
		orderPage.verifyOrder("TOTAL: 6.75 Small 6 Slices - no toppings");
		
    }
    
    /**
     * verify successful order of cash pickup
     * @throws InterruptedException
     */
    
    @Test
    public void test_verifySuccessFulOrderingOfPizzaUsingCashPickup() throws InterruptedException {
    	
    	orderPage.selectPizza("Small 6 Slices - no toppings $6.75");
    	orderPage.selectToppings1("Diced Mango");
    	orderPage.selectToppings2("Mushrooms");
    	orderPage.enterPizzaQuantity("1");
    	orderPage.clickOnCost();
    	orderPage.enterName("Divya UddaRaju");
    	orderPage.enterEmail("divyau1024@gmail.com");
    	orderPage.enterPhone("6822385019");
    	orderPage.selectCashPickup();
    	orderPage.clickOnOrder();
		orderPage.verifyOrder("TOTAL: 6.75 Small 6 Slices - no toppings");
		
    }
    
    /**
     * Verify the warning message when mandatory fields are left blank
     * @throws InterruptedException
     */
    @Test
    public void test_verifyUserWarnedWithMissingMandatoryFields() throws InterruptedException {
    	
    	orderPage.selectPizza("Small 6 Slices - no toppings $6.75");
    	orderPage.selectToppings1("Diced Mango");
    	orderPage.selectToppings2("Mushrooms");
    	orderPage.enterPizzaQuantity("1");
    	orderPage.clickOnCost();
    	orderPage.enterEmail("divyau1024@gmail.com");
    	orderPage.selectCreditCard();
    	orderPage.clickOnOrder();
		orderPage.verifyWarningMessage("Missing name Missing phone number");
    }
    
    @BeforeClass
    public void setup() {
    	orderPage = new PizzaOrderPage(getDriver());
    }

}
