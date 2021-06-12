@otherFeature
Feature: Test login and add new Bank and Cash

Background: 
#	Given The user is on the Techfios login page
	Given The user is on the "Techfios" login page
#	Given The user is on the "GoogleSearch" login page

@others1
Scenario Outline: 1 User should be able to login with the valid credentials and add a new acct to Bank and Cash
	When The user enters "<username>" and "<password>"
	When The user clicks on sign in button 
	When The user land on Dashboard page
	When The user clicks Bank and Cash
	When The user clicks New Account
	When The user land on Account page
	When The user will enters "<Account_Title>" and "<Description>" and "<Initial_Balance>" and "<Account_Number>" and "<Contact_Person>" and "<Phone>" and "<Internet_Banking_URL>"
	When The user clicks submit
	Then The user should have made a new acct
	Examples:
		|username|password|Account_Title|Description|Initial_Balance|Account_Number|Contact_Person|Phone|Internet_Banking_URL|
		|demo@techfios.com|abc123|Tony's_Bank'|Checking|$100000|cd6545664|JohnDoe|(548)456-5794|https://www.BOA.com|
		