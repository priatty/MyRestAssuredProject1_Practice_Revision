package Com.Basic;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/Com/Basic/MyBasicFeatureFile.feature"},
		glue={"Com.Basic"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report1.json",
		}
		)

public class MyBasicRunnerFileXX {

}
