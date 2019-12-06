Feature: Transaction search

  @login
  Scenario: User should able to login successfully and able to search for the transaction number,
    So that he can view all related transactions in search history

    Given user is on log in page
    When user enters valid credentials
    And click on Sign in button
    Then user is logged in and on homepage
    And user clicks on "Transaction Search" link
    Then user should able to navigate to search page successfully
    When user enters transaction number as "CA001111/P01"
    And click on search button
    Then user should able to see all related transactions for "CA001111/P01"