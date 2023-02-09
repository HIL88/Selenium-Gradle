package com.saucedemo.main.steps;

import com.saucedemo.main.pages.TestLoginPage;
import org.fluentlenium.core.annotation.Page;

public class TestLoginSteps {
    @Page
    TestLoginPage testLoginPage;
    public void openWeb() {

        testLoginPage.open();
    }

    public void ingresarCredenciales(String username, String password) {
        testLoginPage.ingresarCredencialesLogin(username, password);
    }

    public void darClickBtnLogin() {
        testLoginPage.clickBtnLogin();
    }
}
