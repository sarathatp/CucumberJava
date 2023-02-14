package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Hookss",
		glue={"stepsForHooks"},
		monochrome=true,
		plugin= {"pretty","html:target/HtmlReports",
						  "json:target/JSONReports/report.json",
						  "junit:target/JUnitReports/report.xml"}
		)

public class TestRunnerHooks {

}
