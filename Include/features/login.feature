@Login

Feature: Login

@LGN001
Scenario: Login with registered credential
Given user already on homepage
When  user click button masuk in homepage
And   user input email
And   User input password
And   user click button masuk 
Then  user succesful login and directed to home page


@LGN002
Scenario: Login with unregistered credential
Given user already on homepage
When  user click button masuk in homepage
And   user input unregistered e-mail
And   User input password
And   user click button masuk 
Then  user can not login and warning pop up data not registered display
