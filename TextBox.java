package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Edit.html");
       /* driver.findElement(By.id("email")).sendKeys("Textbox@gmail.com");
        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
       String value = driver.findElement(By.name("username")).getAttribute("value");
        System.out.println(value);
        driver.findElement(By.name("username")).clear(); */
        //Above method clears the value text box as both names are same

        //Iterative method

        WebElement emailbox = driver.findElement(By.id("email"));
        emailbox.sendKeys("practice@loki.com");

        WebElement appendbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
        appendbox.sendKeys("hi");

        WebElement defaultbox = driver.findElement(By.name("username"));
       String value = defaultbox.getAttribute("value");
        System.out.println(value);

        WebElement clearbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
        clearbox.clear();

        WebElement disabledbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
         Boolean result = disabledbox.isEnabled();
        System.out.println(result);
    }
}
