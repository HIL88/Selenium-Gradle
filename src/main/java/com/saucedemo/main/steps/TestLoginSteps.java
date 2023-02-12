package com.saucedemo.main.steps;

import com.saucedemo.main.pages.TestLoginPage;
import com.saucedemo.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static net.serenitybdd.core.Serenity.getDriver;

//public WebDriver driver;
public class TestLoginSteps {


    private static final Logger LOGGER = LoggerFactory.getLogger(TestLoginSteps.class);
    @Page
    TestLoginPage testLoginPage;
    public void openWeb() {

        testLoginPage.open();
        getDriver().manage().window().maximize();

    }

    public void ingresarCredenciales(String username, String password) {
        testLoginPage.ingresarCredencialesLogin(username, password);
        GeneralUtil.explicitWait(1000L);
    }

    public void darClickBtnLogin() {
        testLoginPage.clickBtnLogin();
    }

    public void validarPaginaPrincipal( String string) {
        MatcherAssert.assertThat("PRODUCTS",string.contains(testLoginPage.validar.getText()));
    }
}
