package AdvancedSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/tooltip.html");

        //With Attributes
       WebElement tip = driver.findElement(By.id("age"));
        String textTIP = tip.getAttribute("title");
        System.out.println(textTIP);

        //Without Attributes
        Actions actions = new Actions(driver);
        tip = driver.findElement(By.id("age"));
         actions.moveToElement(tip).perform();
         WebElement text = driver.findElement(By.className("ui-helper-hidden-accessible"));
        System.out.println(text.getText());
    }
}
