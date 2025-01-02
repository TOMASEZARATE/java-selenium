package steps;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.cartPage;
import pages.productsPage;
import pages.checkoutPage;
import pages.checkoutOverviewPage;

public class cartSteps {

    cartPage cart_page = new cartPage();
    productsPage products_page = new productsPage();
    checkoutPage checkout_page = new checkoutPage();
    checkoutOverviewPage checkoutOverview_page = new checkoutOverviewPage();

    @Given("Añadir una backpack al carrito")
    public void addBackpackToCart(){
        products_page.click_sauceLabs_backpack();
    }

    @And("Hacer click en el icon del carro de compras")
    public void clickCartIcon(){
        products_page.click_cart();
    }

    @When("Hacer click en el boton checkout")
    public void clickCheckoutButton(){
        cart_page.click_checkout();
    }

    @And("El cliente ingresa el nombre {string}")
    public void ingresarNombre(String nombre){
        checkout_page.ingresar_nombre(nombre);
    }

    @And("El cliente ingresa el apellido {string}")
    public void ingresarApellido(String apellido){
        checkout_page.ingresar_apellido(apellido);
    }

    @And("El cliente ingresa el codigo postal {string}")
    public void ingresarCodigoPostal(String codigoPostal){
        checkout_page.ingresar_codigoPostal(codigoPostal);
    }

    @And("Hacer click en el boton continue")
    public void clickContinueButton(){
        checkout_page.click_continue_button();
    }

    @And("Hacer click en el boton finish")
    public void clickFinishButton(){
        checkoutOverview_page.click_finish_button();
    }

    @Then("El sistema deberia visualizar el mensaje de orden completada")
    public void verifyOrderCompleted(){
        String txtObtenido = checkoutOverview_page.obtener_texto_orden_finish();
        String valorEsperado = "Thank you for your order!";
        Assert.assertEquals(valorEsperado, txtObtenido);
    }

}
