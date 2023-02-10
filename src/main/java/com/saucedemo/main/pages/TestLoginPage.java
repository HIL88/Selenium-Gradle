package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/")
public class TestLoginPage extends PageObject {
    @FindBy(xpath = "//input[@id='user-name']")
    public WebElementFacade inputUserName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElementFacade inputPassword;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElementFacade btnLogin;

    @FindBy(xpath = "//*[@class='header_secondary_container']//*[text()='Products' ]")
    public WebElementFacade validar;


    public void ingresarCredencialesLogin(String username, String password) {
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);
    }

    public void clickBtnLogin() {
        try{
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        btnLogin.click();
    }


}