package com.solvd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private WebDriver driver;

    //switch to @FindBy annotation
    @FindBy (xpath = "//*[@id=\"login-active\"]/span")
    private WebElement loginButton1;

    @FindBy (xpath = "")
    private WebElement signUpButton;

    @FindBy (xpath = "")
    private WebElement searchField;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPopUp clickLoginButton1() {

        driver.findElement(loginButton1).click();
        return new LoginPopUp(driver);
    }

    public SignUpButton clickSignUpButton(){
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    public SearchField clickSearch(){
        driver.findElement(searchField).click();
        return new SearchField(driver);
    }

}
