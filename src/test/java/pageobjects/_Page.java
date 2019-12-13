package pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@DefaultUrl("")
public class _Page extends PageObject {

    String res_o = "";
    public final static Logger LOG_EJECUCION = Logger.getLogger("Ejecución");

    @FindBy(id = "elemento")
    WebElement num12;


    public void a() {

        try {
            //  :FIXME -que tengo que arreglar-
            //  :TODO -que tengo que hacer-
            //  :OPTIMIZE -que tengo que mejorar-
            //  :ERROR -que errores de lógica tengo-

            WebElement num6 = getDriver().findElement(By.cssSelector(""));
            WebElement num5 = getDriver().findElement(By.xpath(""));
            WebElementFacade num56 = find(org.openqa.selenium.By.id("selector"));
            List<WebElementFacade> lista = findAll("");
            $("").click();

            num6.click();
            num5.click();
            num56.click();


            LOG_EJECUCION.log(Level.INFO, " ******* INGRESO DE NUMEROS EJECUTADO CON EXITO ******* ");


        } catch (Exception e) {
            e.printStackTrace();
            LOG_EJECUCION.log(Level.INFO, " ******* ERROR EN EL INGRESO DE NUMEROS  ******* ");
            getDriver().close();
        }
    }

    public String validacion() {
        return res_o = $("").getText().trim();
    }
}