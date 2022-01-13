package com.QATask.StepDef;

import com.QATask.Pages.DroppablePage;
import com.QATask.Utils.BrowserUtils;
import com.QATask.Utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.interactions.Actions;

public class DroppableStepDefinitions {

    DroppablePage droppable = new DroppablePage();

    @When("the user clicks Interactions")
    public void the_user_clicks_interactions() {
        droppable.interactions.click();
        BrowserUtils.scrollToElement(droppable.droppableButton);
    }

    @When("the user clicks Droppable")
    public void the_user_clicks_droppable() {

        droppable.droppableButton.click();

    }
    @When("the user drags the box and drops the dropbox.")
    public void the_user_drogs_the_box_and_drops_the_dropbox() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(droppable.dragMe).clickAndHold().moveToElement(droppable.dropHere).pause(2000).release().perform();

        BrowserUtils.waitForVisibility(droppable.droppedText, 5);

    }
    @Then("the user verifies the box dragged & dropped.")
    public void the_user_verifies_the_box_dragged_dropped() {

        assertTrue("Dropped!", droppable.droppedText.isDisplayed());

    }
}
