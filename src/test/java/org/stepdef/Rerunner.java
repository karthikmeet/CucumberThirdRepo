package org.stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@./src/test/resources/failedtest.txt", glue = "org.stepdef", plugin = {"rerun:./src/test/resources/failedtest.txt"})
public class Rerunner {

}