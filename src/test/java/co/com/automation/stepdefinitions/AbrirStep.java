
package co.com.automation.stepdefinitions;

import co.com.automation.tasks.AbrirGoogle;
import co.com.automation.tasks.BuscarPagina;
import io.cucumber.java.en.Given;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AbrirStep {
    @Given("el usuario abre Google")
    public void elUsuarioAbreGoogle() {
        theActorCalled("Usuario").attemptsTo(AbrirGoogle.abrirGoogle());
        theActorInTheSpotlight().attemptsTo(BuscarPagina.abrirGoogle());
    }
}
