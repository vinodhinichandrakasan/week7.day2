Feature: EditLead scenario for the LeafTaps application

@Smoke @Regression
Scenario Outline: EditLead to leaftaps app
Given open chrome browser
Given enter application Url<url>
Given give the username<username>
Given give the password<password>
When click on the Loginbutton
When click the lead button
When click on findLead button
Given search with the firstname<fname>
When click on the edit button
Given update the companyName<cName>


Examples:
|url|username|password|fname|cName|
|'http://leaftaps.com/opentaps/control/main'|'DemoSalesManager'|'crmsfa'|'Vinodhini'|'Infy'|
|'http://leaftaps.com/opentaps/control/main'|'DemoSalesManager'|'crmsfa'|'MS'|'Infy'|