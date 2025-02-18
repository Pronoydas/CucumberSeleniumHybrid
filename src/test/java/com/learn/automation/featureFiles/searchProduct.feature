Feature: Verify The Serach Product Functionlity 

@SearchProduct
Scenario Outline: Searching Products
Given User is in GreenCart Landing Page
When  User Search with products short name <Name>
Then  User Search for same Product <Name> in OfferPage 
And   Verify the Product name 

Examples:
| Name |
| Tom  |
| Beet |