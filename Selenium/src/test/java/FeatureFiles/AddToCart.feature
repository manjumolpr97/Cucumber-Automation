Feature: Search and Add a product to cart 

@SeleniumSmoke
Scenario: Add to cart

When The mobiles are listed
Then The user select the required mobile from the list
And The product details page is displayed
Then The user click on Add to cart button

