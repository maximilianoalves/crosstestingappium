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
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", "pretty", "json:target/cucumber-report/report.json" },
        monochrome = true
)
public class Runner {
}
