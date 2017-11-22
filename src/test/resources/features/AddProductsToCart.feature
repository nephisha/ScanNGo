Feature: Add Products to Cart

  Scenario Outline: Add 1 Product to Cart
    Given I enter the Scan and Go application with <email> and <password>
    When I press the login button
    Then I should be able to see the welcome page
    And When I accept the terms and conditions
    Then I should be able to see the Home Page
    When I open the scanner
    And I enter the <barcode> manually
    Then I should see the product <productName> <price> <cents> added to the cart

    Examples:
      | email          | password | barcode     |                   productName                       |price|cents|
      | john@gmail.com | 123456   |4210201002994| Oral B Professional Care Powered Toothbrush 500 each|  99 | 99  |
