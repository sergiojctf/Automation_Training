@instant_form
Feature: Receber credenciais da versão demo do site php travels
  Eu como usuário da versão demo do site php travels
  Quero receber as credenciais do site
  Para navegar pela versão demo do site php travels

  @obter_credencias
  Scenario: Receber credenciais demo da php travels
    Given que estou no site 'php travels'
    When preencho corretamente o formulário de título 'Instant demo request form'
    And clico no botão 'submit'
    Then deverá ser apresentada a seguinte mensagem de sucesso 'Thank you! We have sent your demo credentials to your email please check your email to test demo website. if message not found inbox please check spam folder'