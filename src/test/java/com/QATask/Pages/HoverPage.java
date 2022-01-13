package com.QATask.Pages;

import com.QATask.Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverPage {

    public HoverPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@class='card mt-4 top-card'][5]")
    public WebElement widgets;

    @FindBy(xpath = "//div[.='Widgets']")
    public WebElement widgetsDropDown;

    @FindBy (xpath = "//span[normalize-space()='Tool Tips']")
    public WebElement tooltips;

    @FindBy (css = "#toolTipButton")
    public WebElement hoverButton;

    @FindBy (css = "#texFieldToolTopContainer")
    public WebElement hoverTextField;

    @FindBy (css = "#buttonToolTip")
    public WebElement buttonText;

    @FindBy (css = "#textFieldToolTip")
    public WebElement textField;

}
