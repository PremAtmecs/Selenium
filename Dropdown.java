package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Dropdown.html");

        WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
        Select option = new Select (dropDown1);
        option.selectByIndex(2);
        //Thread.sleep(4000);
        option.selectByValue("1");
        //Thread.sleep(4000);
        option.selectByVisibleText("Loadrunner");

        List<WebElement>  selectopt = option.getOptions();
        int size = selectopt.size();
        System.out.println(size);

        dropDown1.sendKeys("Selenium");

        WebElement multiselect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
       Select multiSelect1 = new Select(multiselect);
        multiSelect1.selectByIndex(2);
        multiSelect1.selectByIndex(1);

    }
}
