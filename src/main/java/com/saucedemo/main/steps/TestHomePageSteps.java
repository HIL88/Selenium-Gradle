package com.saucedemo.main.steps;

import com.saucedemo.main.pages.TestHomePage;
import org.fluentlenium.core.annotation.Page;

public class TestHomePageSteps {
    @Page
    TestHomePage testHomePage;

    public void clickAgregarProductos() {
        
        testHomePage.clickAgregar();
    }


    public void agregarcompras() {
        testHomePage.clickAgregarCompras();
    }
}
