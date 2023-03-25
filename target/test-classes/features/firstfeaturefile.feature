@find_dropdown_element
Feature: find dropdown element
  Scenario: Find element
    Given user navigetes to amazon page
    And user clicks dropdown button
    And user clicks search button
    And verify category header
#     Then user close the browser