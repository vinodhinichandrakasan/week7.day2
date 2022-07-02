Feature: Login scenario for the LeafTaps application
@Smoke @Sanity
Scenario Outline: Login to leaftaps app
#Given launch the chrome browser
#Given launch the application Url<url>
Given enter the username<username>
Given enter the password<password>
When click on Loginbutton
When click a lead button
Then click a create lead button
Given enter companyName <companyName>
Given enter firstName <firstName>
Given enter LastName <lastName>
Given enter departmentName <deptName>
Given enter the description<descr>
Given enter PhoneNumber <phoneNumber>
Given enter primaryEmail <email_Id>
When select city from dropdown
When click create lead submit button

Examples:
|url|username|password|companyName|firstName|lastName|deptName|descr|phoneNumber|email_Id|
|'http://leaftaps.com/opentaps/control/main'|'DemoSalesManager'|'crmsfa'|'Dedalus'|'Vinodhini'|'Test'|'Testing'|'test data added'|'8610783341'|'vinodhinipriya97@gmail.com'|
#|'http://leaftaps.com/opentaps/control/main'|'DemoSalesManager'|'crmsfa'|'TCs'|'MS'|'vino'|'commerce'|'lead data added'|'8610783341'|'tester@gmail.com'|