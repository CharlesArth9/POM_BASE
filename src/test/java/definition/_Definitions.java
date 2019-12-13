package definition;

import steps._Steps;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

public class _Definitions {
    @Steps
    _Steps steps;

    @Given("^el usuario entra a la pagina de  solicitud de informacion para su clave$")
    public void el_usuario_entra_a_la_pagina_de_solicitud_de_informacion_para_su_clave() {
        steps.abrirPaginaPaciente();

    }

    @When("^ingresa parte de la informacion requerida para solicitar clave$")
    public void ingresa_parte_de_la_informacion_requerida_para_solicitar_clave(){
        steps.PrimerIngresoDatos();

    }

    @And("^se valida la seccion mas ventajas$")
    public void se_valida_la_seccion_mas_ventajas()  {

        steps.ValidaMasVentaja();
    }
    @And("^continua ingresando su informacion$")
    public void continua_ingresando_su_informacion()  {

        steps.SegundoIngresoDatos();

    }

    @But("^se omite ingresar la fecha$")
    public void se_omite_ingresar_la_fecha()  {

        steps.IgnorarFecha();

    }

    @Then("^se verifican mensajes y la falta que datos para finalizar$")
    public void se_verifican_mensajes_y_la_falta_que_datos_para_finalizar()  {
        //steps.ValidarMensajes();
    }

}
