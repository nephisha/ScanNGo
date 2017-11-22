Feature: Login
  As a User
  I should be able to access the Scan And Go app with valid credentials

  Scenario Outline: Login to Application
    Given I enter the Scan and Go application with <email> and <password>
    When I press the login button
    Then I should be able to see the welcome page

    Examples:
      | email          | password |
      | john@gmail.com | 123456   |

  Scenario Outline: Verify Home Page
    Given I enter the Scan and Go application with <email> and <password>
    When I press the login button
    Then I should be able to see the welcome page
    And When I accept the terms and conditions
    Then I should be able to see the Home Page

    Examples:
      | email          | password |
      | john@gmail.com | 123456   |

  Scenario Outline: Verify Menu Page
    Given I enter the Scan and Go application with <email> and <password>
    When I press the login button
    Then I should be able to see the welcome page
    And When I accept the terms and conditions
    Then I should be able to see the Home Page
    And When I tap the Menu
    Then I should be able to see all the Menu Items

    Examples:
      | email          | password |
      | john@gmail.com | 123456   |

  Scenario Outline: Scan an Item
    Given I enter the Scan and Go application with <email> and <password>
    When I press the login button
    Then I should be able to see the welcome page
    And When I accept the terms and conditions
    Then I should be able to see the Home Page
    And When I tap the Scan Icon
    Then I should be able to see the Scanner Screen

    Examples:
      | email          | password |
      | john@gmail.com | 123456   |