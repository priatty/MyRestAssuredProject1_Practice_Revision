package Com.Get_Data_Table;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/Com/Get_Data_Table/Get_DataTable_FF.feature"},
		glue={"Com.Get_Data_Table"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report2.json",
		}
		)

public class Get_DataTable_Runner {

}
