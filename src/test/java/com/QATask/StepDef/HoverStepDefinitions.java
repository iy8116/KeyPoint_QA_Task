package com.QATask.StepDef;

import com.QATask.Pages.HoverPage;
import com.QATask.Utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;


public class HoverStepDefinitions {

    HoverPage hoverPage = new HoverPage();

    @When("the user clicks Widgets")
    public void the_user_clicks_widgets() {

        hoverPage.widgets.click();

    }

    @When("the user clicks ToolTips")
    public void the_user_clicks_tool_tips() {

        hoverPage.widgetsDropDown.click();
        BrowserUtils.scrollToElement(hoverPage.tooltips);
        hoverPage.tooltips.click();
    }

    @When("the user hovers  on the button")
    public void the_user_hovers_on_the_button() {

        BrowserUtils.hover(hoverPage.hoverButton);
        BrowserUtils.waitForVisibility(hoverPage.buttonText,10);
    }

    @Then("the user should see {string} message next to button")
    public void the_user_should_see_message_next_to_button(String expectedButtonText) {

        assertEquals(expectedButtonText, hoverPage.buttonText.getText());
        System.out.println(hoverPage.buttonText.getText());
    }

    @When("the user hovers  on the text field")
    public void the_user_hovers_on_the_text_field() {

        BrowserUtils.hover(hoverPage.hoverTextField);
        BrowserUtils.waitForVisibility(hoverPage.textField,10);
    }

    @Then("the user should see {string} message")
    public void the_user_should_see_message(String expectedTextField) {

        assertEquals(expectedTextField, hoverPage.textField.getText());
        System.out.println(hoverPage.textField.getText());
    }

}
