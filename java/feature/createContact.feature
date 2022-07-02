Feature: DeleteLead scenario for the LeafTaps application
@functional @Smoke @Regression
Scenario Outline: DeleteLead to leaftaps app
Given initialize chrome browser
Given enter the application_Url<url>
Given provide the data for user_name<UserName>
Given provide the passworddata<password>
When click the Login_button available 
When click the CRM Link
When click the contact_button
Given Enter FirstName Locator<Name>
Given  Enter LastName Field Using id Locator<LastName>
Given Enter First local Field Using id Locator<LocalName>
Given Enter LastName Local Field Locator<LastLocalName>
Given  Enter Department Field<deptName>
Given  Enter Description Field<Descr>
Given Enter your email in the E-mail address<email>
Then select the province
Then click submit_button

Examples:
|url|UserName|password|Name|LastName|LocalName|LastLocalName|deptName|Descr|email|
|'http://leaftaps.com/opentaps/control/main'|'DemoSalesManager'|'crmsfa'|'vinodhini'|'chan'|'tes'|'data'|'testing'|'create a new contact'|'tester@gmail.com'|
|'http://leaftaps.com/opentaps/control/main'|'DemoSalesManager'|'crmsfa'|'MS'|'chandr'|'tr'|'jonny'|'test dept'|'create a new contact'|'test@gmail.com'|