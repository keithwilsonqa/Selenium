package BetAmericaTests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by keith.wilson on 6/8/17.
 */
public class WilsonSeleniumProject_FireFox {

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

        // Registration widget
        Thread.sleep(2000);
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("date-of-birth")).click();
        driver.findElement(By.cssSelector("html.mac.firefox.firefox46.gecko.gecko46.cssanimations.no-touchevents body#top.anchor.modal-open div#register-modal.modal.fade.register-modal.in div.modal-dialog div.modal-content div.modal-body div.row div.col-sm-12 form.form-group div.row div.col-sm-4 input#date-of-birth.form-control.hasDatepicker")).sendKeys(dateOfBirth);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div")).click();
        driver.findElement(By.id("submit-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("submit-button")).click();

        // Wait for reg page to load
        Thread.sleep(4000);

        // Registration page
        driver.findElement(By.id("homeAddrStreetName")).sendKeys(address);
        driver.findElement(By.id("homeCity")).sendKeys(city);

        // State dropdown
        //     Thread.sleep(1000);
        //Select select = new Select((driver.findElement(By.id("homeStateDropdown"))));
        //Select select = new Select(driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/ng-include/form/div[5]/div[5]/div/select")));
        //select.deselectAll();
        //select.selectByVisibleText("Kentucky");
        //     Select select = new Select(driver.findElement(By.id("homeStateDropdown")));
        //select.deselectAll();
        //     driver.findElement(By.id("homeStateDropdown")).click();
        //     Thread.sleep(3000);
        //driver.findElement(By.id("homeStateDropdown")).click();
        //     select.selectByVisibleText("Kentucky");
        //System.out.println("Before select");
        //select.selectByIndex(17);
        //System.out.println("After select");
        //select.selectByValue("object:137");

        Thread.sleep(1000);
        driver.findElement(By.id("homePostCode")).sendKeys(zipCode);
        driver.findElement(By.id("phoneNum")).sendKeys(randomPhoneNumber);
        driver.findElement(By.id("emailConfirm")).sendKeys(email);
        driver.findElement(By.id("username")).sendKeys(randomUserName);
        driver.findElement(By.id("password")).sendKeys("password1");
        driver.findElement(By.id("passwordVerification")).sendKeys("password1");
        driver.findElement(By.id("ssn")).sendKeys(ssn);

        // Assert autofills
        Assert.assertEquals(firstName,driver.findElement(By.id("firstName")).getAttribute("value"));
        Assert.assertEquals(lastName,driver.findElement(By.id("lastName")).getAttribute("value"));
        Assert.assertEquals(email,driver.findElement(By.id("emailConfirm")).getAttribute("value"));
        Assert.assertEquals(address,driver.findElement(By.id("homeAddrStreetName")).getAttribute("value"));
        Assert.assertEquals(city,driver.findElement(By.id("homeCity")).getAttribute("value"));
        Assert.assertEquals(zipCode,driver.findElement(By.id("homePostCode")).getAttribute("value"));
        Assert.assertEquals(ssn,driver.findElement(By.id("ssn")).getAttribute("value"));
        Assert.assertEquals(randomUserName,driver.findElement(By.id("username")).getAttribute("value"));
        Assert.assertEquals(randomPhoneNumber,driver.findElement(By.id("phoneNum")).getAttribute("value"));

        //Submit
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/ng-include/form/div[22]/div/button")).click();

        //Close browser
        Thread.sleep(5000);
        driver.quit();
    }
}