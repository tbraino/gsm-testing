package com.solvd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private By userInfo = By.className("article-info-name");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUserInfo() {
        return driver.findElement(userInfo).getText();
    }
}
