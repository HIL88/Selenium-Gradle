package com.saucedemo.main.definitions;


import com.saucedemo.main.steps.TestHomePageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestHomeDefinitions {

    @Steps
    TestHomePageSteps testHomePageSteps;

    @Given("el usuario agrega un producto al carrito")
    public void elUsuarioAgregaUnProductoAlCarrito() {
        testHomePageSteps.clickAgregarProductos();
    }
    @When("ingresar a las opciones de compras")
    public void ingresarALasOpcionesDeCompras() {

        testHomePageSteps.agregarcompras();
    }
    @Then("eliminar el producto del carrito")
    public void eliminarElProductoDelCarrito() {

        testHomePageSteps.eliminarProducto();
    }

}
