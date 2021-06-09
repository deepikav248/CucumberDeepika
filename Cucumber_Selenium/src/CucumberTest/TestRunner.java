package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
    features = "Feature",
    glue = {"StepDefinition"},
    tags = "@activity1_2"
)

public class TestRunner {
    //empty
}
