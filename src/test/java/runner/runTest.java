package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//feature/loginDatatableMap.feature",
		glue={"stepDefs"},
		plugin={"pretty","html:target/cucumber-report", "json:target/json/report.json"},
		monochrome = true,
		dryRun = false
		
		)
public class runTest {

}
