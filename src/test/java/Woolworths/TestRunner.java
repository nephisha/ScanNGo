package Woolworths;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(value = Cucumber.class)
@CucumberOptions(plugin = { "pretty","json:target/cucumber.json" },
        dryRun = false,
        //format = {"pretty", "html:target/Reports"},
        features = {"src/test/resources/features"},
        glue = {"Woolworths.Steps"})

public class TestRunner
{

}