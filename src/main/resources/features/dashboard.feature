Feature: Dashboards

  Scenario: Adding new dashboard
    Given I navigate to Interview Prep
    Then I should see the "Login" page
    Then I enter "admin@yahoo.com" in the "Enter Username" input box
    Then I enter "adminuser123" in the "Enter Password" input box
    Then I click "Login" button
    Then I should see the "Home" page
    Then I verify the following dashboards are displayed:
      | All Topics  |
      | Coding      |
      | Soft skills |
      | Cucumber    |
      | Java        |
      | Jmeter      |
      | API         |
      | SQL         |
      | Github      |
    Then I enter "Khali" in the "New dashboard" input box
    Then I click "+ Add" button
    Then I verify the following dashboards are displayed:
      | All Topics  |
      | Coding      |
      | Soft skills |
      | Cucumber    |
      | Java        |
      | Jmeter      |
      | API         |
      | SQL         |
      | Github      |
      | Khali       |
    Then I enter "Khali" in the "New dashboard" input box
    Then I click "+ Add" button
    Then I should see "already exists" error message
    Then I delete the following dashboard:
      | Khali |






    Given I navigate to Interview Prep
    Given I navigate to Interview Prep
    Then I should see the "Login" page
    Then I enter "admin@yahoo.com" in the "Email" input box
    Then I enter "adminuser123" in the "Password" input box
    And I click "Login" button
    Then I should see the "Home" page
    And I click "Manage Access" link
    Then I enter the following values in the following fields
      | First Name | John                 |
      | Last Name  | Smith                |
      | Email      | john.smith@gmail.com |
    And I choose "Student" from dropdown "Role"
    And I choose "4" from dropdown "Batch"
    And I click "Add User" button
    And I click "Action" button of user "john.smith@gmail.com"
    And I click "Delete" button

