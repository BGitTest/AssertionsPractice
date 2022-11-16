package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils
{

    private final By registerButton = By.className("ico-register");
public void verifyRegisterButtonPresent()
{
    waitForUrlToBe("https://demo.nopcommerce.com/", 20);

    Assert.assertEquals(getTextFromElement(By.className("ico-register")),"register","register button is not working" );
}

public void clickOnRegisterButton()
{
    clickOnElement(registerButton);
}

}
