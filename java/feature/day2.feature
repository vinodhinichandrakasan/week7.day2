Feature: Create Lead in leaftaps application

@Smoke @Sanity
Scenario: Create Lead with mandatory info
#Given Open the Chrome browser
#And Load the application url 'http://leaftaps.com/opentaps'
Given Enter the username 'Demosalesmanager'
And Enter the password 'crmsfa'
When Click on Login button
Then Homepage should be displayed

