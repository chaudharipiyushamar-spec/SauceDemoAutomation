package com.saucedemo.hooks;

import com.saucedemo.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private WebDriver driver;

    @Before
    public void setup() {
        // System variables or config files can change this dynamically
        driver = DriverFactory.initDriver("chrome");
    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Capture screenshot for Extent Reports if test fails
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        if (driver != null) {
            driver.quit();
        }
    }
}