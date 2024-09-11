
Feature: OrangeLive Login
	
	@tag1
	Scenario: User able to login with valid credentials 
	Given: Open OrangeLive URL in any browser
	When: User type valid username and password
	And: Click login button
	When: User successfully logged in
	Then: System should show successfully complete message

  @tag2
  Scenario Outline: FB login with multiple credentials
    Given Open OrangeLive url using any browser
    When User type "<username>" and "<password>"
    And Click on login button
    Then System should display error message


    Examples: 
    	| username     								| password				       |
      | test233dsa432@yahoo.com     | ^d@sf34532resd         |
      | test23sdgsdgds432@gmail.com | ^dsdgdsgf34532resd     |
      | test233dsa432@yahoo.com     | jkmnd@ssdgsdg34532resd |
