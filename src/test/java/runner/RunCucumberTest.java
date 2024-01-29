package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {}, /* Confiuração de report (relatório) dos testes */
        features = "src/test/resources/features", /* Pasta onde estão os BDDs */
        tags = {"~@ignore"}, /* Tag específica para cada BDD, caso queira executar testes específicos */
        glue = ("steps") /* Pasta onde estão os steps */

)
public class RunCucumberTest {

    public static WebDriver driver;

    @BeforeClass
    public static void start(){

        driver = new ChromeDriver();

    }

    @AfterClass
    public static void stop(){

        driver.quit();

    }
}
