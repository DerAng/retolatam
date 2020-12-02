package co.com.choucair.certification.retolatam.tasks;

import co.com.choucair.certification.retolatam.userinterface.ClicPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Clic implements Task {


    public static Clic theOptions() {
        return Tasks.instrumented(Clic.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(

                 Click.on(ClicPage.MIS_VIAJES),
                 Click.on(ClicPage.INGRESAR_DATOS_VIAJE),
                 Click.on(ClicPage.LINK_DONDE_ENCONTRARLOS)

         );
    }
}
