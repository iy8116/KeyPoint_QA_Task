package com.QATask.StepDef;

import com.QATask.Utils.BrowserUtils;
import com.QATask.Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUpScenario(){

        System.out.println("---Setting up browser with further details...");
    }

    @After
    public void tearDownScenario(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }
        BrowserUtils.waitFor(1);
        Driver.closeDriver();
    }
}