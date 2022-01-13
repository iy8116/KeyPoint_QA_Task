package com.QATask.Pages;

import com.QATask.Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name = "user-name")
    public WebElement usernameInput;

    @FindBy  (id = "password")
    public WebElement passwordInput;

    @FindBy (id = "login-button")
    public WebElement loginButton;

    @FindBy (xpath = "//span[.='Products']")
    public  WebElement productHeader;
}
