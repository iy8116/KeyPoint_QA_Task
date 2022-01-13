@hover
Feature: Hover feature


  Scenario: Hover button verification
    Given the user is on the ToolsQA main page
    When the user clicks Widgets
    And the user clicks ToolTips
    And the user hovers  on the button
    Then the user should see "You hovered over the Button" message next to button

  Scenario: Hover text field verification
    Given the user is on the ToolsQA main page
    When the user clicks Widgets
    And the user clicks ToolTips
    And the user hovers  on the text field
    Then the user should see "You hovered over the text field" message