Feature: Login is web page saucedemo

  @login
  Scenario: ingresar a la aplicacion con credenciales
  Given el usuario ingrese a la pagina web
    When el usuario ingresa las credenciales "standard_user" "secret_sauce"
    And dar click en el boton de login
    Then validamos que estemos en la pagina principal "PRODUCTS"

  @AddToCart
  Scenario: agregar un producto al carrito de compras y eliminarlo
    Given el usuario agrega un producto al carrito
    When ingresar a las opciones de compras
    Then eliminar el producto del carrito