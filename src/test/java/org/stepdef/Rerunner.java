package org.stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@./src/test/resources/failedcases.txt", glue = {"org.stepdef"}, monochrome = true, plugin = "rerun:./src/test/resources/failedcases.txt")
public class Rerunner {

}
