package pages;

public class cartPage extends basePage {

    public cartPage(){
        super(driver);
    }

    private String continue_shopping = "//button[@id='continue-shopping']";
    private String checkout = "//button[@id='checkout']";
    


    public void click_continue_shopping(){
        click_element(continue_shopping);
    }

    public void click_checkout(){
        click_element(checkout);
    }

    
}

