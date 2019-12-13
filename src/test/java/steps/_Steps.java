package steps;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects._PageObjects;
import net.thucydides.core.annotations.Step;

import java.util.logging.Level;
import java.util.logging.Logger;

public class _Steps {

    _PageObjects page;
    ChromeDriver driver;

    public final static Logger LOG_VALIDA = Logger.getLogger("Validar");
    public final static Logger LOG_TEST = Logger.getLogger("Exito/Fracaso");
    public final static Logger LOG_EJECUCION = Logger.getLogger("Ejecucion");

    @Step
    public  void abrirPaginaPaciente(){

        page.open();
    }


    public  void PrimerIngresoDatos(){

        page.PrimerIngresoDatos();
    }

    public  void ValidaMasVentaja(){

        page.ValidaMasVentaja();
    }

    public void valida(String res_e) {

        String res_o = page.validacion();

        try {
            if (res_o.trim().equals(res_e)) {
                Assert.assertTrue("", res_e.equalsIgnoreCase(res_o.trim()));
                LOG_VALIDA.log(Level.INFO, " ******* VALIDACION CORRECTA  ******* ");

            } else {

                LOG_VALIDA.log(Level.INFO, " ****** VALIDACION ERRONEA ****** ");
                LOG_VALIDA.log(Level.INFO, " **** El valor esperado es distinto al valor obtenido en el resultado **** ");
                Assert.assertTrue("", res_e.equalsIgnoreCase(res_o.trim()));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public  void SegundoIngresoDatos(){

        page.SegundoIngresoDatos();
    }

    public  void IgnorarFecha(){

        page.IgnorarFecha();
    }


    public void ValidarMensajes()
    {
        page.ValidarMensajes();
    }

    public void cerrar() {
        try {
            LOG_TEST.log(Level.INFO, " ********** TEST EXITOSO ********** ");
            driver.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
