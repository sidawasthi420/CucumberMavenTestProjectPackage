package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/test/resources/features/login.feature",
		 glue = {"stepDefinitions","hooks"},
		 tags = "@Regression1",
		 plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
		 )
public class testRunner {
}