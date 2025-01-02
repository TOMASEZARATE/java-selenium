@loginSwagLabs
Feature: Logearse en la aplicacion 

Scenario Outline: Realizar login con distintos usuarios
    Given Cuando navego a la web www.saucedemo.com
    When Ingreso un "<users>"
    And Ingreso la "<password>"
    And Hago click en el boton login
    Then Ingreso a la seccion de productos 

    Examples:
        | users |                   password | 
        | standard_user |           secret_sauce |
        | problem_user |            secret_sauce |
        | error_user |              secret_sauce |
        | visual_user |             secret_sauce |
