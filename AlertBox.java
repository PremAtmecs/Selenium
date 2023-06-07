package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Alert.html");

        WebElement alertBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
        alertBox.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(4000);
        alert.accept();

        WebElement confirmBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
        confirmBox.click();
        Alert confirm = driver.switchTo().alert();
        Thread.sleep(4000);
        confirm.dismiss();

        WebElement promptBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
        promptBox.click();
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("MSD");
        prompt.accept();
    }
}
