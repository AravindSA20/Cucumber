package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesFile/HRMDataDriven.feature",
	                 glue="stepdef",
	                 publish=true,
	                 plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

//For Extent report in cucumber, create a File extent.properties under resources and write the required code, add required dependency in pom and write the plugin in runner class
public class OrangeHrmRunner {

}
