package com.solvd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPopUp {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"login-active\"]/span")
    private WebElement loginButton;

    @FindBy (id = "login-popup2")
    private WebElement popUp;

    @FindBy (id = "email")
    private WebElement email;

    @FindBy (id = "upass")
    private WebElement upass;

    @FindBy (id = "nick-submit")
    private WebElement submitButton;

    public LoginPopUp(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(By.id(email)).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement((By) upass).sendKeys((CharSequence) upass);
    }

    public LoginPage goToLoginPage() {
        driver.findElement((By) submitButton).click();
        return new LoginPage(driver);
    }

}
