import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Waits{

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.hackerearth.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // ---- FIND THE ELEMENT ----
        try {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,900);");
            js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//a[text()='Typos']")));
            js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[text()='Typos']")));

            System.out.println("FOUND: " );

        } catch (Exception e) {
            System.out.println("Element not found: " + e.getMessage());
        }
        Thread.sleep(3000);
        driver.quit();

    }



}
