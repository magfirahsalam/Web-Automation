@Profile
Feature: Profile

 @PRF001
  Scenario: Edit profil with valid data
    Given user succes login with valid credential
    When user click pencil icon
    And user click profile name
    And user go to profil page
    And user input nama
    And user input city
    And user input address
    And user input phone number
    And click button simpan
    Then user success edit profile 

 