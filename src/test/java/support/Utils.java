package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;
import java.util.Random;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;


public class Utils extends RunCucumberTest {

    public void esperarElementoEstarPresente(By element, int tempo){

        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String gerarEmailAleatorio(){

        String email_inicio = "user_";
        String email_fim = "@phptravels.com";

        Random random = new Random();
        int minimo = 1;
        int maximo = 9999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_inicio + resultado + email_fim;
    }

    public void maximizarBrowwser(){

        driver.manage().window().maximize();
    }

    public void esperarAbrirOutraAba(){

        String originalWindow = driver.getWindowHandle();
        WebDriverWait waitwindows = new WebDriverWait(driver, 10);
        waitwindows.until(numberOfWindowsToBe(2));

        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        waitwindows.until(urlContains("https://phptravels.org/register.php"));
    }


}

