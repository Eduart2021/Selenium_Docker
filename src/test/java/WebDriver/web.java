package WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class web {
    public static WebDriver driver;
    @Before
    public void inDriver() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
        driver.get("https://google.com");
        System.out.println("driver started");
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
     @After
    public void quitDriver(){
        driver.quit();
    }
    public static WebDriver getDriver(){
        return driver;
    }

}
