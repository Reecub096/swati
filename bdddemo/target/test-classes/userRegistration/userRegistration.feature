#Author: rishabh.sinha@capgemini.com

Feature: User Registration

	Scenario: Check the title of the page
		Given User is on Registration Page
		Then Check the heading of the page
		
		Scenario: User Enters all valid data
		Given User is on Registration Page
		When User enters all valid data
		And Clicks on Submit Button
		Then Show Success Page
		
	Scenario: User leaves username empty
		Given User is on Registration Page
		When User leaves username empty
		And Clicks on Submit Button
		Then Display Error Message
		
		Scenario: User leaves password empty
		Given User is on Registration Page
		When User leaves Password empty
		And Clicks on Submit Button
		Then Display Error Message
		
		Scenario: User leaves confirm password empty
		Given User is on Registration Page
		When User leaves Password empty
		And Clicks on Submit Button
		Then Display Error Message
		
		Scenario: User leaves confirm password empty
		Given User is on Registration Page
		When User leaves Confirm Password empty
		And Clicks on Submit Button
		Then Display Error Message
		
		Scenario: User leaves First Name empty
		Given User is on Registration Page
		When User leaves First Name empty
		And Clicks on Submit Button
		Then Display Error Message
		
		Scenario: User leaves Last Name empty
		Given User is on Registration Page
		When User leaves Last Name empty
		And Clicks on Submit Button
		Then Display Error Message
		
		Scenario: User does not select gender
		Given User is on Registration Page
		When User does not select gender
		And Clicks on Submit Button
		Then Display Error Message
		
		Scenario: User leaves Date of Birth empty
		Given User is on Registration Page
		When User leaves DOB empty
		And Clicks on Submit Button
		Then Display Error Message
		
			Scenario: User leaves Email empty
		Given User is on Registration Page
		When User leaves Email empty
		And Clicks on Submit Button
		Then Display Error Message
		
			Scenario: User leaves address empty
		Given User is on Registration Page
		When User leaves address empty
		And Clicks on Submit Button
		Then Display Error Message
		
			Scenario: User does not select gender
		Given User is on Registration Page
		When User does not select gender
		And Clicks on Submit Button
		Then Display Error Message
		
			Scenario: User does not select city
		Given User is on Registration Page
		When User does not select city
		And Clicks on Submit Button
		Then Display Error Message
		
			Scenario: User leaves Phone empty
		Given User is on Registration Page
		When User leaves phone empty
		And Clicks on Submit Button
		Then Display Error Message
		
		Scenario: User does not select Hobbies
		Given User is on Registration Page
		When User does not select hobbies
		And Clicks on Submit Button
		Then Display Error Message
 