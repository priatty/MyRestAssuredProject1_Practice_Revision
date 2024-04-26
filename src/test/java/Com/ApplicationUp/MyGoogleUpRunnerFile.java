package Com.ApplicationUp;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/Com/ApplicationUp/MyGoogleUpFF.feature"},
		glue={"Com.ApplicationUp"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report2.json",
		}
		)

public class MyGoogleUpRunnerFile {

}
