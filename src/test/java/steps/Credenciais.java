package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import runner.RunCucumberTest;

public class Credenciais extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Given("^que estou no site 'php travels'$")
    public void queEstouNoSitePhpTravels() {
    homePage.acessarAplicacao();
    }

    @When("^preencho corretamente o formulario de titulo 'Instant demo request form'$")
    public void preenchoCorretamenteOFormulárioDeTítuloInstantDemoRequestForm() throws InterruptedException {
        homePage.scrollDownToInstantForm();
        homePage.preencherInstantForm();
        homePage.calculoCampoResultInstantForm();
    }

    @When("^clico no botao 'submit'$")
    public void clicoNoBotãoSubmit()  {
        homePage.clicarBotaoSubmitInstantForm();
    }

    @Then("^devera ser apresentada uma mensagem de sucesso$")
    public void deveraSerApresentadaUmaMensagemDeSucesso() throws InterruptedException {
        homePage.validarRecebimentoCredenciaisInstantForm();
    }
}
