package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome=true,
        features = {"src/test/resources/features"},
        glue = {"stepDefinition"},
        tags = ("@Customer"),
        dryRun = false,
        stepNotifications = true,
        strict = true,
        plugin = {"usage", "html:test-output", "html:target/cucumber-reports.html", "json:target/cucumber-report/cucumber.json"}


)
public class TestRunner {
}