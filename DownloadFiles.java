package AdvancedSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DownloadFiles {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/download.html");


        WebElement download = driver.findElement(By.linkText("Download PDF"));
        download.click();


        File fileLocation = new File("C:\\Users\\lokesh.chandramurthy\\Downloads");
        File[] numFiles = fileLocation.listFiles();
        for (File file :  numFiles  ) {
            file.getName().equals("testleaf.pdf");
            System.out.println("File prsent");
            break;

        }
    }
}
