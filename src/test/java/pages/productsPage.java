package pages;


public class productsPage extends basePage {

    public productsPage(){
        super(driver);
    }

    private String products = "//span[contains(text(),'Products')]";
    private String link_twitter = "//a[contains(text(),'Twitter')]";
    private String link_facebook = "//a[contains(text(),'Facebook')]";
    private String link_linkedin = "//a[contains(text(),'LinkedIn')]";
    private String sauceLabs_backpack = "//button[@id='add-to-cart-sauce-labs-backpack']";
    private String sauceLabs_bikeLight = "//button[@id='add-to-cart-sauce-labs-bike-light']";
    private String sauceLabs_boltTShirt = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']";
    private String sauceLabs_fleeceJacket = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']";
    private String sauceLabs_onesie = "//button[@id='add-to-cart-sauce-labs-onesie']";
    private String sauceLabs_allTheThings = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']";
    private String remove_sauceLabs_backpack = "//button[@id='remove-sauce-labs-backpack']";
    private String remove_sauceLabs_bikeLight = "//button[@id='remove-sauce-labs-bike-light']";
    private String remove_sauceLabs_boltTShirt = "//button[@id='remove-sauce-labs-bolt-t-shirt']";
    private String remove_sauceLabs_fleeceJacket = "//button[@id='remove-sauce-labs-fleece-jacket']";
    private String remove_sauceLabs_onesie = "//button[@id='remove-sauce-labs-onesie']";
    private String remove_sauceLabs_allTheThings = "//button[@id='remove-test.allthethings()-t-shirt-(red)']";
    private String cart = "//a[@class='shopping_cart_link']";

    //locator page twitter
    private String link_sauceLabs = "//span[contains(text(),'saucelabs.com')]";

    public String obtener_Texto_Productos() {
        return getElementText(products);
    }
    
    public void click_twitter(){
        click_element(link_twitter);
    }

    public void click_facebook(){
        click_element(link_facebook);
    }

    public void click_linkedin(){
        click_element(link_linkedin);
    }

    public String obtener_texto_link_twitter(){
        return getElementText(link_sauceLabs);
    }

    public void click_sauceLabs_backpack(){
        click_element(sauceLabs_backpack);
    }

    public void click_sauceLabs_bikeLight(){
        click_element(sauceLabs_bikeLight);
    }

    public void click_sauceLabs_boltTShirt(){
        click_element(sauceLabs_boltTShirt);
    }

    public void click_sauceLabs_fleeceJacket(){
        click_element(sauceLabs_fleeceJacket);
    }

    public void click_sauceLabs_onesie(){
        click_element(sauceLabs_onesie);
    }

    public void click_sauceLabs_allTheThings(){
        click_element(sauceLabs_allTheThings);
    }

    public void click_remove_sauceLabs_backpack(){
        click_element(remove_sauceLabs_backpack);
    }   

    public void click_remove_sauceLabs_bikeLight(){
        click_element(remove_sauceLabs_bikeLight);
    }   

    public void click_remove_sauceLabs_boltTShirt(){
        click_element(remove_sauceLabs_boltTShirt);
    }      

    public void click_remove_sauceLabs_fleeceJacket(){
        click_element(remove_sauceLabs_fleeceJacket);
    }              

    public void click_remove_sauceLabs_onesie(){
        click_element(remove_sauceLabs_onesie);
    }

    public void click_remove_sauceLabs_allTheThings(){
        click_element(remove_sauceLabs_allTheThings);
    }   

    public void click_cart(){
        click_element(cart);
    }

}
