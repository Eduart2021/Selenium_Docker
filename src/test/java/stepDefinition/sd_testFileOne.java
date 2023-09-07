package stepDefinition;

import Page.LandingOne.landingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import java.io.IOException;
import static WebDriver.web.driver;

public class sd_testFileOne {

    landingPage lp = new landingPage();

    @Given("^the google website$")
    public void staring(){
        System.out.println("SD starting google");
        String n = lp.startNew();
        System.out.println("name is " + n );
    }

    @When("^next step$")
    public void getTitle() throws IOException, InterruptedException {
      lp.sendKeys("Harry Potter");
      lp.screenShot();
    }

}
