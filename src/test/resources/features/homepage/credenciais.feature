@instant_form
Feature: Receber credenciais da versão demo do site php travels
  Eu como usuário da versão demo do site php travels
  Quero receber as credenciais do site
  Para navegar pela versão demo do site php travels

  @obter_credencias
  Scenario: Receber credenciais demo da php travels
    Given que estou no site 'php travels'
    When preencho corretamente o formulario de titulo 'Instant demo request form'
    And clico no botao 'submit'
    Then devera ser apresentada uma mensagem de sucesso