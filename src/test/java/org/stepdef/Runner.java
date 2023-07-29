package org.stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = {"org.stepdef"}, monochrome = true, tags = "@karthik",
plugin = "rerun:./src/test/resources/failedcases.txt")
public class Runner {

}
