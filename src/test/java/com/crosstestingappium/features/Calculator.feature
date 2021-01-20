@sum
Feature: Do calculator

  Scenario: Sum two values
    Given User see the Calculator
    When User put 1
    And User put 1
    Then The sum result should be 2