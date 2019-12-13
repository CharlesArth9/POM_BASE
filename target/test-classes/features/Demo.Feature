# language: en
Feature:  Gestionar ingreso de informacion para la solicitud de clave para administracion
  de cuenta confidencial en la pagina proteccion


  @SolictarClave
  Scenario:  Solicitar clave para cuenta confidencial
    Given el usuario entra a la pagina de  solicitud de informacion para su clave
    When ingresa parte de la informacion requerida para solicitar clave
    And  se valida la seccion mas ventajas
    And  continua ingresando su informacion
    But  se omite ingresar la fecha
    Then se verifican mensajes y la falta que datos para finalizar


