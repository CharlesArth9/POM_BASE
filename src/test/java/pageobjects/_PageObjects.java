package pageobjects;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DefaultUrl("https://www.proteccion.com/wps/portal/proteccion/web/home/general/solicita-clave")

public class _PageObjects extends PageObject{

       @FindBy(xpath = "//div[@id='contenido2']//div//ul//li[3]")
        WebElementFacade Msj;
       @FindBy(xpath = "//div[@id='popup_content']//div[2]//text()[1]")
        WebElementFacade Msj2;

    String res_o = "";
    public final static Logger LOG_EJECUCION = Logger.getLogger("Ejecución");

    public void PrimerIngresoDatos() {
     // getDriver().switchTo().frame("contenido");
     // getDriver().switchTo().frame("contenido2");
        getDriver().switchTo().frame(getDriver().findElement(By.id("contenido")));
        getDriver().switchTo().frame(getDriver().findElement(By.id("contenido2")));
        getDriver().findElement(By.xpath("//input[@id='nombres' and @name='nombres']")).sendKeys("Carlos Arturo");
        getDriver().findElement(By.xpath("//input[@id='primerApellido' and @name='primerApellido']")).sendKeys("Mestra");
        getDriver().findElement(By.xpath("//input[@id='segundoApellido' and @name='segundoApellido']")).sendKeys("López");
        LOG_EJECUCION.log(Level.INFO, " ******* INGRESO DE DATOS EJECUTADO CON EXITO ******* ");
        }

    public void ValidaMasVentaja() {
        getDriver().findElement(By.xpath("//a[@href='javascript:;' and @id='tab2']")).click();
        String textoEsperado = "Administre su cuenta individual de forma confidencial";
        String mensaje =Msj.getText().trim();
        assertThat(mensaje.equalsIgnoreCase(textoEsperado));

    }

    public void SegundoIngresoDatos() {
        getDriver().findElement(By.xpath("//input[@id='identificacion' and @name='identificacion']")).sendKeys("1064994985");

    }

    public void IgnorarFecha() {
        getDriver().findElement(By.xpath("//input[@id='fechaExpedicion' and @name='fechaExpedicion']")).sendKeys("");
        getDriver().findElement(By.xpath("//a[@href='javascript:;' and @class='estiloBoton2 gtmValidarIdentidadSolClave']")).click();
    }

    public void ValidarMensajes() {

        String textoEsperado2 = "Debe ingresar una fecha de expedición valida";
        String mensaje=Msj2.getText().trim();
        assertThat(mensaje.equalsIgnoreCase(textoEsperado2));

    }

    public String validacion() {
        return res_o = $("").getText().trim();
    }
}
