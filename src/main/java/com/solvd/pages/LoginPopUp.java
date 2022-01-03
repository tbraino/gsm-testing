package com.solvd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPopUp {
    WebDriver driver;
    private By usernameField = By.id("email");
    private By passwordField = By.id("upass");
    private By loginButton2 = By.id("nick-submit");

    public LoginPopUp(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public LoginPage goToLoginPage() {
        driver.findElement(loginButton2).click();
        return new LoginPage(driver);
    }

}
