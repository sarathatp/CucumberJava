package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/FeaturesWithTags",
		glue={"StepDefinitions"},
		tags= {"@MustRun"}
		)

public class TestRunner_RunWithSingleTag {

}
