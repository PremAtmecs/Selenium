package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/radio.html");

        WebElement Unchecked = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[2]/input"));
        WebElement Checked = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]/input"));
        boolean type1 = Unchecked.isSelected();
        boolean type2 = Checked.isSelected();
        System.out.println(type1);
        System.out.println(type2);

        WebElement Age = driver.findElement(By.name("age"));
        Age.click();
    }
}

