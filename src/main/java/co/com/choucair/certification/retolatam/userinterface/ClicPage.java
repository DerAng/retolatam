package co.com.choucair.certification.retolatam.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClicPage {

    public static final Target MIS_VIAJES = Target.the("lINK MIS VIAJES").located(By.linkText("Mis viajes"));
    public static final Target INGRESAR_DATOS_VIAJE = Target.the("lINK MIS VIAJES").located(By.id("tab_search_order"));
    public static final Target LINK_DONDE_ENCONTRARLOS = Target.the("lINK DONDE ENCONTRARLOS").located(By.id("undefined-dialog-open"));

}
