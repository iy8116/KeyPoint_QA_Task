package com.QATask.Pages;

import com.QATask.Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {

    public AlertsPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//div[@class='card mt-4 top-card'][3]")
    public WebElement alertFrameWindows;

    @FindBy(css = ".main-header")
    public WebElement mainHeader;

    @FindBy (xpath = "//span[.='Alerts']")
    public WebElement alertsButton;

    @FindBy (id = "alertButton")
    public WebElement firstClickMeButton;

    @FindBy (id = "timerAlertButton")
    public WebElement secondClickMeButton;

    @FindBy (xpath = "(//*[@class='btn btn-primary'])[3]")
    public WebElement thirdClickMeButton;

    @FindBy(id = "confirmResult")
    public WebElement confirmText;

    @FindBy (id = "promtButton")
    public WebElement fourthClickMeButton;

    @FindBy(id = "promptResult")
    public WebElement promptText;

}
