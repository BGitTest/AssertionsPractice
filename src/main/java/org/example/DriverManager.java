package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager extends Utils
{
  public void openBrowser()
  {
      //Path is used to open the Chromebrowser
      System.setProperty("webDriver.chrome.driver", "src/test/java/driver/chromedriver.exe");

      //calling particular browser and it should execute without any issue
      driver = new ChromeDriver();

      // manage() - returns instance of options,
      // window() - returns instance of window and
      // maximize() - this method is used to maximize
      driver.manage().window().maximize();

      //opening homepage with .get
       driver.get("https://demo.nopcommerce.com/");
     // driver.get("http://omayo.blogspot.com/\n");

      // Implicit Wait is used to wait for a certain measure of time before throwing an exception
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
  public void closeBrowser()
  {
     driver.quit();
  }

}
