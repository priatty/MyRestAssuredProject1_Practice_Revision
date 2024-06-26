package Com.Get_Data_Driven;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/Com/Get_Data_Driven/Get_DataDriven_FF.feature"},
		glue={"Com.Get_Data_Driven"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report2.json",
		}
		)

public class Get_DataDriven_Runner {

}
