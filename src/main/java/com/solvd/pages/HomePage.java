package com.solvd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By loginButton1 = By.xpath("/html/body/header/div/div/div[3]/a[7]/i");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPopUp clickLoginButton1() {

        driver.findElement(loginButton1).click();
        return new LoginPopUp(driver);
    }


}
