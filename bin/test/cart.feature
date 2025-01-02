@carro_de_compras
Feature: Carro de compras 

Background:
    Given Ingreso con un usuario por defecto
    
@realizarCompra
Scenario Outline: Realizar la compra de una backpack
    Given Añadir una backpack al carrito
    And Hacer click en el icon del carro de compras 
    When Hacer click en el boton checkout
    And El cliente ingresa el nombre "<nombre>"
    And El cliente ingresa el apellido "<apellido>"
    And El cliente ingresa el codigo postal "<codigoPostal>"
    And Hacer click en el boton continue
    And Hacer click en el boton finish
    Then El sistema deberia visualizar el mensaje de orden completada

    Examples:
        | nombre | apellido | codigoPostal |
        | Tomas  | Zarate | 1888     |