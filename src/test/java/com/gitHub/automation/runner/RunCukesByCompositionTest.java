package com.gitHub.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * An example of using TestNG when the test class does not inherit from
 * AbstractTestNGCucumberTests.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber-html-report"
        ,"junit:target/cucumber-junit.xml","json:target/cucumber.json"
        ,"pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json"},
        glue = { "com.gitHub.automation.steps", "com.gitHub.automation.runner"},
        features = "src/test/features",
        strict = true)

public class RunCukesByCompositionTest {
	
}
