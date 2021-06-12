@loginFeature
Feature: validate Techfios login functionality 

Background: 
#	Given A user is on the Techfios login page
	Given A user is on the "Techfios" login page
#	Given A user is on the "GoogleSearch" login page

@scenario1
Scenario: 1 A user should be able to login with the valid credentials 
	When A user enters "<username>" and "<password>"
	And A user clicks on sign on button
	Then A user lands on the Dashboard page