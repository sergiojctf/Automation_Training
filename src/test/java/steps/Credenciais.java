package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import runner.RunCucumberTest;

public class Credenciais extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Given("^que estou no site 'php travels'$")
    public void que_estou_no_site_php_travels() {
    homePage.acessarAplicacao();
    }

    @When("^preencho corretamente o formulário de título 'Instant demo request form'$")
    public void preencho_corretamente_o_formulário_de_título_Instant_demo_request_form() throws InterruptedException {
        homePage.scrollDownToInstantForm();
        homePage.preencherInstantForm();
        homePage.calculoCampoResultInstantForm();
    }

    @When("^clico no botão 'submit'$")
    public void clico_no_botão_submit()  {
        homePage.clicarBotaoSubmitInstantForm();
    }

    @Then("^deverá ser apresentada a seguinte mensagem de sucesso 'Thank you! We have sent your demo credentials to your email please check your email to test demo website\\. if message not found inbox please check spam folder'$")
    public void deverá_ser_apresentada_a_seguinte_mensagem_de_sucesso_Thank_you_We_have_sent_your_demo_credentials_to_your_email_please_check_your_email_to_test_demo_website_if_message_not_found_inbox_please_check_spam_folder() throws InterruptedException {
        homePage.validarRecebimentoCredenciaisInstantForm();
    }
}
