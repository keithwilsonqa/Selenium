package BetAmericaTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by keith.wilson on 6/9/17.
 */
public class WilsonSeleniumProject_Chrome {

    public static void main(String[] args) {

        String betAmericaURL = "https://www.BetAmerica.com";
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver ", "/Users/keith.wilson/Desktop/Selenium/drivers/chromedriver");
        driver = new ChromeDriver();

        driver.get(betAmericaURL);
    }
}