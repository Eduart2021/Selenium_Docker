package TestNG_sample.dragAndDrop;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;

import static WebDriver.web.driver;

public class dragndrop  {

    LocalDate date = LocalDate.now();

    //TestNG scenario
    @Test
    public void WebDnD() throws IOException {
        //Remote Web driver
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        //xpath for elements
        By element1 = By.xpath("//li[@id=\"fourth\"][2]");
        By destEl1 = By.xpath("//ol[@id=\"amt7\"]");
        By element2 = By.xpath("//li[@id=\"credit2\"]/a");
        By destEl2 = By.xpath("//ol[@id=\"bank\"]");

        //find webElement
        WebElement from = driver.findElement(element1);
        WebElement to = driver.findElement(destEl1);
        WebElement from2 = driver.findElement(element2);
        WebElement to2 = driver.findElement(destEl2);

        //Action class for drag and drop
        Actions act = new Actions(driver);

        //drag and drop action
        act.dragAndDrop(from, to).build().perform();
        act.dragAndDrop(from2, to2).build().perform();

        //take screenshot on page
        TakesScreenshot sk = (TakesScreenshot) driver;
        File screen = sk.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen, new File("src/screenshots/testNG "+ date +".png"));

        driver.quit();
    }



}
