package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/checkbox.html");

        WebElement language = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input"));
        language.click();

        WebElement Check = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div"));
        boolean type = Check.isSelected();
        System.out.println(type);

        WebElement unSelect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input[1]"));
        if(unSelect.isSelected()){
                unSelect.click();
    }
        WebElement select = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[3]/input[2]"));
        if (select.isSelected()){
            select.click();
        }
    }
}
