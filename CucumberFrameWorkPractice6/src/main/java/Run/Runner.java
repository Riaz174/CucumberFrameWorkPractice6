package Run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith((Cucumber.class))
@CucumberOptions(features={"src/main/java/Feature/Contact6.Feature"},glue= {"Stepdefinition"},monochrome= true, tags = {"@tag1"})
public class Runner {

}
