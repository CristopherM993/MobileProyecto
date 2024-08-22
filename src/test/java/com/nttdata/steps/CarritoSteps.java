package com.nttdata.steps;

import com.nttdata.Screens.CarritoScreen;
import com.nttdata.Screens.ProductosScreen;
import org.junit.Assert;

public class CarritoSteps {

    CarritoScreen carritoScreen;
    ProductosScreen productosScreen;
    int click = 0;

    public void clickViewMenu() {
        carritoScreen.clickViewMenu();
    }

    public void clickLogIn() {
        carritoScreen.clickLogIn();
    }

    public void ingresarUsuario(String usuario) {
        carritoScreen.ingresarUsuario(usuario);
    }

    public void ingresarContrasena(String contrasena) {
        carritoScreen.ingresarContrasena(contrasena);
    }

    public void login() {
        carritoScreen.clicLogin();
    }

    public void loginExitoso() {
        Assert.assertTrue(productosScreen.isProductDisplayed());
    }

    public void agregarProducto(String productos) {
        switch (productos){
            case "Sauce Labs Backpack": productosScreen.SauceLabsBackpack(); break;
            case "Sauce Labs Bolt T-Shirt": productosScreen.SauceLabsBoltTShirt(); break;
            case "Sauce Labs Fleece Jacket": productosScreen.SauceLabsFleeceJacket(); break;
            default: System.out.println("Producto desconocido");
        }

    }

    public void escogerImagen(String productos){
        switch (productos){
            case "Sauce Labs Backpack": productosScreen.clickImgVwSauceLabsBackpack(); break;
            case "Sauce Labs Bolt T-Shirt": productosScreen.clickImgVwSauceLabsBoltTShirt(); break;
            case "Sauce Labs Fleece Jacket": productosScreen.clickImgVwSauceLabsFleeceJacket(); break;
            default: System.out.println("Producto desconocido");
        }
    }

    public void agregarCantidad(int unidades) {
        for (int i = 0; i < unidades - 1; i++) {
            productosScreen.clicQuantify();
            click++;
        }
    }

    public void AgregarAlCarrito() {
        productosScreen.AgregarCarrito();
    }
}
