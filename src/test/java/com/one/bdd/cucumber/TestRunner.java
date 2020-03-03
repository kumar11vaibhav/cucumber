package com.one.bdd.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/testing.feature", 
				 glue = {"com.one.bdd.cucumber"}
				)
public class TestRunner {

}
