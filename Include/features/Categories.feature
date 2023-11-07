@Categories
Feature: Categories

  @ctgrs1
  Scenario: User search product available product name
    Given user already login
    When user input available product name
    Then user can find the available product

  @ctgrs2
  Scenario: User search product unavailable product name
    Given user has been login
    When user input unavailable product name
    Then user cannot find the unavailable product

  @ctgrs3
  Scenario: User search product with blank product name
    Given user successful login
    When user not input product name
    Then user find the aimless products

  @ctgrs4
  Scenario: User search product with input space only
    Given users have been login
    When user input product name contains space only
    Then user find the random product

  @ctgrs5
  Scenario: User search product with mix data types
    Given user login
    When user input product name contains mixed data types
    Then user can not find the product

  @ctgrs6
  Scenario: User search product by categories
    Given user login successfully
    When user choose category
    Then user can find the product by category
