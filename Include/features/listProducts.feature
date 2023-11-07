@listAllProducts
Feature: List All Products

  @listAllProduct1
  Scenario: User View List All Products
    Given User Already Login
    When User Click hamburger icon
    Then User find products
    
 @listAllProduct2
  Scenario: User View Selected Products
    Given User Already Login Selected
    When User Click hamburger icon Selected
    And User Click Product
    Then User find selected products
    
    @listAllProduct3
  Scenario: User View Interested Products
    Given User Already Login Interested
    When User Click hamburger icon Interested
    And User Click Diminati
    Then User find interested products
    
    @listAllProduct4
  Scenario: User View Sold Products
    Given User Already Login Sold
    When User Click hamburger icon sold
    And User Click Terjual
    Then User find sold product