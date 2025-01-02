package pages;

public class checkoutPage extends basePage {

    public checkoutPage(){
        super(driver);
    }

    private String first_name = "//input[@id='first-name']";
    private String last_name = "//input[@id='last-name']";
    private String postal_code = "//input[@id='postal-code']";
    private String continue_button = "//input[@id='continue']";
    
    public void ingresar_nombre(String nombre){
        input_text(first_name, nombre);
    }

    public void ingresar_apellido(String apellido){
        input_text(last_name, apellido);
    }

    public void ingresar_codigoPostal(String codigoPostal){
        input_text(postal_code, codigoPostal);
    }

    public void click_continue_button(){
        click_element(continue_button);
    }

    
}

