package AdvancedSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FrameHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/frame.html");


        driver.switchTo().frame(0);
        WebElement button1 = driver.findElement(By.id("Click") ); //.getText to get a visible text
        button1.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        WebElement nested = driver.findElement(By.id("Click1"));
        nested.click();

        driver.switchTo().defaultContent();

         List<WebElement> tagNumbers =driver.findElements(By.tagName("iframe"));
         int size = tagNumbers.size();
        System.out.println(size);
    }
}
