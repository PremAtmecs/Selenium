package AdvancedSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class Selectables {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/selectable.html");

        List<WebElement> select = driver.findElements(By.xpath("//*[@id='selectable']/li"));
        int size= select.size();
        System.out.println(size);

        Actions actions = new Actions(driver);
       // actions.keyDown(Keys.CONTROL).click(select.get(0)).click(select.get(1)).click(select.get(2)).build().perform();
        actions.clickAndHold(select.get(0)).clickAndHold(select.get(1)).build().perform();
    }
}
