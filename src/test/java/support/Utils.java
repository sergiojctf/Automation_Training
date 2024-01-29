package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

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
}

