package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestHomePage extends PageObject {
    @FindBy(xpath = "//*[contains(@id,'backpack')]")
    public WebElementFacade producto1;
    @FindBy(xpath = "//*[contains(@id,'bike-light')]")
    public WebElementFacade producto2;
    @FindBy(xpath = "//*[contains(@id,'bolt-t-shirt')]")
    public WebElementFacade producto3;
    @FindBy(xpath = "//*[contains(@id,'fleece-jacket')]")
    public WebElementFacade producto4;
    @FindBy(xpath = "//*[contains(@class,'shopping_cart_link')]")
    public WebElementFacade btnshoping;
   /* @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElementFacade selectProductContainer;*/


    public void clickAgregar() {

        producto1.click();
        producto2.click();
        producto3.click();
        producto4.click();

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickAgregarCompras() {

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        btnshoping.click();

    }
  /*  public void filtrarProductos(String value) {
        switch(value){
            case "az":
                selectProductContainer.selectByValue("az");
                break;
            case "za":
                selectProductContainer.selectByValue("za");
                break;
            case "lowPrice":
                selectProductContainer.selectByValue("lohi");
                break;
            case "highPrice":
                selectProductContainer.selectByValue("hilo");
                break;
            default:
                throw new IllegalArgumentException("Unknown value" + value);
        }
    }*/


}
