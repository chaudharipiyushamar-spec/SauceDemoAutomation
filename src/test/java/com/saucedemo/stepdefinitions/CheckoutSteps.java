package com.saucedemo.stepdefinitions;

import com.saucedemo.pages.*;
import com.saucedemo.utils.DriverFactory;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class CheckoutSteps {
    
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private InventoryPage inventoryPage = new InventoryPage(DriverFactory.getDriver());
    private CheckoutPage checkoutPage = new CheckoutPage(DriverFactory.getDriver());

    @Given("User is on the SauceDemo login page")
    public void user_is_on_the_saucedemo_login_page() {
        DriverFactory.getDriver().get("https://www.saucedemo.com/");
    }

    @When("User logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        loginPage.enterCredentials(username, password);
        loginPage.clickLogin();
    }

    @When("User adds {string} to the cart")
    public void user_adds_to_the_cart(String itemName) {
        inventoryPage.addBackpackToCart();
    }

    @When("User navigates to the shopping cart")
    public void user_navigates_to_the_shopping_cart() {
        inventoryPage.goToCart();
    }

    @When("User proceeds to checkout")
    public void user_proceeds_to_checkout() {
        checkoutPage.clickCheckout();
    }

    @When("User fills checkout information with {string}, {string}, and {string}")
    public void user_fills_checkout_information(String fname, String lname, String zip) {
        checkoutPage.fillInformation(fname, lname, zip);
        checkoutPage.clickContinue();
    }

    @When("User completes the purchase")
    public void user_completes_the_purchase() {
        checkoutPage.clickFinish();
    }

    @Then("The confirmation message {string} should be displayed")
    public void the_confirmation_message_should_be_displayed(String expectedMessage) {
        String actualMessage = checkoutPage.getConfirmationMessage();
        // TestNG Assertion
        Assert.assertEquals(actualMessage, expectedMessage, "Checkout was unsuccessful!");
    }
}