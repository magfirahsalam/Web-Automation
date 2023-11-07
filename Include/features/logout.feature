@Logout 

Feature: Logout

@LGT001	
Scenario: user succes logout 
Given user already logged in
When user click profile btn 
And user click keluar btn 
Then user successfully logout account  
