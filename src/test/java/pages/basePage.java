package pages;
 
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class basePage {
    
    // Declaración de variables WebDriver y WebDriverWait para manejo del navegador
    protected static WebDriver driver;
    protected static WebDriverWait wait;
 
    // Constructor que inicializa el driver y configura un tiempo de espera explícito
    public basePage(WebDriver driver) {
        basePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    // Método para configurar una espera implícita
    public static void setImplicitWait(long timeoutInSeconds) {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutInSeconds));
    }

    // Metodo para maximizar la ventana del navegador
    public static void maximizeWindow(){
        driver.manage().window().maximize();
    }
 
    // Inicializa el driver de Chrome usando WebDriverManager
    public static void initializeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    // Navega a una URL específica
    public static void navigateTo(String url) {
        driver.get(url);
    }

    // Método privado que busca un elemento usando xpath y espera explícita
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    // Hace clic en un elemento identificado por xpath
    public void click_element(String locator){
        Find(locator).click();
    }

    // Limpia e ingresa texto en un elemento
    public void input_text(String locator, String keysToSend){
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }

    // Cierra el navegador y limpia la instancia del driver
    public static void close_browser(){
        driver.quit();
    }

    // Selecciona un valor en un dropdown por su valor
    public void select_dropdown_value(String locator, String value){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(value);
    }

    // Selecciona un valor en un dropdown por su índice
    public void select_dropdown_index(String locator, Integer index){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(index);
    }

    // Obtiene el número de opciones en un dropdown
    public int dropdown_size(String locator){
        Select dropdown = new Select(Find(locator));
        List<WebElement> dropdownOptions = dropdown.getOptions();
        return dropdownOptions.size();
    }

    // Obtiene una lista con todos los textos de las opciones de un dropdown
    public List<String> get_dropdowns_values(String locator){
        Select dropdown = new Select(Find(locator));
        List<WebElement> dropdown_options = dropdown.getOptions();
        List<String> values = new ArrayList<>();
        for (WebElement option: dropdown_options) {
            values.add(option.getText());
        }
        return values;
    }

    // Obtiene el texto de un elemento
    public String getElementText(String locator) {
        return Find(locator).getText();
    }
    
    // Cambia el foco a la última pestaña abierta
    public void switchToNewTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }
}
