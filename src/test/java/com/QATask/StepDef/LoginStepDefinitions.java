package com.QATask.StepDef;

import com.QATask.Pages.LoginPage;
import com.QATask.Utils.BrowserUtils;
import com.QATask.Utils.ConfigurationReader;
import com.QATask.Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the swaglabs login page")
    public void user_is_on_the_swaglabs_login_page() {
        Driver.getDriver().get(ConfigurationReader.get("task2bUrl"));

    }

    @When("User enters username {string}")
    public void user_enters_username(String username) {

        loginPage.usernameInput.sendKeys(username);

    }

    @When("User enters password {string}")
    public void user_enters_password(String password) {

        loginPage.passwordInput.sendKeys(password);

    }

    @When("User click login button")
    public void user_click_login_button() {

        loginPage.loginButton.click();
        BrowserUtils.waitForVisibility(loginPage.productHeader, 10);
    }

    @Then("User should see {string} header on the homepage")
    public void user_should_see_header_on_the_homepage(String expectedHeader) {

        String actualHeader = loginPage.productHeader.getText();
        assertEquals("" + expectedHeader + " is NOT matched", expectedHeader, actualHeader);

    }
}
