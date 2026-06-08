package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;

    private By checkoutBtn = By.id("checkout");
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueBtn = By.id("continue");
    private By finishBtn = By.id("finish");
    private By completeHeader = By.className("complete-header");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckout() {
        driver.findElement(checkoutBtn).click();
    }

    public void fillInformation(String fname, String lname, String zip) {
        driver.findElement(firstNameField).sendKeys(fname);
        driver.findElement(lastNameField).sendKeys(lname);
        driver.findElement(postalCodeField).sendKeys(zip);
    }

    public void clickContinue() {
        driver.findElement(continueBtn).click();
    }

    public void clickFinish() {
        driver.findElement(finishBtn).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(completeHeader).getText();
    }
}