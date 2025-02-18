#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Verify The Checkout Service 

@BuyProduct 
Scenario: Buying Product
Given User is in GreenCart Landing Page
When  User Search with products name 'Cucu'
And   Enter The product Qty as "3" and add to Cart
And   Select Cart and Proceed to Checkout 
Then  Verify Apply and place Order buttons presence 
