@Register

Feature: Register

@RGSTR001
Scenario: Sign up with correct data 
Given user already on homepage
When  user click button masuk in HomePage
And   user click text daftar
And   user input name
And   user input Gmail
And   user input password
And   user click daftar 
Then  user succesful signup and directed to homepage

@RGSTR002
Scenario: Sign Up with email already taken
Given user already on home page
When  user click button masuk in home page
And   user click text Daftar
And   user input Name
And   user input Email 
And   user input Password
And   user click Daftar 
Then  user can not sign up account and pop up warning text email already taken