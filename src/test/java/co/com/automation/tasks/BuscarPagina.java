package co.com.automation.tasks;

import co.com.automation.userInterfaces.AcuseRecibidoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarPagina implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("www.clinicadelcountry.com").into(AcuseRecibidoPage.TXT_BUSCAR),
                SendKeys.of(Keys.ENTER).into(AcuseRecibidoPage.TXT_BUSCAR)
        );
    }

    public static BuscarPagina abrirGoogle() {
        return instrumented(BuscarPagina.class);
    }
}
