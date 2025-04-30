package com.erick.rh.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com/erick/rh/tests/Empleado.feature",
        glue = "com.erick.rh.steps"
)
public class CucumberTest {
}
