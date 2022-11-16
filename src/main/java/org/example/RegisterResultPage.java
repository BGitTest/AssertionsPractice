package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils
{
    private final By resultMessage = By.className("result");

    static String expectedMessage = "Your registration completed" ;

    public void verifyUserRegisteredSuccessfully() {
        waitForUrlToBe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", 20);
    }
    public void verifyRegisteredMessageDisplayed()
    {
        String registeredMessage = getTextFromElement(resultMessage);
        Assert.assertEquals(registeredMessage,expectedMessage);
    }
}
