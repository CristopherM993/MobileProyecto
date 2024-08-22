package com.nttdata.Screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CarritoScreen extends PageObject {

    // Iniciando en el Menu y luego en Log In.
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"View menu\"]")
    private WebElement ViewMenu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemTV\" and @text=\"Log In\"]")
    private WebElement LogIn;

    // Screen de Login con usuario, clave y boton

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/nameET\"]")
    private WebElement txtUsuario;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/passwordET\"]")
    private WebElement txtContrasena;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to login with given credentials\"]")
    private WebElement btnLogin;


    // METODOS PARA INGRESAR LOS DATOS
    public void clickViewMenu(){
        ViewMenu.click();
    }

    public void clickLogIn(){
        LogIn.click();
    }

    public void ingresarUsuario(String usuario){
        txtUsuario.sendKeys(usuario);
    }

    public void ingresarContrasena(String contrasena){
        txtContrasena.sendKeys(contrasena);
    }

    public void clicLogin(){
        btnLogin.click();
    }





}
