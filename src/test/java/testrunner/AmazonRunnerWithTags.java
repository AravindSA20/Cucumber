package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * Single Scenario: tags="@Mobiles"
 * Multiple Scenario: tags="@tag1 or @tag2"
 * Skip any one Scenario: tags="not @tag1"
 * Skip Multiple Scenario: tags="not @ignore", but @ignore should be written in feature file before a scenario
 * To run all: tags="@All"
 
 * publish=true --> Generate Default Report from the link created after running the code in console
 */


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesFile/Amazon.feature",
	                 glue="stepdef",
	                 tags="@All",
	                 publish=true)
public class AmazonRunnerWithTags {

}
