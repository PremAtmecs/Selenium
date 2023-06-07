package AdvancedSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Sortables {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/sortable.html");

        List<WebElement> sortable = driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));

        WebElement fromElement = sortable.get(6);

        WebElement toElement = sortable.get(0);

        Actions actions = new Actions(driver);
        actions.clickAndHold(fromElement);
        actions.moveToElement(toElement);
        actions.release(toElement);
        actions.build().perform();

    }
}
