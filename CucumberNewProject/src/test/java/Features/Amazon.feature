Feature: Amazon.com
  Scenario: Amazon.com Adding Product
    Given User is on homepage
    When Click accept cookies
    When Click the search button
    When Write product name
    When Click search button
    When Filter for Shipped by Amazon
    When Filter for Apple
    When Click the first product
    When Add to Cart
    When Check at cart page
