## Demo Challenge

#### Instructions
1. Complete the project setup as listed below
2. Complete the Excerise
3. Email a synopsis of your work and the link to your git repo containing the completed exercise to: sqedemonstrationchallenge@nbcuni.com


#### Expectations
We will be evaluating
1. Naming conventions
2. Code readability
3. Code encapsulation
4. Code structure and organization
5. Quality of test cases
6. Variety  of testing types (examples: boundary, happy path, negative, etc) 


#### Technologies
1. Java
2. Selenium
3. TestNG
4. Any other technologies you see fit.
5. Please do not use a BDD framework.

#### Project Setup
1. Clone this project to your git account in a public repo
2. Setup the project in your IDE
3. Open the index.html file from src/test/resource/files in a browser
4. Copy the url from the browser and update the url value in src/test/resource/config.properties to be the copied url.
5. In src/test/resources update the config.properties file platform for your OS.
6. From command line run mvn clean install -U -DskipTests
7. Make sure you can run the DemoTest and chrome launches.  You may need to update the chromedriver in /src/test/resources/chromedriver/ to the version that works with your browser
   https://chromedriver.chromium.org/


#### Exercise
1. Use the site at the index.html
2. There are helper locators provided for you in the src/test/resource/files/locators.txt file.
3. In the Test Cases section below:
  - List all of the test cases you think are necessary to test the sample page
  - Note any defects or issues observed
4. Code up a few examples of:
  - At least one happy path case placing an order
  - At least one error case
5. When complete please check your code into your public git repo

#### Test Cases

 1. Verify successful order of piza by providing all mandatory fields  -- testcase name -- test_verifySuccessFulOrderingOfPizza
 2. Verify successful order of pizza by seleting an cash option -- testcase name -- test_verifySuccessFulOrderingOfPizzaUsingCashPickup
 3. Verify the user gets an warning message if the mandatory fields are missing -- testcase name -- test_verifyUserWarnedWithMissingMandatoryFields


### Defects

  1. Quantity accept characters and there is no warning message displayed while entering characters
    Expected: Quantity field should accept numbers only and there should be a warning message while entering characters
    Actual:Able to enter characters, special characters in the Quantity field
    
 2. When we select the pizza with Toppings, according to the selection the toppings option should be displayed, for example if select one topping only one should be displayed,       if we select no toppings there should not be any toppings option displayed
 	  Expected: Toppings option must be displayed as per the selected option
 	  Actual: When user is selecting "no toppings" and "one topping", still two topping options are displayed
  
  3.Phone number field accepting characters and special characters
    Expected:Phone number field should not accept any characters
    Actual:Phone number field accepting characters and there is no warning message
    
  4. Clicking on Reset is not resetting the Toppings value.
  	Expected: Toppings1 and Toppings2 values should be reset to "Choose a Toppings1" and "Choose a Toppings2"
 	Actual: Selected Toppings1 and Toppings2 option are retained
    
  5. Order placed for the invalid quantity is successfull
    Expected: There should be a warning message or order should not be successful when an order is placed with invalid quantity
    Actual:When an order is placed with invalid quantity the order is successful.
 
 6. Order is successful without selecting mode of payment
    Expected: Order must be placed with credit card or Cash on pickup
    Actual:Order is placed successfully without selecting the options Credit card or Cash on Pickup

