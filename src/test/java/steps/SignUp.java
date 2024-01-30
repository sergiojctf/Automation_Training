package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import runner.RunCucumberTest;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class SignUp extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @When("^clico na opção Sign Up$")
    public void clicoNaOpcooSignUp() {
        homePage.clicarSignUp();


    }

    @Then("^Deverá ser aberta a página de cadastro do site$")
    public void deveraSerAbertaAPaginaDeCadastroDoSite() {

    }
}
