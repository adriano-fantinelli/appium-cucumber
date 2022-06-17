@tasks
Feature: Create task

  Scenario Outline: Successfully create task
    Given User see the To Do List
    And User access the Add Task Screen
    And User put title value <titleValue>
    And User put description value <descriptionValue>
    And User put due by value to tomorrow
    And User click on add task
    When User click on the created task
    Then The tasks should be created with the title value <titleValue>
    And The tasks should be created with the description value <descriptionValue>
    Examples:
      | titleValue | descriptionValue     |
      | "NEW TASK" | "This is a new task" |