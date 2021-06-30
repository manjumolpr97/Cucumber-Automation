package TestNG;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;


    @RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/java/FeatureFiles" ,
	   glue = "StepDefinition",
	   tags = "@SeleniumSmoke" )
	public class TestRunner {

	}


