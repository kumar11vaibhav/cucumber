Feature: Testing the login page

#@SmokeTest
Scenario: Logging in with valid credentials 
Given I launch the login page
      #And some other precondition
When  I enter username and password
| attribute	| value	|
| admin | pass1234 |
And press login button
      #And yet another action
Then launch the dashboard




#Examples:
#    |uname|pass| value |
#    |abcd|1234| 12		|
#    |efgh|1234| 22	|

##@SmokeTest
#Scenario: Logging in with invalid credentials 
#Given I launch the login page
#      #And some other precondition
#When I enter username and password
#And press login button
#      #And yet another action
#Then show error message
#
#
#
##@SmokeTest
##@RegressionTest
#Scenario: Logging in with incomplete credentials 
#Given I launch the login page
#      #And some other precondition
#When  I enter username and password
#And press login button
#      #And yet another action
#Then show required message
#
#And I login with following credentials:

