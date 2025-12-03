import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty( "webDriver.chrome.driver", "C:\\Users\\Rahul Kumar\\eclipse-workspace\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        Thread.sleep(5000);

        driver.get("https://www.flipkart.com/?redirectFrom=logout");
        System.out.println( driver.getTitle());

        driver.manage().window().maximize();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[@class=\"_1TOQfO\" and @title=\"Login\"]")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class=\"r4vIwl BV+Dqf\"]")).sendKeys("rk0585870@gmail.com");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class=\"QqFHMw twnTnD _7Pd1Fp\"]")).click();

        Thread.sleep(4000);
        driver.quit();
    }
}
