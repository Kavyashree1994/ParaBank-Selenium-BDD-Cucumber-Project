package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:/Users/hp/git/repository/paraBankProject/src/test/resources/Features/1_ParaBank-Login.feature",
		"C:/Users/hp/git/repository/paraBankProject/src/test/resources/Features/2_openNewAccount.feature",
		"C:/Users/hp/git/repository/paraBankProject/src/test/resources/Features/3_accountOverview.feature"},
glue= {"stepDefinations"},
dryRun=false,
monochrome = true,
//plugin = {"pretty", "html:target/cucumber-reports/report2.json"}
plugin = {"pretty", "html:target/cucumber-reports/report.html"}
)
public class testRunner {
	
	

}
