package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FirstSelenium {
    public static void main(String[] args) throws IOException {
        // WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = null;
        FileInputStream inputStream = new FileInputStream("C:\\Users\\lokesh.chandramurthy\\IdeaProjects\\BasicTest\\src\\main\\java\\SeleniumBasics\\config.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        String browser = properties.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        else if(browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get("https://www.google.co.in/");
        driver.findElement(By.name("q")).sendKeys("Dhoni" + Keys.ENTER);
        driver.close();
    }
}

