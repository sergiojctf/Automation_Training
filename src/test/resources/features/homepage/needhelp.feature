# new feature
# Tags: optional

@need_help
Feature: Abrir chat pela opção 'Need Help?'
    Eu como usuário da versão demo do site php travels
    Quero acessar o chat de ajuda no site
    Para esclarer duvidas de como utilizar a versão demo do site php travels

    @clicar_em_need_help
    Scenario: Abrir chat pela opçao Need Help?
        Given que estou no site 'php travels'
        When clico na opcao Need Help
        Then Devera ser aberto o chat de ajuda do site