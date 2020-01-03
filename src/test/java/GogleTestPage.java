


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

/* Requirements:
   Given User is on Google home page
   When I search text "automated text info"
   Then I should see first link conrains text "automated"
   -----------------------------------------------------------------------------------------------------
   Hints:
   The Class implements the Page
   The Class can return not full Page
   The method has to return Page objects
   The tests run in Test folder
   ----------------------------------------------------------------------------------------------------
 */

public class GogleTestPage {
    private ChromeDriver driver;


    @BeforeSuite     //Managing commands by Chromedriver
    public void beforeSuite(){
        System.setProperty("webdriver.chrome.driver", "C://bin/chromedriver//chromedriver.exe");
    }
    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.pl");
    }


    @Test
    public void testSearch(){
        HomePage home = new HomePage(driver); //Show our starting page and output Driver parameters
        ResultPage result = home.search("automated testing info"); // The homepage will return us a result/ realize code in search method
        Assert.assertTrue(result.getFirstLink().contains("automated"));   // Check the first link which contains "automated"
   }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}


