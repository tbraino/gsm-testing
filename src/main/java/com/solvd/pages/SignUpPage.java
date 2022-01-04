package com.solvd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

    WebDriver driver;
    @FindBy (xpath = "//*[@id=\"uname\"]")
    private WebElement uName;

    @FindBy (xpath = "//*[@id=\"email\"]")
    private WebElement email;

    @FindBy (xpath = "//*[@id=\"upass\"]")
    private WebElement password;


    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }



}
