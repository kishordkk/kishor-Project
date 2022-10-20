package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE,plugin= {"pretty"},monochrome = true,strict = true,dryRun = false,tags= {"@login1"},features= {"src\\test\\resources\\features"},glue={"com\\stepdefinition"})
public class TestRunner {

}
