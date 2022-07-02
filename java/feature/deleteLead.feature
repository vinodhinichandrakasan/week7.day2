Feature: DeleteLead scenario for the LeafTaps application
@functional @regression
Scenario Outline: DeleteLead to leaftaps app
#Given initialize and open chrome browser
#Given enter the application Url<url>
Given provide the username<UName>
Given provide the password<password>
When click the Login_button
When click the lead_button
When click on find_Lead button
Given search with the phoneNumber<phNumber>
When click on the delete button
Given verify the record is not present<data>


Examples:
|url|UName|password|phNumber|data|
|'http://leaftaps.com/opentaps/control/main'|'DemoSalesManager'|'crmsfa'|'8610783341'|'No records to display'|
#|'http://leaftaps.com/opentaps/control/main'|'DemoSalesManager'|'crmsfa'|'8610783341'|'No records to display'|