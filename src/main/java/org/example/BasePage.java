package org.example;

import org.openqa.selenium.WebDriver;

public class BasePage
{

 // With Webdriver it's easy to deal with complex elements like checkboxes, dropdowns, alerts
 // Protected keyword is used to make them accessible within the same package and subclasses
 protected static WebDriver driver;
}
