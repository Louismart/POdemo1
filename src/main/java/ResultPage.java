import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collection;

public class ResultPage {
    private WebDriver driver;
   // private WebDriverWait wait;
   // private By firstlink = By.xpath("//*[@class='bkWMgd']/div[@class='g']//a/h");

    public ResultPage(WebDriver driver) {
        this.driver = driver;
      //  this.wait = new WebDriverWait(this.driver, 10);
    }

    public String getFirstLink() {
       // WebElement result = wait.until(ExpectedConditions.presenceOfElementLocated(firstlink));
        return driver.findElement(By.xpath("//*[@class='bkWMgd']/div[@class='g']//a/h")).getText();  ////*[@id='rso']//a[1]
    }
}
