Feature:login into Salesforce
Background:
Given user open salesforce application

Scenario: login with valid user and valid password

when user on "LoginPage"
when user enters value into text box username as "suchi@tekarch.com"
when  user enters value into text box password as "allow@123"
when  click in a Login button
When user on "Homepage "
And    click on the login button
Then    verify page title as "Login|Salesforce"

Scenario: login with invalid user and invalid password

when user on "LoginPage"
when user enters value into text box username as "suchip@tekarch.com"
when  user enters value into text box password as "admin"
when  click in a Login button
And    click on the login button
Then   alert is present with the text"Error"

Scenario: login with invalid user and invalid password
