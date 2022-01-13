Feature: Login Functionality

  @login
  Scenario Outline: As a user, I should be able to login with different users using their valid emails and
  passwords. When I login, I should be able to see "Product" header on homepage.

    Given User is on the swaglabs login page
    When User enters username "<email>"
    And User enters password "secret_sauce"
    And User click login button
    Then User should see "PRODUCTS" header on the homepage

    Examples:
      | email                   |
      | standard_user           |
#      | locked_out_user         | found a bug (invalid user)
      | problem_user            |
      | performance_glitch_user |
