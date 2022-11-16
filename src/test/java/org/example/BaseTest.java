package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {

    DriverManager driverManager = new DriverManager();
    HomePage homePage = new HomePage();

    // Utils utils = new Utils();

    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();


    @BeforeMethod
    public void setUp() {
        driverManager.openBrowser();

    }

    @AfterMethod
    public void tearDown() {
        driverManager.closeBrowser();
    }

}

