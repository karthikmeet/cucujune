@karthik
Feature: June FB login

  Scenario: June FB Two
    Given Open facebook and launch
    When Enter data table values
      | Username  | Password |
      | Muthumari | Mi       |
      | Narmadha  | Na       |
      | Anitha    | Aa       |
    Then Close the browser
