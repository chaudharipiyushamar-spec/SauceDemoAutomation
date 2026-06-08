# SauceDemo Automation Framework 🚀

A robust, highly scalable **Hybrid BDD-POM (Behavior Driven Development - Page Object Model)** Automation Framework built from scratch to test the end-to-end user journey on the SauceDemo (Swag Labs) e-commerce application.

---

## 🛠️ Tech Stack & Tools
* **Language:** Java (JDK 11+)
* **Core Automation:** Selenium WebDriver (v4.x)
* **Test Architecture:** Cucumber BDD (with Gherkin syntax)
* **Test Runner & Assertions:** TestNG
* **Build & Dependency Management:** Maven
* **Logging:** Log4j2
* **Reporting:** Extent Reports

---

## 🏗️ Framework Architecture Features

* **Page Object Model (POM):** Clean separation of UI element locators and component-specific actions, ensuring minimal maintenance overhead.
* **BDD Cucumber Integration:** Test scenarios are mapped in plain, human-readable Gherkin syntax within feature files to enhance collaboration across teams.
* **Flake-Free Execution:** Custom synchronization utility methods implementing **Explicit and Fluent Waits** to manage dynamic DOM rendering asynchronously.
* **Robust Reporting:** Generates interactive HTML **Extent Reports** featuring automated conditional screenshot capturing at the exact moment a test fails.
* **Thread-Safe Framework Design:** Designed with a structural foundation using Java's `ThreadLocal` patterns to seamlessly support secure cross-browser parallel testing execution.

---

## 📂 Project Directory Structure

```text
SauceDemoAutomation/
│
├── src/
│   ├── main/java/          # Page Objects, Base Configurations, Utilities
│   ├── main/resources/     # Log4j2 configurations, Environment Properties
│   ├── test/java/          # Step Definitions, Test Runners (TestNG)
│   └── test/resources/     # Gherkin Feature Files (*.feature)
│
├── .gitignore              # Ignored compilation files, target folders, and reports
├── pom.xml                 # Maven configuration and dependencies mapping
└── README.md               # Framework documentation


