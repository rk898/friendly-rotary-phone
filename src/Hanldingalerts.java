import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hanldingalerts {

    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();

        driver.findElement(By.id("promtButton")).click();
        driver.switchTo().alert().sendKeys("Rahul Kumar");
        String A= driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        System.out.println(" Text of alert " + A );
        driver.close();
    }
}
