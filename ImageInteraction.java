package AdvancedSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageInteraction {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Image.html");

        WebElement image1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
        image1.click();

        WebElement bImage = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
        if (bImage.getAttribute("naturalWidth").equals("0")){
            System.out.println("Image is Broken");
        }else{
            System.out.println("Image is not Broken");
        }
    }
}
