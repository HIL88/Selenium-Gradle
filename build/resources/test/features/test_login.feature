Feature: Login is web page saucedemo

  @login
  Scenario: ingresar a la aplicacion con credenciales
  Given el usuario ingrese a la pagina web
    When el usuario ingresa las credenciales "standard_user" "secret_sauce"
    And dar click en el boton de login
    Then validamos que estemos en la pagina principal "PRODUCTS"