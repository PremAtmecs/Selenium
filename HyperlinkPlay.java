package AdvancedSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HyperlinkPlay {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.leafground.com/pages/Link.html");
        // driver.get("http://www.leafground.com/pages/Link.html");

        WebElement home = driver.findElement(By.linkText("Go to Home Page"));
        home.click();
        driver.navigate().back();

        WebElement whereTo = driver.findElement(By.partialLinkText("Find where am"));
        String wr = whereTo.getAttribute("href");
        System.out.println(wr);

        WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
        brokenLink.click();
        String Title = driver.getTitle();
        if (Title.contains("404")){
            System.out.println("Broken link exists");
        }
        driver.navigate().back();
        WebElement home1 = driver.findElement(By.linkText("Go to Home Page"));
        home1.click();
        driver.navigate().back();

        List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
       int count = totalLinks.size();
        System.out.println(count);
    }
}
