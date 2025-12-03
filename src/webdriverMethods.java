import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        Thread.sleep(5000);

        driver.get("https://www.flipkart.com/?redirectFrom=logout");

        driver.quit();
    }
}
