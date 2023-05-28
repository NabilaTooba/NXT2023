Feature: validate facebook signup page

Scenario: Validate facebook signup page

Given User visit facebook homepage
When User click Learn more, Terms, Privacy policy,cookies policy and Already have an account
Then User should be able to redirect to respective page.