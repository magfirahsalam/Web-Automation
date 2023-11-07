@updateproduct
Feature: update product

  @prd004
  Scenario: seller success update product
    Given user success login
    When user click humburger icon
    And user select product
    And user click button edit
    And user change product name
    And user change product price
    And user change product description
    And user click button terbitkan
    Then product is updated

  @prd005
  Scenario: seller not success update product
    Given seller has login
    When seller click humburger icon
    And seler select product
    And seller click edit
    And user input product name blank
    And user input product price blank
    And user click button terbitkan
    Then product is not update and gave popup failed message
