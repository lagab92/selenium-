package junit_with_selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JUnitWithSelenium {
           public static WebDriver driver;
           // every single selenuim needs these folowing codes
     @Before
    public  void LunchBrowser(){  // always name your methode with what you are working on

        driver= new ChromeDriver();

        driver.get (" https://amazon.com");

        driver.manage().window().maximize();





    }
     @Test
    public void TestAmazon () throws InterruptedException {    // alawys name your methode test when @test is above

           WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
           Thread.sleep(5000);
           searchBox.click();
           Thread.sleep(5000);
           searchBox.sendKeys("Blinds");
           Thread.sleep(5000);
           driver.findElement(By.id("nav-search-submit-button")).click();
           Thread.sleep(5000);

     }

     @After
     public void closeUp (){
        //  driver.quit(); we only use this one line code for all driver except chrom
         // close will close the correct seession of the browser but quit will close the whole drive
         // we use close for all drivers except chrome and in that case we can use if and else
         if ( driver instanceof ChromeDriver){
             driver.quit();

         }else {
             driver.close();
         }
     }






}
