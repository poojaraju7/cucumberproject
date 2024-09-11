Feature: OrangeLive Login

	Scenario: User able to login with valid credentials 
	Given: Open OrangeLive URL in any browser
	When: User type valid username and password
	And: Click login button
	When: User successfully logged in
	Then: System should show successfully complete message
