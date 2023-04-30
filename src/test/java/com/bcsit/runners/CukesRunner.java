package com.bcsit.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
      features = "src/test/resources/features",
        glue = "com/bcsit/step_definitions" //features'a ekleyecegimiz diger padler glue ile eklenir

)
public class CukesRunner {
}
