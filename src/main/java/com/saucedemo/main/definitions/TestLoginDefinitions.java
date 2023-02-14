package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.TestLoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestLoginDefinitions {
    @Steps
    TestLoginSteps testLoginSteps;

    @Given("el usuario ingrese a la pagina web")
    public void elUsuarioIngreseALaPaginaWeb() {

        testLoginSteps.openWeb();
    }

    @When("el usuario ingresa las credenciales {string} {string}")
    public void elUsuarioIngresaLasCredenciales(String value1, String value2) {
        testLoginSteps.ingresarCredenciales(value1, value2);
    }

    @When("dar click en el boton de login")
    public void darClickEnElBotonDeLogin() {
        testLoginSteps.darClickBtnLogin();
    }

    @Then("validamos que estemos en la pagina principal {string}")
    public void validamosQueEstemosEnLaPaginaPrincipal(String string) {
        testLoginSteps.validarPaginaPrincipal(string);
    }

}
