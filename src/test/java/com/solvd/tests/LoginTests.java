package com.solvd.tests;

import com.solvd.pages.LoginPage;
import com.solvd.pages.LoginPopUp;
import driver.DriverSetUp;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class LoginTests extends DriverSetUp {


    @BeforeClass

    @Test
    public void testSuccesfulLogin() {
        LoginPopUp loginPopUp = homePage.clickLoginButton1();
        loginPopUp.setUsername("tbrainovich@hotmail.com");
        loginPopUp.setPassword("tomasb10");
        LoginPage loginPage = loginPopUp.goToLoginPage();
        assertTrue(loginPage.getUserInfo().contains(" tomasbraino - user account"), "Alert, text is incorrect");

    }

    @Test
    public void validateInvalidEmails() {


    }

    @Test
    public void validateEmptyEmailsField() {
        LoginPopUp loginPopUp = homePage.clickLoginButton1();
        loginPopUp.setUsername("");


        assertEquals("", "You must fill this field");
    }

    @Test
    public void validateEmptyNameField() {
    }

    @Test
    public void validateConditions() {
    }

    @AfterClass
    public void quitBrowser() {

    }

}
