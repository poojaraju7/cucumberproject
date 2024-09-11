package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "/Users/thejusnambyaarr/eclipse-workspace/cucumberproject/src/test/resources/Features/fblogin.feature",
		glue = "stepdefenition",
		plugin = {"pretty", "html:target/cucumber-reports"},
		monochrome = true)

public class RunTestng extends AbstractTestNGCucumberTests{
	

}
