package br.com.crosstestingappium.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = "src/test/java/br/com/crosstestingappium/features",
        glue = "br/com/crosstestingappium/steps",
        tags = "@search",
        plugin = { "pretty", "html:target/cucumber-reports.html" },
        monochrome = true
)
public class Runner {
}
