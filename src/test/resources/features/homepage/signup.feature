# new feature
# Tags: optional

@sign_up
Feature: Fazer cadastro no site
    Eu como usuário da versão demo do site php travels
    Quero me cadastrar no site
    Para utilizar recursos da versão demo do site php travels

    @clicar_em_signup_na_homepage
    Scenario: Abrir página de cadastro a partir da home page
        Given que estou no site 'php travels'
        When clico na opção Sign Up
        Then Deverá ser aberta a página de cadastro do site