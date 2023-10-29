Feature: application login
Scenario: salesfore application login

Given Initialize browser
When user navigates url
And user enter username and password and click on login
Then user should be login successfully