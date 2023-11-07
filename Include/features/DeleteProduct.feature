@deleteproduct
Feature: delete product

  @del001
  Scenario: user success delete product
    Given user success logged in
    When user clicked the humburger icon
    And user selected the product
    And user click button delete
		Then user success delete product