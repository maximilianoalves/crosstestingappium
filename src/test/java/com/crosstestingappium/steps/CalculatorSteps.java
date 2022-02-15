package com.crosstestingappium.steps;

import com.crosstestingappium.pagefactory.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorSteps {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Given("User see the Calculator")
    public void user_see_the_Calculator() {
        calculatorPage.isCalculatorPage();
    }

    @And("User put first value {int}")
    public void user_put_first_value(Integer value) {calculatorPage.fillFieldFirstNumber(value.toString()); }

    @And("User put second value {int}")
    public void user_put_second_value(Integer value) { calculatorPage.fillFieldSecondNumber(value.toString()); }

    @When("User select {string}")
    public void user_select(String operator) {calculatorPage.clickOperator(operator); }

    @Then("The result should be {int}")
    public void the_sum_result_should_be(Integer value) { Assert.assertEquals(calculatorPage.viewResultText(), value.toString()); }
}
