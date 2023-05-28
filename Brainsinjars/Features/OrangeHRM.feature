Feature: Validate select method of OrangeHRM

Scenario Outline: Validate select method of OrangeHRM

Given user visits OrangeHRM homepage
When user click on Contact Sales and types "<Full_Name>","<Phone_Number>","<Business Email>"
When User select Country and Number of Employees
When User type"<Job_Title>","<Your_Message>"

Examples:
 |Full_Name|Phone_Number|Business Email|Job_Title|Your_Message|
 |Nabila Tabassum Tooba|0406378371|tabassumnabila254@gmail.com|Product Owner|I need some product|