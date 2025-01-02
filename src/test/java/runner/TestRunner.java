package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", // Directorio de nuestros archivos .feature
        glue = "steps", // Paquete donde tenemos clases definiendo los steps
        plugin = { "pretty", "html:target/cucumber-reports" },
        tags = "@carro_de_compras")

public class TestRunner {
 
}
