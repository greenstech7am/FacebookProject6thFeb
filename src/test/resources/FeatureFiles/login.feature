

Feature: Validate the login functionality of facebook

Background:
Given User should launch chrome and load the url

@Sanity @Smoke
Scenario: Validate the login functionality with invalid username and invalid password

When User should input username in the email text box
And User should input password in the password text box
And User should print the title of my page
And User should click the login button
Then User should navigate to incorrect credential page

@Regression
Scenario: Validate the login fucntionality with valid username and invalid password

When User should input valid username in the email text box
And User should input invalid password in the password text box
And User should click the login button
Then User should navigate to incorrect credential page

@Yellow
Scenario: Validate the login fucntionality with invalid username and valid password

When User should input invalid username and valid password		
			#With Header ---> 2D Map
			
			|Sports|Person|Colours|Flim|Company|Employee|				
			|Rohit|Rohit@123|Ajay|Ajay@123|Kumar|Kumar@123|
			|Virat|Virat@123|Lerin|Lerin@123|Vinod|Vinod@123|
			|Hello|Hello@123|Dravid|Dravid@123|Vimal|Vimal@123|

And User should click the login button
Then User should navigate to incorrect credential page


					
					
					
					
					
					
					
					
					
					
					

















