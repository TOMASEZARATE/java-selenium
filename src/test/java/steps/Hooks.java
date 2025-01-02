package steps;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
 
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.basePage;

public class Hooks extends basePage {
    
    public Hooks() {
        super(driver);
    }
    
    @Before
    public void setUp() {
        initializeDriver();
        maximizeWindow();
        setImplicitWait(10);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.log("El escenario fallo, revisar screenshot");
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot of the error");
        }
        basePage.close_browser();
    }
}