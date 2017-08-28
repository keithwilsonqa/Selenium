package BetAmericaTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by keith.wilson on 6/12/17.
 */
public class WilsonSeleniumProject_FireFox1 {
    public static void main(String[] args) throws InterruptedException {

        Utilities util = new Utilities();

        // Variables
        String betAmericaURL = "https://www.BetAmerica.com/";
        String firstName = "Joe";
        String lastName = "Dirt";
        String email = "Random0123456789@twinspires.com";
        String address = "321 Major Wager Rd";
        String city = "Louisville";
        String zipCode = "40222";
        String dateOfBirth = util.getRandomDOB();
        String randomUserName = util.getRandomUsername();
        String randomPhoneNumber = util.getRandomPhoneNumber();
        String ssn = "1875";

        // Setup WebDriver
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "/Users/keith.wilson/Desktop/Selenium/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        // Navigate to BetAmerica and select registration
        driver.get(betAmericaURL);
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/nav/div/div[2]/form/a")).click();

        // Menu








    }
}
