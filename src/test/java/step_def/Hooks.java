package step_def;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before()
    public void setUp() {
        System.out.println("I am setting up the test from the Hooks class!!!");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("I am reporting the results");

        if (scenario.isFailed()) {
            final byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "screenshot");
        }
        System.out.println("Closing the driver");
        Driver.closeDriver();

    }
}

