@Regression1
Feature: Read Data from dataTable
  I want to use dataTable for my feature file

  Scenario: Read table data
    Given Read the table data
      |siddhant|awasthi|30|
      |shantanu|shukla|25|
      |amar|katyayan|24|
    Then Move forward
    And Close the code