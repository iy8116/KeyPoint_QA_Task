Feature: Droppable feature

  @drop
  Scenario: Drag & Drop Box verification
    Given the user is on the ToolsQA main page
    When the user clicks Interactions
    And the user clicks Droppable
    And the user drags the box and drops the dropbox.
    Then the user verifies the box dragged & dropped.