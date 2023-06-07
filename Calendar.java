package AdvancedSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       // driver.get("http://www.leafground.com/pages/Calendar.html");
        driver.navigate().to("http://www.leafground.com/pages/Calendar.html");

        WebElement calendar = driver.findElement(By.id("datepicker"));
        // calendar.sendKeys("12/10/2021" + Keys.ENTER);  IF TEXTBOX AVAILABLE
        calendar.click();

        //WebElement month = driver.findElement(By.xpath("//a = [@title='Next'] "));
        WebElement month = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]"));
        month.click();

       // WebElement date = driver.findElement(By.xpath("//a = [contains(text(),'10')] "));
        WebElement date = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[2]/td[3]/a")) ;
        date.click();
    }
}
