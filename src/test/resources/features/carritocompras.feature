@CarritodeCompras
Feature: Carrito de Compras

  Scenario Outline: Funcion carrito de compras

    Given estoy en la aplicación de SauceLabs
    When inicio sesion con usuario "bob@example.com" y clave "10203040"
    And valido que carguen correctamente los productos en la galeria
    When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente

    Examples:
      | PRODUCTO                 | UNIDADES |
      | Sauce Labs Backpack      | 1        |
      | Sauce Labs Bolt T-Shirt  | 1        |
      | Sauce Labs Fleece Jacket | 2        |