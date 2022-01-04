package com.solvd.tests;

import driver.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;

public class SignUpTests extends DriverSetUp {

    private WebDriver driver;


    @BeforeSuite //execute first
    @BeforeTest //2nd
    @BeforeClass //3rd
    @BeforeMethod //4th
    @Test //5th
    public void signUpButtonClick() {
    }

    @AfterMethod
    @AfterClass

    @AfterTest

    @AfterSuite
}
