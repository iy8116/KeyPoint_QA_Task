@alert
Feature: Alerts Feature

  Background:
    Given the user is on the ToolsQA main page
    When the user clicks Alerts, Frame  & Windows
    And the user clicks Alerts button

  Scenario: Alerts-1 handling
    And the user clicks first Click me button
    Then the user should clicks OK button from the alert

  Scenario: Alerts-2 handling
    And the user clicks second Click me button
    Then the user should clicks OK button from the alert

  Scenario: Alerts-3 handling
    And the user clicks third Click me button
    Then the user should clicks OK button from the alert
    And the user should see You selected Ok text message

  Scenario: Alerts-4 handling
    And the user clicks fourth Click me button
    And the user input Ibrahim
    Then the user should clicks OK button from the alert
    And the user should see You entered Ibrahim text message


