
package co.com.automation.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "co.com.automation.stepdefinitions",
    //tags = "@MiTag or @OtroTag",
    plugin = {"pretty"}
)

public class TestRunner {
}
