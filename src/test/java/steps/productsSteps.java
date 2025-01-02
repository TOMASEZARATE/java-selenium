package steps;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.productsPage;

public class productsSteps {

    productsPage products_page = new productsPage();

    @Given("Hacer click en el link de twitter")
    public void clickTwitter(){
        products_page.click_twitter();
    }

    @Then("Ingresar a la app de twitter")
    public void verificarIngresoTwitter(){
        products_page.switchToNewTab();
    String txtObtenido = products_page.obtener_texto_link_twitter();
    String valorEsperado = "saucelabs.com";
    Assert.assertEquals(valorEsperado, txtObtenido);
    }

}

    



