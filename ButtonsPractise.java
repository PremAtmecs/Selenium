package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsPractise {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Button.html");

        WebElement ButtonPosition = driver.findElement(By.id("position")); //position of button
        Point xy = ButtonPosition.getLocation(); // location must
        int xvalue =  xy.getX();  // get x coordinate
        int yvalue  = xy.getY();  //get y coordinate
        System.out.println(xvalue  +  yvalue); // print those

        WebElement ButtonColor = driver.findElement(By.id("color"));
        String color = ButtonColor.getCssValue("background-color");
        System.out.println(color);

        WebElement ButtonSize = driver.findElement(By.id("size"));
        int height = ButtonSize.getSize().getHeight();
        int width = ButtonSize.getSize().getWidth();
        System.out.println(height  +  width);

        WebElement clickButton = driver.findElement(By.id("home"));
        clickButton.click();

    }
}
