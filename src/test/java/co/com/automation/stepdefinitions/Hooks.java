
package co.com.automation.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.Cast;
import org.openqa.selenium.WebDriver;

public class Hooks {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled("Usuario").can(BrowseTheWeb.with(driver));
    }
}
