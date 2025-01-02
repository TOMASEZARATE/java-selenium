package pages;

public class checkoutOverviewPage extends basePage {

    public checkoutOverviewPage(){
        super(driver);
    }

    private String finish_button = "//button[@id='finish']";
    private String orden_finish = "//h2[contains(text(),'Thank you for your order!')]";


    public void click_finish_button(){
        click_element(finish_button);
    }

    public String obtener_texto_orden_finish(){
        return getElementText(orden_finish);
    }

}
