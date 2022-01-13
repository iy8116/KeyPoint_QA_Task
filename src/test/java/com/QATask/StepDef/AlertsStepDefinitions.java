package com.QATask.StepDef;

import com.QATask.Pages.AlertsPage;
import com.QATask.Utils.BrowserUtils;
import com.QATask.Utils.ConfigurationReader;
import com.QATask.Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertsStepDefinitions {

    AlertsPage alertsPage = new AlertsPage();


    @Given("the user is on the ToolsQA main page")
    public void the_user_is_on_the_tools_qa_main_page() {
        Driver.getDriver().get(ConfigurationReader.get("task2aUrl"));

            }
    @When("the user clicks Alerts, Frame  & Windows")
    public void the_user_clicks_alerts_frame_windows() {
        alertsPage.alertFrameWindows.click();

    }
    @When("the user clicks Alerts button")
    public void the_user_clicks_alerts_button() {
        BrowserUtils.scrollToElement(alertsPage.alertsButton);
        alertsPage.alertsButton.click();

    }
    @When("the user clicks first Click me button")
    public void the_user_clicks_first_click_me_button() {
        BrowserUtils.scrollToElement(alertsPage.mainHeader);
        alertsPage.firstClickMeButton.click();

    }
    @Then("the user should clicks OK button from the alert")
    public void the_user_should_clicks_ok_button_from_first_alert() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }

    @When("the user clicks second Click me button")
    public void the_user_clicks_second_click_me_button() {
        BrowserUtils.scrollToElement(alertsPage.mainHeader);
        alertsPage.secondClickMeButton.click();
    }


    @When("the user clicks third Click me button")
    public void the_user_clicks_third_click_me_button() {
        alertsPage.thirdClickMeButton.click();
    }

    @Then("the user should see You selected Ok text message")
    public void the_user_should_see_you_selected_Ok_text_message() {

        assertTrue("You selected Ok", alertsPage.confirmText.isDisplayed());


    }
    @When("the user clicks fourth Click me button")
    public void the_user_clicks_fourth_click_me_button() {
        alertsPage.fourthClickMeButton.click();

    }
    @When("the user input Ibrahim")
    public void the_user_input_ibrahim() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys("Ibrahim");


    }


    @Then("the user should see You entered Ibrahim text message")
    public void the_user_should_see_you_entered_ibrahim_text_message() {
        BrowserUtils.waitForVisibility(alertsPage.promptText, 10);
        assertTrue("You entered Ibrahim", alertsPage.promptText.isDisplayed());

    }
}
