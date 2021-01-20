package com.crosstestingappium.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {

    @Given("User see the Calculator")
    public void user_see_the_Calculator() {
        System.out.println("User see the Calculator");
    }

    @When("User put {int}")
    public void user_put(Integer value) {
        System.out.println("User put {value}");
    }

    @Then("The sum result should be {int}")
    public void the_sum_result_should_be(Integer value) {
        System.out.println("The sum result should be {value}");
    }
}
