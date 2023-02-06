Feature: Validate the forgotten password functionality

@Regression @Pink
Scenario: Validate the forgotten with invalid mobile number
Given User should launch chrome and load the url
When User should click the forgotten password link
And User should input invalid mobile number in the text box
And User should print the title of my password reset page
And User should click the search button
Then User should navigate to password reset page
