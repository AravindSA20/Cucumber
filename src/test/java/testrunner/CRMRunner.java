package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesFile/CRM.feature",
	                 glue={"stepdef","hooksDemo"})
public class CRMRunner {

}
