import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Chromedriver input parameters

public class HomePage {
    private WebDriver driver;

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public ResultPage search(String text) {
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(text);
        return new ResultPage(driver);
    }
}
