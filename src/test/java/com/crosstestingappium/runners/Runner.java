package com.crosstestingappium.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = "src/test/java/com/crosstestingappium/features",
        glue = "com/crosstestingappium/steps",
        tags = "@operations",
        plugin = { "pretty", "html:target/cucumber-reports.html" },
        monochrome = true
)
public class Runner {
}
