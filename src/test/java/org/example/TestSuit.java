package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{

  @ Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {

        homePage.verifyRegisterButtonPresent();
        registerPage.enterRegistrationDetails();
        registerResultPage.verifyUserRegisteredSuccessfully();
        registerResultPage.verifyRegisteredMessageDisplayed();

    }
}
