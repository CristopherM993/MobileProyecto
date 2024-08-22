package com.nttdata.Screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductosScreen extends PageObject {


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblProducts;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement imgVwSauceLabsBackpack;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Backpack\"]")
    private WebElement txtSauceLabsBackpack;


    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement imgVwSauceLabsBoltTShirt;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Bolt T-Shirt\"]")
    private  WebElement txtSauceLabsBoltTShirt;


    @AndroidFindBy (xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Fleece Jacket\"]")
    private WebElement imgVwSauceLabsFleeceJacket;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Fleece Jacket\"]")
    private  WebElement txtSauceLabsFleeceJacket;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    //android.widget.ImageView[@content-desc="Increase item quantity"]
    private WebElement quantify;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAddCarrito;


    public boolean isProductDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(lblProducts));
        return lblProducts.isEnabled();
    }

    public void clickImgVwSauceLabsBackpack(){
        imgVwSauceLabsBackpack.click();
    }

    public void clickImgVwSauceLabsBoltTShirt(){
        imgVwSauceLabsBoltTShirt.click();
    }

    public void clickImgVwSauceLabsFleeceJacket(){
        imgVwSauceLabsFleeceJacket.click();
    }

    public String SauceLabsBackpack(){
        return txtSauceLabsBackpack.getText();
    }

    public String SauceLabsBoltTShirt(){
        return txtSauceLabsBoltTShirt.getText();
    }

    public String SauceLabsFleeceJacket(){
        return txtSauceLabsFleeceJacket.getText();
    }


    public void clicQuantify(){
        quantify.click();
    }

    public void AgregarCarrito(){
        btnAddCarrito.click();
    }


}
