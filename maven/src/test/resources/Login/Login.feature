@Login
Feature: Login features
This feature includes scenario that would validate the following feature.
1) Login as Admin
2) Login as linda.anderson
3) Login with Negative data

Background:
Given I am to able to navigate onto the login page

#Scenario: Login as Admin
#When I Enter the username as "Admin"
#And I enter the Password as "admin123"
#And I click on the Login button
#Then I should see the username as "Welcome Paulette"
#
#Scenario: Login as lindia.anderson
#When I Enter the username as "Admin"
#And I enter the Password as "admin123"
#And I click on the Login button
#Then I should see the username as "Welcome Paulette"

Scenario Outline: test Login with Different Data
When I Enter the username as "<username>"
And I enter the Password as "<password>"
And I click on the Login button
Then I should see the username as "<LoginName>"

Examples:
|username|password|LoginName
|Admin   |admin123|Welcome Paulette|
|Admin   |admin123|Welcome Paulette|

@InvalidLogin
Scenario: Login as Negative Data
When I Enter the username as "Sunil"
And I enter the Password as "sunil"
And I click on the Login button
Then I should see a Error message as "Invalid Credentials"
