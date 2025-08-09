package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/main/resources/feature",
    glue = {"stepDefinations", "Hooks"},
    plugin = {"pretty", "html:target/CucumberReport.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
