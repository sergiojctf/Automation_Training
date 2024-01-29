package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HPInstantRequestForm extends Utils {

    WebDriver driver;
    private By first_name_instantform_field = By.name("first_name");
    private By last_name_instantform_field = By.name("last_name");
    private By business_name_instantform_field = By.name("business_name");
    private By email_instantform_field = By.name("email");

    private By number_instantform_field = By.id("number");

    public HPInstantRequestForm(WebDriver driver){
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.get("https://phptravels.com/demo/");
        maximizarBrowwser();
    }

    public void preencherInstantForm(){

        driver.findElement(first_name_instantform_field).sendKeys("User");
        driver.findElement(last_name_instantform_field).sendKeys("Test");
        driver.findElement(business_name_instantform_field).sendKeys("User Test Automation");
        driver.findElement(email_instantform_field).sendKeys(gerarEmailAleatorio());

    }

    public void calculoCampoResultInstantForm(){
        String num1, num2;

        num1 = driver.findElement(By.id("numb1")).getText();
        int numb1 = Integer.parseInt(num1);
        num2 = driver.findElement(By.id("numb2")).getText();
        int numb2 = Integer.parseInt(num2);
        int number = numb1 + numb2;
        driver.findElement(number_instantform_field).sendKeys("" + number);
    }

    public void scrollDownToInstantForm() throws InterruptedException {
        //Para rolar usando Selenium, você pode usar a interface JavaScriptExecutor que
        // ajuda a executar métodos JavaScript através do Selenium Webdriver
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        esperarElementoEstarPresente(By.id("demo"), 10);
    }

    public void clicarBotaoSubmitInstantForm(){

        driver.findElement(By.id("demo")).click();

    }

    public void validarRecebimentoCredenciaisInstantForm() throws InterruptedException {

        esperarElementoEstarPresente(By.id("colored"), 10);
        Boolean checked_form = driver.findElement(By.id("colored")).isEnabled();
        Assert.assertEquals(true, checked_form);

    }

}
