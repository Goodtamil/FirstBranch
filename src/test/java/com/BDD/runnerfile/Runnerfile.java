package com.BDD.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\BDD\\featurefile"


,glue="com.BDD.stepdefinition",plugin= {"pretty","html:output/report"},tags= {"@smoke"},dryRun= false,monochrome= true)
public class Runnerfile {

}
