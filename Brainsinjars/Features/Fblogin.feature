Feature: Validate FB Login

Scenario Outline: FB Login

Given user visits Fb Login page

When user types "<emailaddress>" and "<password>" and user click on Login button

Then User will be directed to Facebook account page

Examples: 
|emailaddress|password|
|brainsinjars8@yahoo.com|Nexttechnano|