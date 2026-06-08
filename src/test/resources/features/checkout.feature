@Regression @Checkout
Feature: SauceDemo Purchase End-to-End Workflow

  Scenario: User purchases an item successfully
    Given User is on the SauceDemo login page
    When User logs in with username "standard_user" and password "secret_sauce"
    And User adds "Sauce Labs Backpack" to the cart
    And User navigates to the shopping cart
    And User proceeds to checkout
    And User fills checkout information with "John", "Doe", and "12345"
    And User completes the purchase
    Then The confirmation message "Thank you for your order!" should be displayed