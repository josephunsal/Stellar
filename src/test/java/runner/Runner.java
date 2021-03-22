package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-default-report",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = {"src/test/resources/features"},
        dryRun = false
        , glue = {"step_def"}
        , tags = "@regression"
)

public class Runner {
}
