@regression
Feature: Job Search Test
  As user I want to job search into CV Library website

  @smoke
  Scenario Outline: verify Job Search Result Using Different Data Set
    Given I am on homepage
    When I click on accept cookies
    And I Enter job title "<jobTitle>"
    And I Enter location "<location>"
    And I Select distance "<distance>"
    And I click on more search option
    And I Enter minimum salary "<salarymin>"
    And I Enter maximum salary "<salarymax>"
    And I select from salary type "<salarytype>"
    And I select from job type "<jobtype>"
    And I click on find job button
    Then I should see the Result page "<result>"
    Examples:
      | jobTitle | location   | distance | salarymin | salarymax | salarytype | jobtype   | result                              |
      | Tester   | Harrow     | 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Tester jobs in Harrow     |
      | Tester   | Wembley    | 10 miles | 20000     | 50000     | Per annum  | Permanent | Permanent Tester jobs in Wembley    |
      | Tester   | London     | 15 miles | 25000     | 60000     | Per annum  | Permanent | Permanent Tester jobs in London     |
      | Tester   | Cardiff    | 20 miles | 35000     | 80000     | Per annum  | Permanent | Permanent Tester jobs in Cardiff    |
      | Tester   | Scotland   | 25 miles | 40000     | 75000     | Per annum  | Permanent | Permanent Tester jobs in Scotland   |
      | Tester   | Manchester | 50 miles | 45000     | 95000     | Per annum  | Permanent | Permanent Tester jobs in Manchester |