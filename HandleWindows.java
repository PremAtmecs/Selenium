package AdvancedSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandleWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Window.html");

        String parentWindow = driver.getWindowHandle();

        WebElement homeButton = driver.findElement(By.id("home"));
        homeButton.click();
        Set<String> handles = driver.getWindowHandles();

        for (String newWindow: handles) {
            driver.switchTo().window(newWindow);
        }

        WebElement image = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[4]/a/img"));
        image.click();
        driver.close();
        driver.switchTo().window(parentWindow);


        WebElement multipleWindows = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
        multipleWindows.click();
        Thread.sleep(4000);
        int numOpen = driver.getWindowHandles().size();
        System.out.println(numOpen);

        WebElement dontClose = driver.findElement(By.id("color"));
        dontClose.click();
        Thread.sleep(4000);

        Set <String> newHandles = driver.getWindowHandles();
        for (String allWindows: newHandles) {
            if (!allWindows.equals(parentWindow)){
                driver.switchTo().window(allWindows);
                driver.close();
            }
            
        }
    }
}
