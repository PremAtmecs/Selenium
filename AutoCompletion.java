package AdvancedSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoCompletion {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/autoComplete.html");

        WebElement auto = driver.findElement(By.id("tags"));
        auto.sendKeys("c");
        Thread.sleep(4000);


        List<WebElement> opt = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
        System.out.println(opt.size());
        for (WebElement webElement : opt) {
            if (webElement.getText().equals("Cucumber")){
                webElement.click();

                System.out.println(webElement.getText());
                break;

            }

        }

    }
}
