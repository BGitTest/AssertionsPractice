package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.time.Duration;

public class RegisterPage extends Utils
{

    String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());

    private final By genderFemale = By.xpath("[for='gender-female']");

    private final By firstName = By.id("FirstName");

    private final By lastName = By.id("LastName");

    private final By dateOfBirthDay = By.name("DateOfBirthDay");

    private final By dateOfBirthMonth = By.name("DateOfBirthMonth");

    private final By dateOfBirthYear = By.name("DateOfBirthYear");

    private final By email = By.id("Email");

    private final By companyName = By.id("Company");

    private final By newsLetter = By.id("Newsletter");

    private final By passWord = By.id("Password");

    private final By confirmPassWord = By.id("ConfirmPassword");

    private final By registerButton = By.name("register-button");

    public void verifyUserIsOnRegistrationPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("Register"));
    }

    public void enterRegistrationDetails()
    {
        clickOnElement(genderFemale);
        type(firstName,"Save");
        type(lastName,"Soil");
        selectFromDropDownByValue(dateOfBirthDay,"12");
        selectFromDropDownByVisibleText(dateOfBirthMonth, "April");
        selectFromDropDownByValue(dateOfBirthYear,"1988");

        //System.out.println(timeStamp);
        type(email, "savesoil" + timeStamp + "@gmail.com");
        type(companyName,"SaveFutureGeneration");
        clickOnElement(newsLetter);
        type(passWord,"123456");
        type(confirmPassWord,"123456");
        clickOnElement(registerButton);

    }

}




