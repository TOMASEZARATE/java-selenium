package steps;

import pages.loginPage;
import pages.productsPage;
import org.testng.Assert;


import io.cucumber.java.en.*;

public class loginSteps {

    loginPage login_page = new loginPage();
    productsPage products_page = new productsPage();

    @Given("Cuando navego a la web www.saucedemo.com")
    public void navegarAlaURL(){
        login_page.navegarAlaApp();
    }

    @When("Ingreso un {string}")
    public void ingresarUsuarios(String users) {
        login_page.ingresar_usuario(users);
    }

    @And("Ingreso la {string}")
    public void ingresarPassword(String password) {
        login_page.ingresar_password(password);
    }
    
    @And("Hago click en el boton login")
    public void clickLogin(){
        login_page.click_login();
    }

    @Then("Ingreso a la seccion de productos")
    public void verificarIngresoExitoso(){
    String textoProductos = products_page.obtener_Texto_Productos();
    String valorEsperado = "Products";
    Assert.assertEquals(valorEsperado, textoProductos);
    }

    @Given("Ingreso con un usuario por defecto")
    public void ingresarUsuarioDefault() {
        login_page.navegarAlaApp();
        login_page.ingresar_usuario("standard_user");
        login_page.ingresar_password("secret_sauce");
        login_page.click_login();
}

}


    

