package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class CarritoStepsDefs {

    // Iniciamos llamando a los Steps
    @Steps
    CarritoSteps carritoSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        carritoSteps.clickViewMenu();
        carritoSteps.clickLogIn();
    }

    @When("inicio sesion con usuario {string} y clave {string}")
    public void inicioSesionConUsuarioYClave(String usuario, String contrasena) {

        carritoSteps.ingresarUsuario(usuario);
        carritoSteps.ingresarContrasena(contrasena);
        carritoSteps.login();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        carritoSteps.loginExitoso();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(int unidades, String productos) {
        carritoSteps.agregarProducto(productos);
        carritoSteps.escogerImagen(productos);
        carritoSteps.agregarCantidad(unidades);
        carritoSteps.AgregarAlCarrito();

    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
    }
}
