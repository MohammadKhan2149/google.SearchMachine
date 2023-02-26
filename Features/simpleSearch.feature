Feature: Searching products 


Scenario Outline: Searching products on google


Given I am on the google hompage


When I enter the "<product name>"

And I click on the search button

Then I see the related search results succesfully

Example:
|Product_name |
| football |
| computr |