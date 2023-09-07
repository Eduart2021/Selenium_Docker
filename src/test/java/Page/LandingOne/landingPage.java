package Page.LandingOne;

import Page.BasePage;
import WebDriver.web;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import static WebDriver.web.driver;

public class landingPage extends BasePage {

    LocalDate date = LocalDate.now();

    public static String startNew(){
      String m =  web.getDriver().getTitle();
        return  "Web title is "+ m;
    }
    public void screenShot() throws IOException {
        TakesScreenshot sk = (TakesScreenshot) web.getDriver();
        File screen = sk.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen, new File("src/screenshots/google_"+ date + ".png"));
        System.out.println("got screenshot");
    }
    public void sendKeys(String name) throws InterruptedException {
        WebElement nameIn = driver.findElement(By.name("q"));
        nameIn.sendKeys(name);
        Thread.sleep(5000);
    }


}
