package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuickLeaf {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Link.html");
      //  driver.findElement(By.linkText("Go to Home Page")).click();
        driver.findElement(By.partialLinkText("Home Page")).click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }
}
