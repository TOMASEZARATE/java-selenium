package pages;

public class loginPage extends basePage { 
    
    public loginPage(){
        super(driver);
    }

    private String usuario = "//input[@id='user-name']";
    private String pass = "//input[@id='password']";
    private String btn_login = "//input[@id='login-button']";

    public void navegarAlaApp(){
        navigateTo("https://www.saucedemo.com/");
    }

    public void ingresar_usuario(String users) {
        input_text(usuario, users);
    }

    public void ingresar_password(String password){
        input_text(pass, password);
    }

    public void click_login(){
        click_element(btn_login);
    }

}
