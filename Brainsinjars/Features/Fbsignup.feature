Feature: Validate FB signup

Scenario Outline: FB creating a new account

Given user visits fb signup page

When user types "<firstname>", "<lastname>", "<emailaddress>" , retype "<emailaddress>" and "<password>"

When User select  Month and  Day and Year
When user click gender 

When User click on Signup button

Then User will able to go SignUp page

Examples:
|firstname|lastname|emailaddress|emailaddress|password|
|Brains|injars|brainsinjars8@yahoo.com|brainsinjars8@yahoo.com|Nextechnano|