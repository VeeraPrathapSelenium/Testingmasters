Feature: Facebook smoke test 


Scenario: verify the facebook credentials with valid input 
	Given open firefox and enter the url 
	When The user enter valid credentials 
	Then verify and take screen shot of the application 
	

	Scenario: verify the facebook credentials with valid input 
	Given open firefox and enter the url 
	When The user enter invalid credentials 
	Then verify and take screen shot of the application 
	