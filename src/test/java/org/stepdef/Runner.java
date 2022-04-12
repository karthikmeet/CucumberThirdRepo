package org.stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = "org.stepdef", monochrome = true, plugin = {"rerun:./src/test/resources/failedtest.txt"})
public class Runner {

}