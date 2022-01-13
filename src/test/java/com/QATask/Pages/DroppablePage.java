package com.QATask.Pages;

import com.QATask.Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DroppablePage {

    public DroppablePage (){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@class='card mt-4 top-card'][5]")
    public WebElement interactions;

    @FindBy(xpath = "//span[.='Droppable']")
    public WebElement droppableButton;

    @FindBy (xpath = "//div[.='Drag me']")
    public WebElement dragMe;

    @FindBy (xpath = "(//div[@class='drop-box ui-droppable'])[1]")
    public WebElement dropHere;

    @FindBy(xpath = "//p[.='Dropped!']")
    public WebElement droppedText;
}
