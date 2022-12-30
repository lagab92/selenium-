package Baic_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {

    public static void main(String[] args) throws InterruptedException {



        // interface                // class
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize(); // this is optional

        driver.get("https://amazon.com");

        driver.manage().deleteAllCookies(); // this is optional

    WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
      // to look for the elemnt we need a tag attribute and the value to uniquly identified

    element.click();

    element.sendKeys("gun");

    element.sendKeys(Keys.ENTER);

   // Thread.sleep(5000); // this will stop for 5 second but its not recommende to doit ata any point

   // driver.close();









        /*
        dry run is to do the test cases manually
        * First Test Case : go to google.com and search fo the term tv
        * 1. Open the browser
        * 2. Navigate to google.com
        * 3. Type in the term inside the search box
        * 4. Click on the search button or hit enter
        * 5. Close the browser
        *
         */




    }
}
